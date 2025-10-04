package model;

import java.util.List;

public class Habitacion {
    private int numero;
    private int piso;
    private List<TipoCama> camas;
    private EstadoHabitacion estado;
    private TipoHabitacion tipo;
    private Reserva reservas;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public List<TipoCama> getCamas() {
        return camas;
    }

    public void setCamas(List<TipoCama> camas) {
        this.camas = camas;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public Reserva getReservas() {
        return reservas;
    }

    public void setReservas(Reserva reservas) {
        this.reservas = reservas;
    }
}
