
package logica;

/**
 *
 * @author USER
 */
public class Iva {
    
    private int idIva;
    private float porcentajeIva;

    public Iva() {
    }

    public Iva(int idIva, float porcentajeIva) {
        this.idIva = idIva;
        this.porcentajeIva = porcentajeIva;
    }

    public int getIdIva() {
        return idIva;
    }

    public void setIdIva(int idIva) {
        this.idIva = idIva;
    }

    public float getPorcentajeIva() {
        return porcentajeIva;
    }

    public void setPorcentajeIva(float porcentajeIva) {
        this.porcentajeIva = porcentajeIva;
    }
    
    
    
}
