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
private int idCola;
private Orden orden;
private String Usuario;
//private dato o juego dato;

    public Orden getOrden() {
        return orden;
    }

    public void setOrden(Orden orden) {
        this.orden = orden;
    }
    
    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

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

    public NodoCola(int idCola, Orden orden,String Usuario) {
        this.idCola = idCola;
        this.orden = orden;
        this.Usuario = Usuario;
    }

    @Override
    public String toString() {
        return "idCola=" + idCola + "\nEl que ordeno: "+ Usuario +"\norden=\n" + orden;
    }



}
