package org.osgl.mvc.result;

import static org.osgl.http.H.Status.UNSUPPORTED_MEDIA_TYPE;

/**
 * The request entity has a media type which the server or resource does not support. For
 * example, the client uploads an image as image/svg+xml, but the server requires that images use
 * a different format.
 */
public class UnsupportedMediaType extends ErrorResult {

    /**
     * The static instance of UnsupportedMediaType result.
     */
    public static final UnsupportedMediaType INSTANCE = new UnsupportedMediaType();

    private static final UnsupportedMediaType _INSTANCE = new UnsupportedMediaType() {
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

    public UnsupportedMediaType() {
        super(UNSUPPORTED_MEDIA_TYPE);
    }

    public UnsupportedMediaType(int errorCode) {
        super(UNSUPPORTED_MEDIA_TYPE, errorCode);
    }

    public UnsupportedMediaType(String message, Object... args) {
        super(UNSUPPORTED_MEDIA_TYPE, message, args);
    }

    public UnsupportedMediaType(int errorCode, String message, Object... args) {
        super(UNSUPPORTED_MEDIA_TYPE, errorCode, message, args);
    }
    /**
     * Returns a static UnsupportedMediaType instance and set the {@link #payload} thread local
     * with default message.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @return a static UnsupportedMediaType instance as described above
     */
    public static UnsupportedMediaType get() {
        return _localizedErrorMsg() ? of(defaultMessage(UNSUPPORTED_MEDIA_TYPE)) : INSTANCE;
    }

    /**
     * Returns a static UnsupportedMediaType instance and set the {@link #payload} thread local
     * with default message.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param errorCode the app defined error code
     * @return a static UnsupportedMediaType instance as described above
     */
    public static UnsupportedMediaType of(int errorCode) {
        touchPayload().errorCode(errorCode);
        return _localizedErrorMsg() ? of(defaultMessage(UNSUPPORTED_MEDIA_TYPE)) : INSTANCE;
    }

    /**
     * Returns a static UnsupportedMediaType instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param message the message
     * @param args the message arguments
     * @return a static UnsupportedMediaType instance as described above
     */
    public static UnsupportedMediaType of(String message, Object... args) {
        touchPayload().message(message, args);
        return _INSTANCE;
    }

    /**
     * Returns a static UnsupportedMediaType instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @param message the message
     * @param args the message arguments
     * @return a static UnsupportedMediaType instance as described above
     */
    public static UnsupportedMediaType of(Throwable cause, String message, Object... args) {
        touchPayload().message(message, args).cause(cause);
        return _INSTANCE;
    }

    /**
     * Returns a static UnsupportedMediaType instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @return a static UnsupportedMediaType instance as described above
     */
    public static UnsupportedMediaType of(Throwable cause) {
        touchPayload().cause(cause);
        return _INSTANCE;
    }

    /**
     * Returns a static UnsupportedMediaType instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param errorCode the app defined error code
     * @param message the message
     * @param args the message arguments
     * @return a static UnsupportedMediaType instance as described above
     */
    public static UnsupportedMediaType of(int errorCode, String message, Object... args) {
        touchPayload().errorCode(errorCode).message(message, args);
        return _INSTANCE;
    }

    /**
     * Returns a static UnsupportedMediaType instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @param errorCode the app defined error code
     * @param message the message
     * @param args the message arguments
     * @return a static UnsupportedMediaType instance as described above
     */
    public static UnsupportedMediaType of(int errorCode, Throwable cause, String message, Object... args) {
        touchPayload().errorCode(errorCode).message(message, args).cause(cause);
        return _INSTANCE;
    }
}
