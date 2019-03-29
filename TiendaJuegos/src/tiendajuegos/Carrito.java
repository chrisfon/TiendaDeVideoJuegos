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
public class Carrito {
private Juego juegoCarrito;
private Usuario usuario;
//Utilizar lista para agregar los juegos y admin
// <editor-fold desc="Constructor, getter and setter"> 
    public Carrito(Juego juego, Usuario usuario) {
        this.juegoCarrito = juego;
        this.usuario = usuario;
    }


    public Juego getJuego() {
        return juegoCarrito;
    }

    public void setJuego(Juego juego) {
        this.juegoCarrito = juego;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
     // </editor-fold>

public void Agregar(){
    //se va a usar array
}
public void Eliminiar(){
    //se va a usar array
}
}
