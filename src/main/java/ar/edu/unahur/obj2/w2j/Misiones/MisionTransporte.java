package ar.edu.unahur.obj2.w2j.Misiones;

import ar.edu.unahur.obj2.w2j.Drones.Dron;

public class MisionTransporte implements Mision {
    @Override
    public double extraEficiencia(Dron dron) { return 100.0; }

    @Override
    public boolean getExigencia(Dron dron) { return dron.getSensores().stream().allMatch(s -> s.esDuradero()); }
}