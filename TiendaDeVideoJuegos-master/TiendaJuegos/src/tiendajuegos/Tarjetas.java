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
public class Tarjetas {
  private int idTarjeta;
  private String fechaVencimiento;
  private String nombreTarjeta;

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreTarjeta() {
        return nombreTarjeta;
    }

    public void setNombreTarjeta(String nombreTarjeta) {
        this.nombreTarjeta = nombreTarjeta;
    }

    public Tarjetas(int idTarjeta, String fechaVencimiento, String nombreTarjeta) {
        this.idTarjeta = idTarjeta;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTarjeta = nombreTarjeta;
    }

    @Override
    public String toString() {
        return "Tarjetas{" + "idTarjeta=" + idTarjeta + ", fechaVencimiento=" + fechaVencimiento + ", nombreTarjeta=" + nombreTarjeta + '}';
    }
  
}
