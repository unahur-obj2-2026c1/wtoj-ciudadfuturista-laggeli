package ar.edu.unahur.obj2.w2j.Ciudad;

public class Zona {
    private Double tamaño;
    private Integer cantidadDeOperaciones;

    public Zona(Integer cantidadDeOperaciones, Double tamaño) {
        this.cantidadDeOperaciones = cantidadDeOperaciones;
        this.tamaño = tamaño;
    }

    public Double getTamaño() { return tamaño; }

    public void setTamaño(Double tamaño) { this.tamaño = tamaño; }

    public Integer getCantidadDeOperaciones() { return cantidadDeOperaciones; }

    public void setCantidadDeOperaciones(Integer cantidadDeOperaciones) { this.cantidadDeOperaciones = cantidadDeOperaciones; }
}