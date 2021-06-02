package com.example.ticket.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Controller advice class for handling errors.
 *
 * @author Raul Gutierrez.
 */
@RestControllerAdvice
public class ErrorResolver {

  /**
   * @param ex  of type Exception.
   * @return a ErrorResponse object.
   */
  @ExceptionHandler(IllegalArgumentException.class)
  @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
  public ErrorResponse unProcessableException(Exception ex) {
    ErrorResponse response = generateException(ex, HttpStatus.UNPROCESSABLE_ENTITY);
    return response;
  }

  /**
   * Method for generate the object ErrorResponse and set values necessaries.
   *
   * @param ex     of type Exception.
   * @param status of type HttpStatus.
   * @return an ErrorResponse.
   */
  private ErrorResponse generateException(Exception ex, HttpStatus status) {
    ErrorResponse response = new ErrorResponse();
    response.setMessage(ex.getMessage());
    response.setStatus(status.value());
    return response;
  }

}
