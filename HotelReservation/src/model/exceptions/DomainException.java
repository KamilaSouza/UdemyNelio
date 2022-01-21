package model.exceptions;

public class DomainException extends Exception { //or RuntimeException (don't need to deal with)

    public DomainException(String msg) {
        super(msg);
    }

}
