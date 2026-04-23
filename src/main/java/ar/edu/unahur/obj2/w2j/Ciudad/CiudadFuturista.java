package ar.edu.unahur.obj2.w2j.Ciudad;

public class CiudadFuturista {
    private static final CiudadFuturista instance = new CiudadFuturista();
    private Integer limite = 10;
    private CiudadFuturista() {}

    public static CiudadFuturista getInstance() { return instance; }

    public Integer getLimite() { return limite; }

    public void setLimite(Integer limite) { this.limite = limite; }
}
