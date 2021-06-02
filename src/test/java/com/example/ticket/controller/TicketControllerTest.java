package com.example.ticket.controller;

import com.example.ticket.constant.ConstantsTest;
import com.example.ticket.model.TicketRequest;
import com.example.ticket.model.TicketResponse;
import com.example.ticket.service.TicketService;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TicketControllerTest {

  /**
   * TicketController as mock.
   */
  @InjectMocks
  private TicketController controller;

  @Mock
  private TicketService ticketService;

  private TicketRequest request;

  private TicketResponse response;

  /**
   * Initializing Mockito annotations for this test class and objects.
   */
  @BeforeEach
  public void setUp() throws IOException {
    MockitoAnnotations.openMocks(this);
    ObjectMapper objectMapper = new ObjectMapper();
    ClassLoader classLoader = getClass().getClassLoader();

    request = objectMapper.readValue(
        new File(classLoader.getResource(ConstantsTest.TICKET_REQUEST).getFile()),
        TicketRequest.class);
  }

  @Test
  public void saveTicketTest() {
    Mockito.doNothing().when(ticketService).createTicket(Mockito.any());
    Assertions.assertNotNull(controller.saveTicket(request));
  }

  @Test
  public void getTicketTest() {
    Mockito.when(ticketService.findTicketById(Mockito.anyInt())).thenReturn(new TicketResponse());
    Assertions.assertNotNull(controller.getTicket(ConstantsTest.INT_VALUE_8));
  }


}
