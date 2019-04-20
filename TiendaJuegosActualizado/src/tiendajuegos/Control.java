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
 private Cola colaOrdenes = new Cola();
 private int contadorOrdenid = 1;
  Arbol a = new Arbol();
 
 
 
 
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
       
        int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la accion a realizar: \n1.Registrarse\n2.Ingresar:\n3.Cerrar "));
        switch (option){
            case 1:
                String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario:");
                String contrasenaUsuario = JOptionPane.showInputDialog("Ingrese la contrasena");
                int edadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cedula"));
                this.listaUsuario.insertarUsuario(new Usuario (nombreUsuario, contrasenaUsuario,edadUsuario,idUsuario,2));
                this.menuLogin();
                break;
                
            case 2:
                String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                String contrasenaIngresado = JOptionPane.showInputDialog("Ingrese la contrasena");
                Usuario usuario = this.listaUsuario.buscarUsuario(nombreIngresado, contrasenaIngresado); 
                if (usuario != null){
                    this.listaUsuario.setUsuario(usuario);
                    if (usuario.getUsuarioTipo() == 2){
                    JOptionPane.showMessageDialog(null, "Bienvenido "+usuario.getNombreUsuario());
                    menuUsuario();
                    } else if (usuario.getUsuarioTipo() == 1){
                     //menuADMIN (para ver ordenes pendientes, completadas y demas   
                     JOptionPane.showMessageDialog(null, "Bienvenido ADMIN");
                     menuAdmin();
                    }
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
         + "3. Buscar juego (sort) / ver mas comprados\n"
         + "4. Finalizar Orden\n"
         + "0.Salir\n"));
 try{
 
   switch(option){
     case 0:
         menuLogin();
     case 1:
        menuCompra();
        break;
     case 2:
         menuCarrito();
         break;
         
     case 3:
     
      Lista tmp = listaJuego;  
      tmp.pasarArbol(a);
      a.acomodarRonda(a.getRaiz());
      a.acomodarRonda(a.getRaiz());
      a.acomodarRonda(a.getRaiz());
      a.acomodarRonda(a.getRaiz());
      a.acomodarRonda(a.getRaiz());
      a.acomodarRonda(a.getRaiz());
      a.imprimirNivelCampeon(a.getRaiz(), 1);
      menuUsuario();
     case 4:
         
         colaOrdenes.encola(new NodoCola(contadorOrdenid,orden.pasarCola(),listaUsuario.getUsuario().getNombreUsuario()));
         contadorOrdenid++;
         JOptionPane.showMessageDialog(null, "Su Orden ha sido completada!");
         menuUsuario();
         break;
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

public void menuAdmin(){

 int option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Ver juegos\n"
         + "2. Agregar admin\n"
         + "3. Ver Historial de Ordenes\n"
         + "0. Salir\n"));
 try{
 
   switch(option){
     case 0:
         menuLogin();
     case 1:
        getListaJuego();
        break;
     case 2:
        String nombreUsuario = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
        String contrasenaUsuario = JOptionPane.showInputDialog("Ingrese la contrasena");
        int edadUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
        int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cedula del nuevo admin"));
        this.listaUsuario.insertarUsuario(new Usuario (nombreUsuario, contrasenaUsuario,edadUsuario,idUsuario,1));
        JOptionPane.showMessageDialog(null, "Ha agregado una nueva cuenta admin!");
        menuAdmin();
         
     case 3:
        JOptionPane.showMessageDialog(null, "El historial de ordenes es:\n"+colaOrdenes);
        menuAdmin();
     case 4:
     //VER COLA DE ORDENES, con print de completadas y no completadas (va a ser un valor boolean)   
         
     default:
                System.out.print("Esa opcion no existe\n");
                menuAdmin();
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
   listaJuego.insertarJuego(new Juego("MEJOR TITULO 1","MEJOR DESAROLLADOR 1","Accion","MEJOR DESCRIPCION",1,10,100));
   listaJuego.insertarJuego(new Juego("El mejor juego x2 Electric Boogaloo","Desarollador 2","Estrategia","Un juegaso 12/10",2,10,2000));
   listaJuego.insertarJuego(new Juego("El mejor juego x3 ","Desarollador 2","Estrategia","Un juegaso 12/10",3,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x4 ","Desarollador 2","Estrategia","Un juegaso 12/10",4,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x5 ","Desarollador 2","Estrategia","Un juegaso 12/10",5,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x6 ","Desarollador 2","Estrategia","Un juegaso 12/10",6,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x7 ","Desarollador 2","Estrategia","Un juegaso 12/10",7,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x8 ","Desarollador 2","Estrategia","Un juegaso 12/10",8,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x9 ","Desarollador 2","Estrategia","Un juegaso 12/10",9,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x10 ","Desarollador 2","Estrategia","Un juegaso 12/10",10,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x11 ","Desarollador 2","Estrategia","Un juegaso 12/10",11,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x12 ","Desarollador 2","Estrategia","Un juegaso 12/10",12,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x13 ","Desarollador 2","Estrategia","Un juegaso 12/10",13,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x14 ","Desarollador 2","Estrategia","Un juegaso 12/10",14,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x15 ","Desarollador 2","Estrategia","Un juegaso 12/10",15,10,3000));
   listaJuego.insertarJuego(new Juego("El mejor juego x16 ","Desarollador 2","Estrategia","Un juegaso 12/10",16,10,3000));
    listaUsuario.insertarUsuario(new Usuario("admin","admin",19,1,1));
    listaUsuario.insertarUsuario(new Usuario("user","user",18,2,2));
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

    public Control() {
    llenarListasPRUEBA();
    }


}
