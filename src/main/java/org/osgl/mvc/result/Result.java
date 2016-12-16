package org.osgl.mvc.result;

import org.osgl.exception.FastRuntimeException;
import org.osgl.http.H;
import org.osgl.http.Http;
import org.osgl.mvc.MvcConfig;
import org.osgl.mvc.util.ResultTransformer;
import org.osgl.util.IO;
import org.osgl.util.S;

public class Result extends FastRuntimeException {

    private final Http.Status status;
    protected ResultTransformer transformer;

    protected Result() {status = null;}

    protected Result(Http.Status status) {
        this.status = status;
    }

    protected Result(Http.Status status, String message) {
        super(message);
        this.status = status;
    }

    protected Result(Http.Status status, String message, Object... args) {
        super(message, args);
        this.status = status;
    }

    protected Result(Http.Status status, Throwable cause) {
        super(cause);
        this.status = status;
    }

    protected Result(Http.Status status, Throwable cause, String message, Object... args) {
        super(cause, message, args);
        this.status = status;
    }

    public void setTransformer(ResultTransformer transformer) {
        this.transformer = transformer;
    }

    public ResultTransformer getTransformer() {
        return transformer;
    }

    public Http.Status status() {
        return status;
    }

    public int statusCode() {
        return status().code();
    }

    protected final void applyStatus(H.Response response) {
        response.status(statusCode());
    }

    protected final void applyBeforeCommitHandler(H.Request req, H.Response resp) {
        MvcConfig.applyBeforeCommitResultHandler(this, req, resp);
    }

    protected final void applyAfterCommitHandler(H.Request req, H.Response resp) {
        MvcConfig.applyAfterCommitResultHandler(this, req, resp);
    }

    protected void applyMessage(H.Request request, H.Response response) {
        String msg = getMessage();
        applyBeforeCommitHandler(request, response);
        if (null != transformer) {
            transformer.transform(msg, response);
        } else  if (S.notBlank(msg)) {
            response.writeContent(msg);
        } else {
            IO.close(response.outputStream());
        }
        applyAfterCommitHandler(request, response);
    }

    public void apply(H.Request req, H.Response resp) {
        applyStatus(resp);
        applyMessage(req, resp);
    }

}
