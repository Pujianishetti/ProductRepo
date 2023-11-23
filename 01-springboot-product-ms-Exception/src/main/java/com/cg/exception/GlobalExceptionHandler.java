package com.cg.exception;




 
import java.util.Date;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
 
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(ResourceNotFound.class)
	public ResponseEntity<?> resourceNotFound(ResourceNotFound ex,WebRequest request){
		ErrorDetail errorDetails=new ErrorDetail(new Date(),ex.getMessage(),request.getDescription(false));
		return new ResponseEntity<>(errorDetails,HttpStatus.NOT_FOUND);
	}
 
}
 