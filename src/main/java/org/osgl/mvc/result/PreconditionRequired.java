package org.osgl.mvc.result;

import static org.osgl.http.H.Status.PRECONDITION_REQUIRED;

/**
 * The origin server requires the request to be conditional. Intended to prevent the 'lost update' problem, 
 * where a client GETs a resource's state, modifies it, and PUTs it back to the server, when meanwhile a 
 * third party has modified the state on the server, leading to a conflict."
 */
public class PreconditionRequired extends ErrorResult {

    /**
     * The static instance of PreconditionRequired result.
     */
    public static final PreconditionRequired INSTANCE = new PreconditionRequired();

    private static final PreconditionRequired _INSTANCE = new PreconditionRequired() {
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

    public PreconditionRequired() {
        super(PRECONDITION_REQUIRED);
    }

    public PreconditionRequired(String message, Object... args) {
        super(PRECONDITION_REQUIRED, message, args);
    }

    public PreconditionRequired(Throwable cause, String message, Object... args) {
        super(PRECONDITION_REQUIRED, cause, message, args);
    }

    public PreconditionRequired(Throwable cause) {
        super(PRECONDITION_REQUIRED, cause);
    }

    public PreconditionRequired(int errorCode) {
        super(PRECONDITION_REQUIRED, errorCode);
    }

    public PreconditionRequired(int errorCode, String message, Object... args) {
        super(PRECONDITION_REQUIRED, errorCode, message, args);
    }

    public PreconditionRequired(int errorCode, Throwable cause, String message, Object... args) {
        super(PRECONDITION_REQUIRED, errorCode, cause, message, args);
    }

    public PreconditionRequired(int errorCode, Throwable cause) {
        super(PRECONDITION_REQUIRED, errorCode, cause);
    }

    /**
     * Returns a static PreconditionRequired instance and set the {@link #payload} thread local
     * with default message.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @return a static PreconditionRequired instance as described above
     */
    public static PreconditionRequired get() {
        return _localizedErrorMsg() ? of(defaultMessage(PRECONDITION_REQUIRED)) : INSTANCE;
    }

    /**
     * Returns a static PreconditionRequired instance and set the {@link #payload} thread local
     * with default message.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param errorCode the app defined error code
     * @return a static PreconditionRequired instance as described above
     */
    public static PreconditionRequired of(int errorCode) {
        touchPayload().errorCode(errorCode);
        return _localizedErrorMsg() ? of(defaultMessage(PRECONDITION_REQUIRED)) : INSTANCE;
    }

    /**
     * Returns a static PreconditionRequired instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param message the message
     * @param args the message arguments
     * @return a static PreconditionRequired instance as described above
     */
    public static PreconditionRequired of(String message, Object... args) {
        touchPayload().message(message, args);
        return _INSTANCE;
    }

    /**
     * Returns a static PreconditionRequired instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @return a static PreconditionRequired instance as described above
     */
    public static PreconditionRequired of(Throwable cause) {
        touchPayload().cause(cause);
        return _INSTANCE;
    }

    /**
     * Returns a static PreconditionRequired instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause the cause
     * @param message the message
     * @param args the message arguments
     * @return a static PreconditionRequired instance as described above
     */
    public static PreconditionRequired of(Throwable cause, String message, Object... args) {
        touchPayload().message(message, args).cause(cause);
        return _INSTANCE;
    }

    /**
     * Returns a static PreconditionRequired instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param errorCode the app defined error code
     * @param message the message
     * @param args the message arguments
     * @return a static PreconditionRequired instance as described above
     */
    public static PreconditionRequired of(int errorCode, String message, Object... args) {
        touchPayload().errorCode(errorCode).message(message, args);
        return _INSTANCE;
    }


    /**
     * Returns a static PreconditionRequired instance and set the {@link #payload} thread local
     * with message specified.
     *
     * When calling the instance on {@link #getMessage()} method, it will return whatever
     * stored in the {@link #payload} thread local
     *
     * @param cause  the cause
     * @param errorCode the app defined error code
     * @param message the message
     * @param args the message arguments
     * @return a static PreconditionRequired instance as described above
     */
    public static PreconditionRequired of(int errorCode, Throwable cause, String message, Object... args) {
        touchPayload().errorCode(errorCode).message(message, args).cause(cause);
        return _INSTANCE;
    }
}
