package org.osgl.mvc.result;

import static org.osgl.http.H.Status.NOT_ACCEPTABLE;

/**
 * The requested resource is capable of generating only content not acceptable according to the
 * Accept headers sent in the request.
 * See <a href="https://en.wikipedia.org/wiki/Content_negotiation">Content negotiation</a>.
 */
public class NotAcceptable extends ErrorResult {

    /**
     * The static instance of NotAcceptable result.
     */
    public static final NotAcceptable INSTANCE = new NotAcceptable();

    private static final NotAcceptable _INSTANCE = new NotAcceptable() {
        @Override
        public String getMessage() {
            return payload().message;
        }

        @Override
        public Integer errorCode() {
            return payload().errorCode;
        }

        @Override
        public long timestamp() {
            return payload().timestamp;
        }
    };

    public NotAcceptable() {
        super(NOT_ACCEPTABLE);
    }

    public NotAcceptable(int errorCode) {
        super(NOT_ACCEPTABLE, errorCode);
    }

    public NotAcceptable(String message, Object... args) {
        super(NOT_ACCEPTABLE, message, args);
    }

    public NotAcceptable(int errorCode, String message, Object... args) {
        super(NOT_ACCEPTABLE, errorCode, message, args);
    }
    /**
     * Returns a static NotAcceptable instance and set the {@link #payload} thread local
     * with default message.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @return a static NotAcceptable instance as described above
     */
    public static NotAcceptable get() {
        return _localizedErrorMsg() ? of(defaultMessage(NOT_ACCEPTABLE)) : INSTANCE;
    }

    /**
     * Returns a static NotAcceptable instance and set the {@link #payload} thread local
     * with default message.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param errorCode the app defined error code
     * @return a static NotAcceptable instance as described above
     */
    public static NotAcceptable of(int errorCode) {
        touchPayload().errorCode(errorCode);
        return _localizedErrorMsg() ? of(defaultMessage(NOT_ACCEPTABLE)) : INSTANCE;
    }

    /**
     * Returns a static NotAcceptable instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param message the message
     * @param args the message arguments
     * @return a static NotAcceptable instance as described above
     */
    public static NotAcceptable of(String message, Object... args) {
        touchPayload().message(message, args);
        return _INSTANCE;
    }

    /**
     * Returns a static NotAcceptable instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @param message the message
     * @param args the message arguments
     * @return a static NotAcceptable instance as described above
     */
    public static NotAcceptable of(Throwable cause, String message, Object... args) {
        touchPayload().message(message, args).cause(cause);
        return _INSTANCE;
    }

    /**
     * Returns a static NotAcceptable instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @return a static NotAcceptable instance as described above
     */
    public static NotAcceptable of(Throwable cause) {
        touchPayload().cause(cause);
        return _INSTANCE;
    }

    /**
     * Returns a static NotAcceptable instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param errorCode the app defined error code
     * @param message the message
     * @param args the message arguments
     * @return a static NotAcceptable instance as described above
     */
    public static NotAcceptable of(int errorCode, String message, Object... args) {
        touchPayload().errorCode(errorCode).message(message, args);
        return _INSTANCE;
    }

    /**
     * Returns a static NotAcceptable instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @param errorCode the app defined error code
     * @param message the message
     * @param args the message arguments
     * @return a static NotAcceptable instance as described above
     */
    public static NotAcceptable of(int errorCode, Throwable cause, String message, Object... args) {
        touchPayload().errorCode(errorCode).message(message, args).cause(cause);
        return _INSTANCE;
    }
}
