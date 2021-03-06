package org.osgl.mvc.result;

import org.osgl.http.Http;
import org.osgl.util.S;

public class SeeOther extends RedirectBase {

    private static SeeOther _INSTANCE = new SeeOther() {
        @Override
        protected String url() {
            return payload().message;
        }

        @Override
        public long timestamp() {
            return payload().timestamp;
        }
    };

    private SeeOther() {
        super(Http.Status.SEE_OTHER);
    }

    public SeeOther(String url) {
        super(Http.Status.SEE_OTHER, url);
    }

    public SeeOther(String url, Object... args) {
        this(S.fmt(url, args));
    }

    public static SeeOther of(String url) {
        touchPayload().message(url);
        return _INSTANCE;
    }

    public static SeeOther of(String url, Object... args) {
        touchPayload().message(url, args);
        return _INSTANCE;
    }

}
