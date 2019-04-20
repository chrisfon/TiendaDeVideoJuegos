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
 private Juego juego;
 private Aparato aparato; 
 private Combos combos;

    public NodoPila(Aparato aparato) {
        this.aparato = aparato;
    }

    public NodoPila(Combos combos) {
        this.combos = combos;
    }

    public NodoPila(Juego juego) {
        this.juego = juego;
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

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public Aparato getAparato() {
        return aparato;
    }

    public void setAparato(Aparato aparato) {
        this.aparato = aparato;
    }

    public Combos getCombos() {
        return combos;
    }

    public void setCombos(Combos combos) {
        this.combos = combos;
    }

    public String toString() {
        String info = "Su carrito contiene: ";
        if (juego != null) {
            info += "\nJuegos: " + juego.toStringCobro();
        }
        if (aparato != null) {
            info += "\nAparatos: " + aparato.toString();
        }
        if (combos != null) {
            info += "\nCombos: " + combos.toString();
        }
        return info;

    }
}
