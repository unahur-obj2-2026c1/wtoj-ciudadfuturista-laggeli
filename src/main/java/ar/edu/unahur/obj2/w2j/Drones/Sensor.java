package ar.edu.unahur.obj2.w2j.Drones;

public class Sensor {
    private static Double capacidad;
    private static Double durabilidad;
    private static Boolean tieneMejorasTecnologicas;

    public Sensor() {}

    public Double getCapacidad() { return capacidad; }

    public Double getDurabilidad() { return durabilidad; }
    
    public Boolean getTieneMejorasTecnologicas() { return tieneMejorasTecnologicas; }

    public Double getEficiencia() {
        if (tieneMejorasTecnologicas) { return capacidad * 2; } 
        else { return capacidad; }
    }

    public Boolean esDuradero() { return durabilidad > (capacidad * 2); }
}