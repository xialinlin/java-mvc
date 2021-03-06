package org.osgl.mvc.result;

import org.osgl.http.H;
import org.osgl.http.Http;
import org.osgl.util.S;

/**
 * Render a text message
 */
public class RenderText extends RenderContent {

    private static RenderText _INSTANCE = new RenderText() {
        @Override
        public String content() {
            return payload().message;
        }

        @Override
        public Http.Status status() {
            Http.Status status = payload().status;
            return null == status ? super.status() : status;
        }

        @Override
        public long timestamp() {
            return payload().timestamp;
        }
    };

    private static RenderText _INSTANCE2 = new RenderText() {
        @Override
        public String content() {
            return payload().message;
        }

        @Override
        public H.Format format() {
            return payload().format;
        }
    };

    private RenderText() {
        super(H.Format.TXT);
        setOutputEncoding(false);
    }

    public RenderText(String text, Object... args) {
        super(S.fmt(text, args), H.Format.TXT, false);
    }

    public RenderText(H.Format fmt, String text, Object... args) {
        super(S.fmt(text, args), fmt, false);
    }


    public RenderText(H.Status status, String text, Object... args) {
        super(status, S.fmt(text, args), H.Format.TXT, false);
    }

    public RenderText(H.Status status, H.Format fmt, String text, Object... args) {
        super(status, S.fmt(text, args), fmt, false);
    }

    public static RenderText of(String text) {
        touchPayload().message(text);
        return _INSTANCE;
    }

    public static RenderText of(String text, Object... args) {
        touchPayload().message(text, args);
        return _INSTANCE;
    }

    public static RenderText of(H.Format fmt, String text, Object... args) {
        touchPayload().message(text, args).format(fmt);
        return _INSTANCE2;
    }

    public static RenderText of(H.Status status, String text) {
        touchPayload().message(text).status(status);
        return _INSTANCE;
    }

    public static RenderText of(H.Status status, String text, Object... args) {
        touchPayload().message(text, args).status(status);
        return _INSTANCE;
    }

    public static RenderText of(H.Status status, H.Format fmt, String text, Object... args) {
        touchPayload().message(text, args).format(fmt).status(status);
        return _INSTANCE2;
    }
}
