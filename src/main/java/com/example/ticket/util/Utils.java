package com.example.ticket.util;

import com.example.ticket.constant.Constants;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Util class.
 *
 * @author Raul Gutierrez.
 */
public class Utils {

  /**
   * contructor private.
   */
  private Utils() {
  }

  /**
   * This method convert a string to LocalDate.
   *
   * @param date of type String.
   * @return a LocalDate.
   */
  public static LocalDate StringToLocalDate(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(Constants.FORMAT_DATE);
    return LocalDate.parse(date, formatter);
  }

  /**
   * This method convert a string to LocalTime.
   *
   * @param date of type String.
   * @return a LocalDate.
   */
  public static LocalTime StringToLocalTime(String date) {
    return LocalTime.parse(date);
  }
}
