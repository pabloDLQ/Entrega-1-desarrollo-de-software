package model;

public class PersonaJuridica extends ResponsablePago{
    private String razonSocial;
    private String cuit;
    private PosicionIva posicionIva;
    private Direccion direccion;

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public PosicionIva getPosicionIva() {
        return posicionIva;
    }

    public void setPosicionIva(PosicionIva posicionIva) {
        this.posicionIva = posicionIva;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
