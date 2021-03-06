/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajuegos;

/**
 *
 * @author ulacit
 */
public class Usuario {

    private String nombreUsuario;
    private int edadUsuario;
    private String contraseñaUsuario;
    private int tarjetaUsuario;
    private int usuarioID;
    private Lista listaJuegoUsuario;
    private int usuarioTipo;

    public int getUsuarioTipo() {
        return usuarioTipo;
    }

    public void setUsuarioTipo(int usuarioTipo) {
        this.usuarioTipo = usuarioTipo;
    }
    
    public String getContraseñaUsuario() {
        return contraseñaUsuario;
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getEdadUsuario() {
        return edadUsuario;
    }

    public void setEdadUsuario(int edadUsuario) {
        this.edadUsuario = edadUsuario;
    }

    public void setContraseñaUsuario(String contraseñaUsuario) {
        this.contraseñaUsuario = contraseñaUsuario;
    }

    public int getTarjetaUsuario() {
        return tarjetaUsuario;
    }

    public void setTarjetaUsuario(int tarjetaUsuario) {
        this.tarjetaUsuario = tarjetaUsuario;
    }

    public int getUsuarioID() {
        return usuarioID;
    }

    public void setUsuarioID(int usuarioID) {
        this.usuarioID = usuarioID;
    }

    public Usuario(String nombreUsuario, String contraseñaUsuario,int edadUsuario, int usuarioID, int usuarioTipo) {
        this.nombreUsuario = nombreUsuario;
        this.edadUsuario = edadUsuario;
        this.contraseñaUsuario = contraseñaUsuario;
        this.usuarioID = usuarioID;
        this.listaJuegoUsuario = new Lista ();
        this.usuarioTipo = usuarioTipo;
    }

    public Lista getListaJuegoUsuario() {
        return listaJuegoUsuario;
    }

    public void setListaJuegoUsuario(Lista listaJuegoUsuario) {
        this.listaJuegoUsuario = listaJuegoUsuario;
    }

}
