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
public class Aparato {
    private String nombreAparato;
    private int precioAparato, cantidadDisponible;

    public String getNombreAparato() {
        return nombreAparato;
    }

    public void setNombreAparato(String nombreAparato) {
        this.nombreAparato = nombreAparato;
    }

    public int getPrecioAparato() {
        return precioAparato;
    }

    public void setPrecioAparato(int precioAparato) {
        this.precioAparato = precioAparato;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Aparato(String nombreAparato, int precioAparato, int cantidadDisponible) {
        this.nombreAparato = nombreAparato;
        this.precioAparato = precioAparato;
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Aparato{" + "nombreAparato=" + nombreAparato + ", precioAparato=" + precioAparato + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
    
    
    
}
