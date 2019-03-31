/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajuegos;

import javax.swing.JOptionPane;

/**
 *
 * @author ulacit
 */
public class Control {
 private Lista listaJuego = new Lista();
 private Lista listaUsuario = new Lista();
 private Pilas orden = new Pilas();
 
    public Lista getListaJuego() {
      System.out.print(listaJuego+"\n*************************\n");
        JOptionPane.showMessageDialog(null,listaJuego); 
        return listaJuego;
    }

    public void menuCarrito() {
      JOptionPane.showMessageDialog(null,orden+"\n MONTO TOTAL DE LA ORDEN:"+orden.montoTotal()+"\n"+"\n");

      int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1. para eliminar ultimo juego agregado (el mas arriba) o 0. para devolverse"));
      if (option == 0){
       menuUsuario();   
      }else if (option == 1){
          orden.pop();
          System.out.print("Elimino exitosamente! El carrito ahora tiene: ");
          menuCarrito();
      }else{
          System.out.print("Opcion invalida");
          menuCarrito();
      }
        
    }

    public void setOrden(Pilas orden) {
        this.orden = orden;
    }
    
    public Lista getListaUsuario() {
        return listaUsuario;
    }
    
    public void menuLogin (){
        try{
        llenarListasPRUEBA();
        int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la accion a realizar: \n1.Registrarse\n2.Ingresar:\n3.Cerrar "));
        switch (option){
            case 1:
                String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
                String contrasenaUsuario = JOptionPane.showInputDialog("Ingrese la contrasena");
                int edadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
                this.listaUsuario.insertarUsuario(new Usuario (nombreUsuario, contrasenaUsuario,edadUsuario,idUsuario));
                this.menuLogin();
                break;
                
            case 2:
                String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                String contrasenaIngresado = JOptionPane.showInputDialog("Ingrese la contrasena");
                Usuario usuario =this.listaUsuario.buscarUsuario(nombreIngresado, contrasenaIngresado); 
                if (usuario!=null){
                    this.listaUsuario.setUsuario(usuario);
                    JOptionPane.showMessageDialog(null, "Bienvenido "+usuario.getNombreUsuario());
                    menuUsuario();
                }else{
                    JOptionPane.showMessageDialog(null, "No se encontro referencias con los datos ingresados");
                    this.menuLogin();
                }
                break;
            case 3:
                System.exit(0);
            default:
                System.out.print("Esa opcion no existe\n");
                menuLogin();
        }
        
        
    }catch (Exception e){
       System.out.print("Parametro invalido\n");
       menuLogin();
    }
    }
public void menuUsuario(){

 int option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Ver juegos\n"
         + "2. Ver carrito\n"
         + "3. Buscar juego (sort)\n"
         + "4. Finalizar Orden\n"
         + "0.Salir\n"));
 try{
 switch(option){
     case 0:
         System.exit(0);
     case 1:
        menuCompra();
        break;
     case 2:
         menuCarrito();
         break;
         
     case 3:
      //agregar lo de buscar por genero o desarollador usando arboles   
     case 4:
     //llevar usuario a area de pago    
     default:
                System.out.print("Esa opcion no existe\n");
                menuUsuario();
 }
}
catch(Exception e){
    if (option==2){
       menuCarrito(); 
    }

    System.out.print("Parametro invalido\n");
    menuUsuario();
   
}
 }

 public void llenarListasPRUEBA(){
   listaJuego.insertarJuego(new Juego("MEJOR TITULO 1","MEJOR DESAROLLADOR 1","Accion","MEJOR DESCRIPCION",1,1,100));
   listaJuego.insertarJuego(new Juego("El mejor juego x2 Electric Boogaloo","Desarollador 2","Estrategia","Un juegaso 12/10",2,2,2000));
    listaUsuario.insertarUsuario(new Usuario("admin","admin",18,1));
    orden.push(new NodoPila(new Orden(listaJuego.extrae(1),this.orden.idOrden+1)));
 }
       // </editor-fold> 
 
 public void menuCompra(){
   
   getListaJuego();
   
   try{
   int option = Integer.parseInt(JOptionPane.showInputDialog(("\n"+ "Insertar ID del juego que desea agregar al carrito o 0 para regresar")));

   if (option == 0){
       menuUsuario();
   }else{
      if (listaJuego.extraeSinResta(option).getCantidadJuego()>0){
       
       orden.push(new NodoPila(new Orden(listaJuego.extrae(option),this.orden.idOrden+1)));
       menuCompra();   
      }else{
       
          JOptionPane.showMessageDialog(null,"El juego se encuentra agotado!");
      }
       
   }
   
 }catch (Exception e){
     System.out.print("Parametro invalido\n");
     menuCompra();
 }
 }
}
