package com.example.ticket.entity;

import com.example.ticket.constant.DomainConstants;
import com.example.ticket.model.TicketRequest;
import com.example.ticket.util.Utils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Ticket class.
 *
 * @author Raul Guteirrez.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = DomainConstants.TABLE_NAME)
public class Ticket {

  /**
   * Field of type Integer.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = DomainConstants.ID)
  private Integer id;

  /**
   * Field of type LocalDate.
   */
  @Column(name = DomainConstants.FECHA_SALIDA)
  private LocalDate fechaSalida;

  /**
   * Field of type LocalDate.
   */
  @Column(name = DomainConstants.FECHA_LLEGADA)
  private LocalDate fechaLlegada;

  /**
   * Field of type String.
   */
  @Column(name = DomainConstants.ORIGEN)
  private String origen;

  /**
   * Field of type String.
   */
  @Column(name = DomainConstants.DESTINO)
  private String destino;

  /**
   * Field of type String.
   */
  @Column(name = DomainConstants.NOMBRE)
  private String nombre;

  /**
   * Field of type Integer.
   */
  @Column(name = DomainConstants.EDAD)
  private Integer edad;

  /**
   * Field of type Boolean.
   */
  @Column(name = DomainConstants.EQUIPAJE)
  private Boolean equipaje;

  /**
   * Field of type Double.
   */
  @Column(name = DomainConstants.PRECIO)
  private Double precio;

  /**
   * Field of type LocalTime.
   */
  @Column(name = DomainConstants.HORA_SALIDA)
  private LocalTime horaSalida;

  /**
   * Field of type LocalTime.
   */
  @Column(name = DomainConstants.HORA_LLEGADA)
  private LocalTime horaLlegada;

  public Ticket(TicketRequest request) {
    this.fechaSalida = Utils.StringToLocalDate(request.getFechaSalida());
    this.fechaLlegada = Utils.StringToLocalDate(request.getFechaLlegada());
    this.origen = request.getOrigen();
    this.destino = request.getDestino();
    this.nombre = request.getNombre();
    this.edad = request.getEdad();
    this.equipaje = request.getEquipaje();
    this.precio = request.getPrecio();
    this.horaSalida = Utils.StringToLocalTime(request.getHoraSalida());
    this.horaLlegada = Utils.StringToLocalTime(request.getHoraLlegada());
  }

}
