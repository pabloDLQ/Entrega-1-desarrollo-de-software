package model;

import java.util.List;

public class Factura {
    private float montoFactura;
    private TipoFactura tipo;
    private EstadoFactura estado;
    private ResponsablePago responsablePago;
    private List<Pago> pagos;
    private Estadia estadia;
    private NotaDeCredito notaDeCredito;

    public NotaDeCredito getNotaDeCredito() {
        return notaDeCredito;
    }

    public void setNotaDeCredito(NotaDeCredito notaDeCredito) {
        this.notaDeCredito = notaDeCredito;
    }

    public Estadia getEstadia() {
        return estadia;
    }

    public void setEstadia(Estadia estadia) {
        this.estadia = estadia;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    public ResponsablePago getResponsablePago() {
        return responsablePago;
    }

    public void setResponsablePago(ResponsablePago responsablePago) {
        this.responsablePago = responsablePago;
    }

    public EstadoFactura getEstado() {
        return estado;
    }

    public void setEstado(EstadoFactura estado) {
        this.estado = estado;
    }

    public TipoFactura getTipo() {
        return tipo;
    }

    public void setTipo(TipoFactura tipo) {
        this.tipo = tipo;
    }

    public float getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(float montoFactura) {
        this.montoFactura = montoFactura;
    }
}
