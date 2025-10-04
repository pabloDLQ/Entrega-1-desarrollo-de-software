package model;

public class TipoHabitacion {
    private float costoPorNoche;
    private int capacidad;
    private String descripcion;

    public float getCostoPorNoche() {
        return costoPorNoche;
    }

    public void setCostoPorNoche(float costoPorNoche) {
        this.costoPorNoche = costoPorNoche;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
