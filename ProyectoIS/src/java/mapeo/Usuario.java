package mapeo;
// Generated 13/04/2016 01:37:52 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idUsuario;
     private String nombreUsuario;
     private String contraseniaUsuario;

    public Usuario() {
    }

    public Usuario(String nombreUsuario, String contraseniaUsuario) {
       //this.idUsuario = idUsuario;
       this.nombreUsuario = nombreUsuario;
       this.contraseniaUsuario = contraseniaUsuario;
    }
   
    public int getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getContraseniaUsuario() {
        return this.contraseniaUsuario;
    }
    
    public void setContraseniaUsuario(String contraseniaUsuario) {
        this.contraseniaUsuario = contraseniaUsuario;
    }




}


