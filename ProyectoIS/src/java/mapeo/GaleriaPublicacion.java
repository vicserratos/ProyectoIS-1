package mapeo;
// Generated 14/04/2016 09:44:17 PM by Hibernate Tools 4.3.1



/**
 * GaleriaPublicacion generated by hbm2java
 */
public class GaleriaPublicacion  implements java.io.Serializable {


     private int idGaleria;
     private byte[] urlImagen;
     private String varcharoImagen;

    public GaleriaPublicacion() {
    }

	
    public GaleriaPublicacion(int idGaleria, byte[] urlImagen) {
        this.idGaleria = idGaleria;
        this.urlImagen = urlImagen;
    }
    public GaleriaPublicacion(int idGaleria, byte[] urlImagen, String varcharoImagen) {
       this.idGaleria = idGaleria;
       this.urlImagen = urlImagen;
       this.varcharoImagen = varcharoImagen;
    }
   
    public int getIdGaleria() {
        return this.idGaleria;
    }
    
    public void setIdGaleria(int idGaleria) {
        this.idGaleria = idGaleria;
    }
    public byte[] getUrlImagen() {
        return this.urlImagen;
    }
    
    public void setUrlImagen(byte[] urlImagen) {
        this.urlImagen = urlImagen;
    }
    public String getVarcharoImagen() {
        return this.varcharoImagen;
    }
    
    public void setVarcharoImagen(String varcharoImagen) {
        this.varcharoImagen = varcharoImagen;
    }




}


