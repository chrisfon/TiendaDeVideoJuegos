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
private Pilas carrito;
private int idOrden;
//NODO PARA PILA

    public Orden(Pilas carrito, int idOrden) {
        this.carrito = carrito;
        this.idOrden = idOrden;
    }

    public Pilas getCarrito() {
        return carrito;
    }

    public void setCarrito(Pilas carrito) {
        this.carrito = carrito;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

     
    @Override
    public String toString() {
    String orden = carrito.toString();
    String replace = orden.replace("carrito", "orden");
        return replace;
    }


}
