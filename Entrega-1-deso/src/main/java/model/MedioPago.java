package model;

import java.util.Date;

public abstract class MedioPago {
    private Date fechaMedioPago;
    private float montoMedioPago;

    public Date getFechaMedioPago() {
        return fechaMedioPago;
    }

    public void setFechaMedioPago(Date fechaMedioPago) {
        this.fechaMedioPago = fechaMedioPago;
    }

    public float getMontoMedioPago() {
        return montoMedioPago;
    }

    public void setMontoMedioPago(float montoMedioPago) {
        this.montoMedioPago = montoMedioPago;
    }
}
