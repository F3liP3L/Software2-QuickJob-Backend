package co.edu.uco.quickjob.crosscutting.exception;

import co.edu.uco.crosscutting.exception.GeneralException;
import co.edu.uco.quickjob.crosscutting.exception.enumeration.ExceptionLocation;
import co.edu.uco.quickjob.crosscutting.exception.enumeration.ExceptionType;

import static co.edu.uco.crosscutting.util.UtilObject.getUtilObject;

public class QuickJobCustomException extends GeneralException {
    private ExceptionType type;
    private ExceptionLocation localation;
    protected QuickJobCustomException(String userMessage, String technicalMessage, Exception rootException, ExceptionType type, ExceptionLocation localation) {
        super(userMessage, technicalMessage, rootException);
        setLocalation(localation);
        setType(type);
    }

    public static QuickJobCustomException buildUserException(String userMessage) {
        return new QuickJobCustomException(userMessage, userMessage, null, ExceptionType.BUSINESS, null);
    }

    public static QuickJobCustomException buildTechnicalException(String technicalMessage) {
        return new QuickJobCustomException(null, technicalMessage, null, ExceptionType.TECHNICAL, null);
    }

    public static QuickJobCustomException buildTechnicalException(String technicalMessage, Exception rootException, ExceptionLocation location) {
        return new QuickJobCustomException(null, technicalMessage, rootException, ExceptionType.TECHNICAL, location);
    }

    public static QuickJobCustomException buildTechnicalRepositoryException(String technicalMessage) {
        return new QuickJobCustomException(null, technicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.REPOSITORY);
    }

    public static QuickJobCustomException buildTechnicalServiceException(String technicalMessage) {
        return new QuickJobCustomException(null, technicalMessage, null, ExceptionType.TECHNICAL, ExceptionLocation.SERVICE);
    }

    public static QuickJobCustomException buildServiceException(String businessMessage) {
        return new QuickJobCustomException(businessMessage, null, null, ExceptionType.BUSINESS, ExceptionLocation.SERVICE);
    }

    public static QuickJobCustomException buildTechnicalRepositoryException(String technicalMessage, Exception rootException) {
        return new QuickJobCustomException(null, technicalMessage, rootException, ExceptionType.TECHNICAL, ExceptionLocation.REPOSITORY);
    }

    public static QuickJobCustomException build(String userMessage, String technicalMessage) {
        return new QuickJobCustomException(userMessage, technicalMessage, null, null, null);
    }

    public static QuickJobCustomException build(String userMessage, String technicalMessage, Exception rootException) {
        return new QuickJobCustomException(userMessage, technicalMessage, rootException, null, null);
    }

    public ExceptionType getType() {
        return type;
    }

    public void setType(ExceptionType type) {
        this.type = getUtilObject().getDefaultIsNull(type, ExceptionType.GENERAL);
    }

    public ExceptionLocation getLocalation() {
        return localation;
    }

    public void setLocalation(ExceptionLocation localation) {
        this.localation = getUtilObject().getDefaultIsNull(localation, ExceptionLocation.GENERAL);
    }
}

