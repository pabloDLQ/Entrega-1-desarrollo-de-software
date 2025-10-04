package model;

import java.util.Date;
import java.util.List;

public class Estadia {
    private Date fechaInicio;
    private Date fechaFin;
    private List<Huesped> huespedes;
    private List<GastoAdicional> gastosAdicionales;
    private List<Factura> facturas;
    private Reserva reserva;
    private Habitacion habitacion;

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(List<Huesped> huespedes) {
        this.huespedes = huespedes;
    }

    public List<GastoAdicional> getGastosAdicionales() {
        return gastosAdicionales;
    }

    public void setGastosAdicionales(List<GastoAdicional> gastosAdicionales) {
        this.gastosAdicionales = gastosAdicionales;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }
}
