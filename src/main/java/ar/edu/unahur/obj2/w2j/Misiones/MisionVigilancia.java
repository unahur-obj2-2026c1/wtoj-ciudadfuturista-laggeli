package ar.edu.unahur.obj2.w2j.Misiones;

import ar.edu.unahur.obj2.w2j.Drones.Dron;

public class MisionVigilancia implements Mision {
    @Override
    public double extraEficiencia(Dron dron) {
        double sensoresConMejoras = dron.getSensores().stream().mapToDouble(s -> s.getEficiencia()).sum();
        return sensoresConMejoras;
    }

    @Override
    public boolean getExigencia(Dron dron) { return dron.getEficiencia() % 2 == 0; }
}