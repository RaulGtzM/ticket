package com.example.ticket.model;

import com.example.ticket.entity.Ticket;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Class of transfer.
 *
 * @author Raul Guteirrez.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketResponse {

  /**
   * Field of type String.
   */
  private Integer itineraryID;

  /**
   * Field of type String.
   */
  private LocalDate fechaSalida;

  /**
   * Field of type String.
   */
  private LocalDate fechaLlegada;

  /**
   * Field of type String.
   */
  private String origen;

  /**
   * Field of type String.
   */
  private String destino;

  /**
   * Field of type String.
   */
  private String nombre;

  /**
   * Field of type Integer.
   */
  private Integer edad;

  /**
   * Field of type Boolean.
   */
  private Boolean equipaje;

  /**
   * Field of type Double.
   */
  private Double precio;

  /**
   * Field of type LocalTime.
   */
  private LocalTime horaSalida;

  /**
   * Field of type LocalTime.
   */
  private LocalTime horaLlegada;

  public TicketResponse(Ticket ticket) {
    this.itineraryID = ticket.getId();
    this.fechaSalida = ticket.getFechaSalida();
    this.fechaLlegada = ticket.getFechaLlegada();
    this.origen = ticket.getOrigen();
    this.destino = ticket.getDestino();
    this.nombre = ticket.getNombre();
    this.edad = ticket.getEdad();
    this.equipaje = ticket.getEquipaje();
    this.precio = ticket.getPrecio();
    this.horaSalida = ticket.getHoraSalida();
    this.horaLlegada = ticket.getHoraLlegada();
  }

}
