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
public class Pilas {
 private NodoPila top;
 public int idOrden;


    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public NodoPila getTop() {
        return top;
    }

    public void setTop(NodoPila top) {
        this.top = top;
    }
 
 
 
 public void push(NodoPila d) {
        if (top == null) {
            top = d;
        } else {
            d.setAbajo(top);
            top = d;
        }
    }

    public NodoPila pop() {
        NodoPila aux = null;
        if (top != null) {
            aux = top;
            top = aux.getAbajo();
        }
        return aux;
    }
   public void cambio(int id) {
        NodoPila aux = top;
        while (aux != null) {

            if (aux.getOrden().getIdOrden() == id) {
                //que quiere cambiar si se ocupa este metodo
                break;
            } else {
                
                aux = aux.getAbajo();
            }
        }
        if (aux == null) {
            System.out.println("**Error, ID no existe en el sistema**");
          
        } else {
            System.out.println("Cambio Exitoso! Lista actualizada:");;
        }
       
        
    }
public int montoTotal(){
int montoTotal = 0;

        NodoPila aux = top;
        while (aux != null) {
            montoTotal += aux.getOrden().getJuego().getPrecioJuego();
            aux = aux.getAbajo();
        }
        
     return montoTotal; 
}   
 @Override
    public String toString() {
        String s = "";
        NodoPila aux = top;
        while (aux != null) {
            s += aux + "\n";
            aux = aux.getAbajo();
        }
        return s;
    }
public Lista pasarCola(){
    Lista listatmp = new Lista();
    NodoPila aux = top;
    while (top != null){
       listatmp.insertarJuego(this.pop().getOrden().getJuego());
       
    }
 
    return listatmp;
}

}
