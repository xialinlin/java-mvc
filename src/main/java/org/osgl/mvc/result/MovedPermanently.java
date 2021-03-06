package org.osgl.mvc.result;

import org.osgl.http.Http;
import org.osgl.util.S;

public class MovedPermanently extends RedirectBase {

    private static MovedPermanently _INSTANCE = new MovedPermanently() {
        @Override
        protected String url() {
            return payload().message;
        }

        @Override
        public long timestamp() {
            return payload().timestamp;
        }
    };

    private MovedPermanently() {
        super(Http.Status.MOVED_PERMANENTLY);
    }

    public MovedPermanently(String url) {
        super(Http.Status.MOVED_PERMANENTLY, url);
    }

    public MovedPermanently(String url, Object... args) {
        this(S.fmt(url, args));
    }

    public static MovedPermanently of(String url) {
        touchPayload().message(url);
        return _INSTANCE;
    }

    public static MovedPermanently of(String url, Object... args) {
        touchPayload().message(url, args);
        return _INSTANCE;
    }

}
