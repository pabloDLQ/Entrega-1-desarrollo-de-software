package model;

public class GastoAdicional {
    private float precio;
    private String descripcion;
    private TipoGastoAdicional tipo;

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoGastoAdicional getTipo() {
        return tipo;
    }

    public void setTipo(TipoGastoAdicional tipo) {
        this.tipo = tipo;
    }
}
