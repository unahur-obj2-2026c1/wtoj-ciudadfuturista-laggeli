package ar.edu.unahur.obj2.w2j.Drones;

import java.util.List;

import ar.edu.unahur.obj2.w2j.Misiones.Mision;

public class DronComercial extends Dron {

    public DronComercial(Double autonomia, Mision mision, Double procesamiento) {
        super(autonomia, mision, procesamiento);
    }

    public DronComercial(Double autonomia, Mision mision, Double procesamiento, List<Sensor> sensores) {
        super(autonomia, mision, procesamiento, sensores);
    }

    @Override
    public Double getEficiencia() { return super.getEficiencia() + 15; }

    @Override
    public Boolean esAvanzado() { return false; }
}