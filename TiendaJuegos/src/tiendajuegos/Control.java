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
public class Control {
 private Usuario usuarioControl;
 private Juego juegoControl;
 private Orden ordenControl;
 private NodoLista cabezaLista;
 private NodoLista ultimoLista;
 
 public void agregarJuego(Juego j){
      if (cabezaLista == null){
           cabezaLista = new NodoLista(j);
           ultimoLista = cabezaLista;
           ultimoLista.setNext(cabezaLista);
            cabezaLista.setBack(ultimoLista);
           
       }else if (j.getIdJuego() < cabezaLista.getDato().getIdJuego()){
         NodoLista aux = new NodoLista(j);
         aux.setNext(cabezaLista);
         cabezaLista.setBack(aux);
         cabezaLista = aux;
         ultimoLista.setNext(cabezaLista);
         cabezaLista.setBack(ultimoLista);
         
       }else if (ultimoLista.getDato().getIdJuego() <= j.getIdJuego()){
        NodoLista aux = new NodoLista(j);
        aux.setBack(ultimoLista);
        ultimoLista.setNext(aux);
        ultimoLista = ultimoLista.getNext();
        ultimoLista.setNext(cabezaLista);
        cabezaLista.setBack(ultimoLista);
        
       }else{
       NodoLista aux = cabezaLista;
       while (aux.getNext().getDato().getIdJuego() < j.getIdJuego()){
           aux = aux.getNext();
       }
       NodoLista temp = new NodoLista(j);
       temp.setNext(aux.getNext());
       temp.setBack(aux);
       aux.setNext(temp);
       temp.getNext().setBack(temp);
       } 
 }
 @Override
    public String toString() {
        String s="";
       NodoLista aux= cabezaLista;
        if (cabezaLista!=null) {
            s+=aux+",";
            aux=aux.getNext();
            while(aux!=cabezaLista){
                s+=aux +",";
                aux= aux.getNext();
            }
        }
        return s;
    }
}
