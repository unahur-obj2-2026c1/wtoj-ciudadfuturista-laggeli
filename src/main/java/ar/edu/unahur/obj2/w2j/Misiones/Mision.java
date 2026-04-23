package ar.edu.unahur.obj2.w2j.Misiones;

import ar.edu.unahur.obj2.w2j.Drones.Dron;

public interface Mision {
    double extraEficiencia(Dron dron);
    boolean getExigencia(Dron dron);
}