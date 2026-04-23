package ar.edu.unahur.obj2.w2j.Misiones;

import ar.edu.unahur.obj2.w2j.Drones.Dron;

public class MisionExploracion implements Mision {
    @Override
    public double extraEficiencia(Dron dron) { return 0.0; }

    @Override
    public boolean getExigencia(Dron dron) { return dron.getAutonomia() > 50; }
}
