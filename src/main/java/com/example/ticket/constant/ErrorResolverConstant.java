package com.example.ticket.constant;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Class used for management the errors.
 *
 * @author Raul Gutierrez.
 */
@Getter
@Component
public class ErrorResolverConstant {

  /**
   * Constant for get the message of yml file.
   */
  @Value("${errorResolver.messages.businessValidationFailed}")
  private String businessValidationFailed;

}
