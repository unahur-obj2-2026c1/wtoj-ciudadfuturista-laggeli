package ar.edu.unahur.obj2.w2j.Drones;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.w2j.Ciudad.Zona;
import ar.edu.unahur.obj2.w2j.Misiones.MisionExploracion;
import ar.edu.unahur.obj2.w2j.Misiones.MisionTransporte;
import ar.edu.unahur.obj2.w2j.Misiones.MisionVigilancia;

public class EscuadronTest {
    @Test
    void noEsPosibleAgregarElDron() {
        Escuadron escuadron1 = new Escuadron(2);
        DronComercial dron1 = new DronComercial(5.0, new MisionExploracion(), 40.0);
        escuadron1.agregarDron(dron1);
        assertTrue(escuadron1.getDrones().contains(dron1));
        DronSeguridad dron2 = new DronSeguridad(7.5, new MisionVigilancia(), 55.0);
        escuadron1.agregarDron(dron2);
        RuntimeException escuadronLleno = assertThrows(RuntimeException.class, () -> {
        escuadron1.agregarDron(new DronComercial(2.0, new MisionExploracion(), 35.0));});
        assertEquals("Supera la cantidad máxima definida por la ciudad", escuadronLleno.getMessage());
    }

    @Test
    void esPosibleAgregarElDron() {
        Escuadron escuadron1 = new Escuadron(2);
        DronComercial dron1 = new DronComercial(5.0, new MisionExploracion(), 40.0);
        escuadron1.agregarDron(dron1);
        assertTrue(escuadron1.getDrones().contains(dron1));
    }

    @Test
    void escuadronOperaEnUnaZona() {
        Zona zona = new Zona(0, 5.0);
        Escuadron escuadron = new Escuadron(5);
        DronComercial dronC = new DronComercial(20.0, new MisionTransporte(), 45.0);
        DronSeguridad dronS = new DronSeguridad(58.5, new MisionTransporte(), 60.0);
        escuadron.agregarDron(dronC);
        escuadron.agregarDron(dronS);
        escuadron.operarEnZona(zona);
        assertEquals(1, zona.getCantidadDeOperaciones());
        assertEquals(18.0, dronC.getAutonomia());
        assertEquals(56.5, dronS.getAutonomia());
    }
}