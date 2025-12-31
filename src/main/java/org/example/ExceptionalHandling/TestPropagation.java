package org.example.ExceptionalHandling;


class MyCustomException extends  Exception{
    MyCustomException(String message) {
        super(message);
    }
}

public class TestPropagation {

    void first() throws Exception {
        try {
            second();
        }
        catch (MyCustomException e) {
            // Wrapping exception and rethrowing
            throw new Exception("Exception rethrown from first()", e);
        }
    }
    void second() throws MyCustomException {
        throw new MyCustomException("Exception thrown from second()");
    }


}
