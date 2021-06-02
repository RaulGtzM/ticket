package com.example.ticket.model;

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
public class TicketRequest {

  /**
   * Field of type LocalDate.
   */
  private String fechaSalida;

  /**
   * Field of type LocalDate.
   */
  private String fechaLlegada;

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
  private String horaSalida;

  /**
   * Field of type LocalTime.
   */
  private String horaLlegada;

}
