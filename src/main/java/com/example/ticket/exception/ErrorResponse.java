package com.example.ticket.exception;

import lombok.Data;

/**
 * ErrorResponse class is used for send information when the API failed.
 *
 * @author Raul Gutierrez.
 */
@Data
public class ErrorResponse {

  /**
   * Field of type String.
   */
  private String message;

  /**
   * Field of type int.
   */
  private int status;

}
