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
public class Juego {
 private String tituloJuego;
 private String desarolladorJuego;
 private String generoJuego;
 private String descripcionJuego;
 private int idJuego;
 private int cantidadJuego;
 private int precioJuego; 
// <editor-fold desc="Constructor, getter and setter"> 


    public Juego(String tituloJuego, String desarolladorJuego, String generoJuego, String descripcionJuego, int idJuego, int cantidadJuego, int precioJuego) {
        this.tituloJuego = tituloJuego;
        this.desarolladorJuego = desarolladorJuego;
        this.generoJuego = generoJuego;
        this.descripcionJuego = descripcionJuego;
        this.idJuego = idJuego;
        this.cantidadJuego = cantidadJuego;
        this.precioJuego = precioJuego;
    }
    
    public String getTituloJuego() {
        return tituloJuego;
    }

    public void setTituloJuego(String tituloJuego) {
        this.tituloJuego = tituloJuego;
    }

    public String getDesarolladorJuego() {
        return desarolladorJuego;
    }

    public void setDesarolladorJuego(String desarolladorJuego) {
        this.desarolladorJuego = desarolladorJuego;
    }

    public String getGeneroJuego() {
        return generoJuego;
    }

    public void setGeneroJuego(String generoJuego) {
        this.generoJuego = generoJuego;
    }

    public String getDescripcionJuego() {
        return descripcionJuego;
    }

    public void setDescripcionJuego(String descripcionJuego) {
        this.descripcionJuego = descripcionJuego;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public int getCantidadJuego() {
        return cantidadJuego;
    }

    public void setCantidadJuego(int cantidadJuego) {
        this.cantidadJuego = cantidadJuego;
    }

    public int getPrecioJuego() {
        return precioJuego;
    }

    public void setPrecioJuego(int precioJuego) {
        this.precioJuego = precioJuego;
    }
   // </editor-fold>

    @Override
    public String toString() {
        return "**********************************************************************\n"+"Titulo: " + tituloJuego+"\n" + " Desarollador: " + desarolladorJuego + "\n"+" Genero: " + generoJuego + "\n"+ " Desc. Breve: " + descripcionJuego + "\n"+ " Cantidad que quedan: " + cantidadJuego + "\n"+"ID de juego: "+ idJuego + "\n" + " Precio: " + precioJuego + "\n";
    }
   
    public String toStringCobro() {
        return "**********************************************************************\n"+"Titulo: " + tituloJuego+"  Precio: " + precioJuego + "\n";
    }

    String transferirInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
