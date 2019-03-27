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
public class TiendaJuegos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Control c = new Control ();
        c.agregarJuego(new Juego("TETRIS",1 , 6000));
        System.out.print(c);
    }
    
}
