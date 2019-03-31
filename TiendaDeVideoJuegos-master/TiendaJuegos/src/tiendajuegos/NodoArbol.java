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
 private int idArbol;
 private NodoArbol hijoIzq;
 private NodoArbol hijoDer;

    public NodoArbol(int idArbol) {
        this.idArbol = idArbol;
    }

    
    public int getIdArbol() {
        return idArbol;
    }

    public void setIdArbol(int idArbol) {
        this.idArbol = idArbol;
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
 
 
}
