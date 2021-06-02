package com.example.ticket.util;

import com.example.ticket.constant.ConstantsTest;
import org.junit.jupiter.api.Test;

public class UtilsTest {

  @Test
  public void StringToLocalTimeTest() {
    Utils.StringToLocalTime(ConstantsTest.TIME_TEST);
  }

  @Test
  public void StringToLocalDate() {
    Utils.StringToLocalDate(ConstantsTest.DATE_TEST);
  }

}
