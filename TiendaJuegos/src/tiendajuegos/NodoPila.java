/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajuegos;

/**
 *
 * @author crazyiot
 */
public class NodoPila {
 private NodoPila abajo;
 private int idPila;
 //private ORDEN?USUARIO?JUEGO? dato;

    public NodoPila() {
        //this.dato = dato;
    }

 
    public NodoPila getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoPila abajo) {
        this.abajo = abajo;
    }

    public int getIdPila() {
        return idPila;
    }

    public void setIdPila(int idPila) {
        this.idPila = idPila;
    }
 
}
