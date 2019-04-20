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
    private String tituloJuego;
    private String tituloAparato;
    private int precioCombo, cantidadDisponible, idCombo;

    public Combos(String tituloJuego, String tituloAparato, int precioCombo, int cantidadDisponible, int idCombo) {
        this.tituloJuego = tituloJuego;
        this.tituloAparato = tituloAparato;
        this.precioCombo = precioCombo;
        this.cantidadDisponible = cantidadDisponible;
        this.idCombo = idCombo;
    }

   
    public int getIdCombo() {
        return idCombo;
    }

    public void setIdCombo(int idCombo) {
        this.idCombo = idCombo;
    }

    public String getTituloJuego() {
        return tituloJuego;
    }

    public void setTituloJuego(String tituloJuego) {
        this.tituloJuego = tituloJuego;
    }

    public String getTituloAparato() {
        return tituloAparato;
    }

    public void setTituloAparato(String tituloAparato) {
        this.tituloAparato = tituloAparato;
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
        return "Combos{" + "tituloJuego=" + tituloJuego + ", tituloAparato=" + tituloAparato + ", precioCombo=" + precioCombo + ", cantidadDisponible=" + cantidadDisponible + ", idCombo=" + idCombo + '}';
    }
 
    
    
}
