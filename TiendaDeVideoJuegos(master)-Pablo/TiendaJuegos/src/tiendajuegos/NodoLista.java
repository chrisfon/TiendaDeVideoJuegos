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
public class NodoLista {
 private NodoLista next;
 private NodoLista back;
 private Juego datoJuego;
 private Usuario datoUsuario;
 private Aparato aparato;
 private Combos combos;
 private int idLista;

    public NodoLista(Aparato aparato) {
        this.aparato = aparato;
    }

    public NodoLista(Combos combos) {
        this.combos = combos;
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
 
    public NodoLista getNext() {
        return next;
    }

    public void setNext(NodoLista next) {
        this.next = next;
    }

    public NodoLista getBack() {
        return back;
    }

    public void setBack(NodoLista back) {
        this.back = back;
    }

    public Juego getDatoJuego() {
        return datoJuego;
    }

    public void setDatoJuego(Juego datoJuego) {
        this.datoJuego = datoJuego;
    }

    public Usuario getDatoUsuario() {
        return datoUsuario;
    }

    public void setDatoUsuario(Usuario datoUsuario) {
        this.datoUsuario = datoUsuario;
    }

    public int getIdLista() {
        return idLista;
    }

    public void setIdLista(int idLista) {
        this.idLista = idLista;
    }

    public NodoLista(Juego datoJuego) {
        this.datoJuego = datoJuego;
    }

    public NodoLista(Usuario datoUsuario) {
        this.datoUsuario = datoUsuario;
    }

    
    public String toStringJuego() {
        return "" + datoJuego.toString();
    }
 
    public String toStringAparato() {
        return "" + aparato.toString();
    }
  
    public String toStringCombo() {
        return "" + combos.toString();
    }
 
 
}
