package es.reto.programacion;

import java.time.LocalDateTime;



/**
 * Clase que representa una reserva de partida de ajedrez entre dos jugadores.
 */

public class reservaAjedrez {
    private String codigo;
    private String jugador1;
    private String jugador2;
    private LocalDateTime fechaHora;
    private boolean reservada;

    
    /**
     * Constructor para crear una nueva reserva de ajedrez.
     * 
     * @param codigo Código único de la reserva
     * @param jugador1 Nombre del primer jugador
     * @param jugador2 Nombre del segundo jugador
     * @param fechaHora Fecha y hora de la partida
     */
    public reservaAjedrez(String jugador1, String jugador2, LocalDateTime fechaHora) {
    	this.codigo=codigo;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.fechaHora = fechaHora;
        this.reservada = false;
    }

    /**
     * Obtiene el código de la reserva.
     * 
     * @return Código de la reserva
     */
    public String getCodigo() {
        return codigo;
    }

    
    /**
     * Obtiene el nombre del primer jugador.
     * 
     * @return Nombre del primer jugador
     */
    public String getJugador1() {
        return jugador1;
    }

    /**
     * Obtiene el nombre del segundo jugador.
     * 
     * @return Nombre del segundo jugador
     */
    public String getJugador2() {
        return jugador2;
    }

    
    /**
     * Obtiene la fecha y hora de la partida.
     * 
     * @return Fecha y hora de la partida
     */
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }


    /**
     * Comprueba si la reserva está confirmada.
     * 
     * @return true si la reserva está confirmada, false en caso contrario
     */
    public boolean isReservada() {
        return reservada;
    }

    /**
     * Confirma la reserva de la partida.
     */
    public void reservar() {
		if (!this.reservada) {
			this.reservada = true;
		}
        System.out.println("La partida ha sido reservada.");

	}

    
    /**
     * Cancela la reserva de la partida.
     */
    public void cancelarReserva() {
        this.reservada = false;
        System.out.println("La partida ha sido cancelada.");
    }

    
    /**
     * Representación en forma de cadena de la reserva de ajedrez.
     * 
     * @return Cadena con los detalles de la reserva
     */
    public String toString() {
        return "ReservaAjedrez{" +
                "id='" + codigo + '\'' +
                ", jugador1='" + jugador1 + '\'' +
                ", jugador2='" + jugador2 + '\'' +
                ", fechaHora=" + fechaHora +
                ", confirmada=" + reservada +
                '}';
    }
}
