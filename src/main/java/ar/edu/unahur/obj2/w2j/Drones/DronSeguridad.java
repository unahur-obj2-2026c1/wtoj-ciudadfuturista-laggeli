package ar.edu.unahur.obj2.w2j.Drones;

import java.util.List;

import ar.edu.unahur.obj2.w2j.Misiones.Mision;

public class DronSeguridad extends Dron {

    public DronSeguridad(Double autonomia, Mision mision, Double procesamiento) {
        super(autonomia, mision, procesamiento);
    }

    public DronSeguridad(Double autonomia, Mision mision, Double procesamiento, List<Sensor> sensores) {
        super(autonomia, mision, procesamiento, sensores);
    }

    @Override
    public Boolean esAvanzado() { return super.esAvanzado() & getProcesamiento() > 50; }
}
