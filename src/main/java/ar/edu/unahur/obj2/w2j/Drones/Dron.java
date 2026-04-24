package ar.edu.unahur.obj2.w2j.Drones;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.w2j.Misiones.Mision;

public abstract class Dron {
    private Double autonomia;
    private Double procesamiento;
    private Mision mision;
    private List<Sensor> sensores = new ArrayList<>();

    public Dron(Double autonomia, Mision mision, Double procesamiento) {
        this.autonomia = autonomia;
        this.mision = mision;
        this.procesamiento = procesamiento;
    }

    public Dron(Double autonomia, Mision mision, Double procesamiento, List<Sensor> sensores) {
        this.autonomia = autonomia;
        this.mision = mision;
        this.procesamiento = procesamiento;
        this.sensores = sensores;
    }

    public Double getAutonomia() { return autonomia; }

    public void setAutonomia(Double autonomia) { this.autonomia = autonomia; }

    public void reducirAutonomia(Double cantidad) { this.autonomia = Math.max(0, this.autonomia - cantidad); }

    public Double getProcesamiento() { return procesamiento; }

    public void setProcesamiento(Double procesamiento) { this.procesamiento = procesamiento; }

    public Mision getMision() { return mision; }

    public void setMision(Mision mision) { this.mision = mision; }

    public List<Sensor> getSensores() { return sensores; }

    public void añadirSensor(Sensor nuevoSensor) { this.sensores.add(nuevoSensor); }

    public Double getEficiencia() { return (autonomia * 10) + mision.extraEficiencia(this); }

    public Boolean esAvanzadoEnSuMision() { return mision.getExigencia(this); }

    public Boolean esAvanzado() { return esAvanzadoEnSuMision(); }
}