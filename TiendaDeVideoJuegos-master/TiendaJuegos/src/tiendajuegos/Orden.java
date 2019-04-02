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

private int IdOrden;
//NODO PARA PILA

    public Orden(Juego juego, int IdOrden) {
        this.juego = juego;
        this.IdOrden = IdOrden;
    }

    public int getIdOrden() {
        return IdOrden;
    }

    public void setIdOrden(int IdOrden) {
        this.IdOrden = IdOrden;
    }

   
    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego j) {
        this.juego = juego;
    }

    @Override
    public String toString() {
        return juego.toString();
    }
}
