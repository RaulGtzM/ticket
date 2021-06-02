package com.example.ticket.controller;

import com.example.ticket.model.TicketRequest;
import com.example.ticket.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller class with entry-point methods for the API's.
 *
 * @author Raul Gutierrez.
 */
@RestController
@RequestMapping("${constants.api.uri.basePath}")
public class TicketController {

  /**
   * Component that contains the business rules.
   */
  @Autowired
  private TicketService ticketService;

  /**
   * This method is used to insert a registry of ticket.
   *
   * @param request of type TicketRequest.
   * @return a ResponseEntity.
   */
  @PostMapping(value = "${constants.api.uri.specificPaths.ticket.insert}",
      consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity saveTicket(@RequestBody TicketRequest request) {
    ticketService.createTicket(request);
    return new ResponseEntity(HttpStatus.OK);
  }

  /**
   * This method is used to get a ticket.
   *
   * @param id of type Integer.
   * @return a ResponseEntity with a json.
   */
  @GetMapping(value = "${constants.api.uri.specificPaths.ticket.get}",
      produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity getTicket(@RequestParam Integer id) {
    return new ResponseEntity(ticketService.findTicketById(id), HttpStatus.OK);
  }

}
