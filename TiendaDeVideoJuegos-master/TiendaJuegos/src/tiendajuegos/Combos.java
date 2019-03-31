/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajuegos;

/**
 *
 * @author PJ129
 */
public class Combos {
    private Juego juego;
    private Aparato aparato;
    private int precioCombo, cantidadDisponible;

    public Combos(Juego juego, Aparato aparato, int precioCombo, int cantidadDisponible) {
        this.juego = juego;
        this.aparato = aparato;
        this.precioCombo = precioCombo;
        this.cantidadDisponible = cantidadDisponible;
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

    public int getPrecioCombo() {
        return precioCombo;
    }

    public void setPrecioCombo(int precioCombo) {
        this.precioCombo = precioCombo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Combos{" + "juego=" + juego + ", aparato=" + aparato + ", precioCombo=" + precioCombo + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
    
    
    
    
}
