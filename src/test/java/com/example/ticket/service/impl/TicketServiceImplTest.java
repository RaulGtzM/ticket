package com.example.ticket.service.impl;

import com.example.ticket.constant.ConstantsTest;
import com.example.ticket.constant.ErrorResolverConstant;
import com.example.ticket.entity.Ticket;
import com.example.ticket.model.TicketRequest;
import com.example.ticket.model.TicketResponse;
import com.example.ticket.repository.TicketRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

/**
 * class to test TicketServiceImpl.
 */
public class TicketServiceImplTest {

  /**
   * TicketServiceImpl as mock.
   */
  @InjectMocks
  private TicketServiceImpl ticketService;

  @Mock
  private TicketRepository ticketRepository;

  @Mock
  private ErrorResolverConstant errorResolver;

  private TicketRequest request;

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
  public void createTicketTest() {
    Mockito.when(ticketRepository.save(Mockito.any())).thenReturn(new Ticket());
    ticketService.createTicket(request);
  }

  @Test
  public void findTicketByIdExTest() {

    Optional<Ticket> optionalTicket = Optional.ofNullable(null);
    Mockito.when(ticketRepository.findById(Mockito.anyInt())).thenReturn(optionalTicket);
    Assertions.assertThrows(IllegalArgumentException.class,
        () -> ticketService.findTicketById(ConstantsTest.INT_VALUE_8));
  }

  @Test
  public void findTicketByIdTest() {

    Optional<Ticket> optionalTicket = Optional.of(new Ticket());
    Mockito.when(ticketRepository.findById(Mockito.anyInt())).thenReturn(optionalTicket);
    Assertions.assertNotNull(ticketService.findTicketById(ConstantsTest.INT_VALUE_8));
  }

}
