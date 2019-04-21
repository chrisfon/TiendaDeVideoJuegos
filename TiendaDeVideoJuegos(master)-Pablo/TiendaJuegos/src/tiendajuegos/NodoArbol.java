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
public class NodoArbol {

    private Juego juego;
    private NodoArbol hijoIzq;
    private NodoArbol hijoDer;
    private int tamanoMax;

    public NodoArbol(Juego juego /*, int vecesCompradas*/) {

        this.juego = juego;
        this.tamanoMax = 1;
        // this.vecesComparadas = vecesCompradas;
    }

    public void insertarNodo(Juego juego) { //AAQUI VA N
        if (hijoIzq == null) {
            hijoIzq = new NodoArbol(juego);
        } else if (hijoDer == null) {
            hijoDer = new NodoArbol(juego);
        } else if (revisarLleno()) {
            hijoDer.insertarNodo(juego);
        } else {
            hijoIzq.insertarNodo(juego);
        }
        tamanoMax += 1; //agrega al tama;o para revisar mas adelante con el metodo revisar lleno
    }

    public boolean revisarLleno() { //revisa si lado izquierdo esta lleno
        int tamanotmp = 1;
        int hojas = 1;

        while (hojas <= tamanoMax + 1) {
            hojas *= 2;
        }
        hojas /= 2;
        tamanotmp = ((tamanoMax + 1) % hojas);
        if (tamanotmp >= (hojas / 2)) {
            return true;
        } else {
            return false;
        }

    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public NodoArbol getHijoIzq() {
        return hijoIzq;
    }

    public void setHijoIzq(NodoArbol hijoIzq) {
        this.hijoIzq = hijoIzq;
    }

    public NodoArbol getHijoDer() {
        return hijoDer;
    }

    public void setHijoDer(NodoArbol hijoDer) {
        this.hijoDer = hijoDer;
    }

    public int getTamano() {
        return tamanoMax;
    }

    public void setTamano(int tamano) {
        this.tamanoMax = tamano;
    }

}
