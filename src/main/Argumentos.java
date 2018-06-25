
package main;

/**
 *
 * @author benjamin
 */
public class Argumentos {
    
    private int idConexion;
    private String nombreBasedatos;
    private String hostBasedatos;
    private String usuarioBasedatos;
    private String claveBasedatos;

    public int getIdConexion() {
        return idConexion;
    }

    public void setIdConexion(int idConexion) {
        this.idConexion = idConexion;
    }

    public String getNombreBasedatos() {
        return nombreBasedatos;
    }

    public void setNombreBasedatos(String nombreBasedatos) {
        this.nombreBasedatos = nombreBasedatos;
    }

    public String getHostBasedatos() {
        return hostBasedatos;
    }

    public void setHostBasedatos(String hostBasedatos) {
        this.hostBasedatos = hostBasedatos;
    }

    public String getUsuarioBasedatos() {
        return usuarioBasedatos;
    }

    public void setUsuarioBasedatos(String usuarioBasedatos) {
        this.usuarioBasedatos = usuarioBasedatos;
    }

    public String getClaveBasedatos() {
        return claveBasedatos;
    }

    public void setClaveBasedatos(String claveBasedatos) {
        this.claveBasedatos = claveBasedatos;
    }

    @Override
    public String toString() {
        return "Argumentos{" + "idConexion=" + idConexion + ", nombreBasedatos=" + nombreBasedatos + ", hostBasedatos=" + hostBasedatos + ", usuarioBasedatos=" + usuarioBasedatos + ", claveBasedatos=" + claveBasedatos + '}';
    }
    
}
