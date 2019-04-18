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
public class Orden {
private Juego juego;

private int idOrden;
//NODO PARA PILA

    public Orden(Juego j, int id) {
        this.idOrden = id;
        this.juego = j;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego j) {
        this.juego = juego;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    @Override
    public String toString() {
        return "*************************"+juego.toStringCobro()+"\n";
    }


}
