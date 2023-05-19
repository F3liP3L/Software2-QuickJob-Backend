package co.edu.uco.quickjob.crosscutting.exception;

import co.edu.uco.crosscutting.exception.GeneralException;

public class QuickJobException extends GeneralException {
    protected QuickJobException(String userMessage, String technicalMessage, Exception rootException) {
        super(userMessage, technicalMessage, rootException);
    }
}

