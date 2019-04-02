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
public class NodoCola {
private NodoCola atras;
 private Orden orden;
private int idCola;
//private dato o juego dato;

    public NodoCola(Orden orden) {
        this.orden = orden;
    }


//FALTA TO STRING
    public NodoCola getAtras() {
        return atras;
    }

    public void setAtras(NodoCola atras) {
        this.atras = atras;
    }

    public NodoCola() {
    //this.dato = dato;
  
    }

    public int getIdCola() {
        return idCola;
    }

    public void setIdCola(int idCola) {
        this.idCola = idCola;
    }

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return ""+orden.toString() ;
    }




}
