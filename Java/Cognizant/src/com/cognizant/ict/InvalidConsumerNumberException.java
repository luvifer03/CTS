package com.cognizant.ict;

public class InvalidConsumerNumberException extends Exception {
    /**
     * Custom exception thrown when consumer number
     * does not satisfy the requirements
     * @param message The message should be thrown
     */
    public InvalidConsumerNumberException(String message) {
        super(message);
    }
}
