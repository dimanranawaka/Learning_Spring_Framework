package lk.ijse.spring.advisor;

import lk.ijse.spring.util.ResponseUtil;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// This is also a type of aspect
@RestControllerAdvice
public class AppWideExceptionHandler {

    // This method will invoke If Exception occurred inside the Controller methods

    @ExceptionHandler({RuntimeException.class})
    public ResponseUtil handleAllRuntimeExceptions(RuntimeException e){
        return new ResponseUtil("Error",e.getMessage(),null);

    }
}
