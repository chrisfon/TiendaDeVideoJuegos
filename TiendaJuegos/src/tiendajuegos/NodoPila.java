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
 private Orden orden;

    public NodoPila(Orden orden) {
        this.orden = orden;
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

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return "" + orden;
    }
 
}
