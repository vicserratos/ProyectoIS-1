package mapeo;
// Generated 13/04/2016 01:37:52 PM by Hibernate Tools 4.3.1



/**
 * Pais generated by hbm2java
 */
public class Pais  implements java.io.Serializable {


     private int idPais;
     private String paisPais;

    public Pais() {
    }

    public Pais(int idPais, String paisPais) {
       this.idPais = idPais;
       this.paisPais = paisPais;
    }
   
    public int getIdPais() {
        return this.idPais;
    }
    
    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }
    public String getPaisPais() {
        return this.paisPais;
    }
    
    public void setPaisPais(String paisPais) {
        this.paisPais = paisPais;
    }




}


