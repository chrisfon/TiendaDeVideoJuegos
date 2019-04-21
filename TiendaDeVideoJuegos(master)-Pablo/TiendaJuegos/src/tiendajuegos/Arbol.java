/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajuegos;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author crazyiot
 */
public class Arbol {

    Random random = new Random();
    private NodoArbol raiz;
    int contadortmp = 0;

    public Arbol() {
        raiz = new NodoArbol(new Juego("Placeholderchamp", "Desarollador 2", "Estrategia", "Un juegaso 12/10", 10000, 20000, 2000)); //inicio el arbol y le doy un valor a su raiz
        llenarArbol();
    }

    private void llenarArbol() { //llena el arbol con los nodos de las partidas despues de la primer ronda
        int contador = 1;

        while (contador <= 14) {
            String nombre = "Placeholder" + contador;
            raiz.insertarNodo(new Juego(nombre, "Desarollador 2", "Estrategia", "Un juegaso 12/10", 20000, 10000, 2000));
            contador += 1;
        }
    }

    public void imprimirNivelArbol(NodoArbol nodo, int ronda) { //impresion de un cierto nivel. Se tiene otro metodo de impresion por nivel porque esta se encarga de imprimir el campeon (sin el contadorVs)
        String s = new String();
        if (nodo != null) {

            if (ronda == 1) {
                s += nodo.getJuego().getTituloJuego();

            }
            if (ronda > 1) {

                imprimirNivelArbol(nodo.getHijoDer(), ronda - 1);
                imprimirNivelArbol(nodo.getHijoIzq(), ronda - 1);
            }
        }
        JOptionPane.showMessageDialog(null, s);
    }

    public void getAltura() {
        if (raiz != null) {
            AlturaRec(raiz);
        } else {
            System.out.println("Esta vacio...");
        }
    }

    public int AlturaRec(NodoArbol n) {
        if (n != null) {
            int fondoIzq = AlturaRec(n.getHijoIzq());
            int fondoDer = AlturaRec(n.getHijoDer());
            if (fondoIzq >= fondoDer) {
                return fondoIzq + 1;
            } else {
                return fondoDer + 1;
            }
        } else {
            return 0;
        }
    }

    public void acomodarArbol(NodoArbol n) { //ACOMODA SIGUIENTE NIVEL A GANADORES. de esta manera se puede ir imprimiendo un nivel a la vez (como se pide el ejercicio)

        if (n.getHijoDer() != null && n.getHijoIzq() != null) { //revisa si hay hijos 
            if (n.getHijoDer().getJuego().getVecesCompradas() > n.getHijoIzq().getJuego().getVecesCompradas()) { //pone de nombre al hijo con mas goles
                n.setJuego(n.getHijoDer().getJuego());
                contadortmp += 1;
            } else if (n.getHijoDer().getJuego().getVecesCompradas() < n.getHijoIzq().getJuego().getVecesCompradas()) {
                n.setJuego(n.getHijoIzq().getJuego());
                contadortmp += 1;
            } else { //si hay empate genere otro numero y recorra el metodo con el mismo nodo asi sigue haciendolo hasta q no haya empate
                //EMPATE
                n.getHijoDer().setJuego(n.getHijoDer().getJuego());
                contadortmp += 1;
                // acomodarArbol(n);
            }
            acomodarArbol(n.getHijoDer());
            acomodarArbol(n.getHijoIzq());
        }

    }

    public void acomodarTodoArbol() {
        while (contadortmp < 5) {
            acomodarArbol(raiz);
            contadortmp += 1;
        }
    }

    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

}
