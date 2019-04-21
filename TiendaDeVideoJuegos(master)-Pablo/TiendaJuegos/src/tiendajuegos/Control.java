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
 private Lista listaAparato = new Lista ();
 private Lista listaCombos = new Lista ();
 private Pilas carrito = new Pilas();
 private Cola orden = new Cola();
 private int contadorOrdenid = 1;
 Arbol a = new Arbol();
 
    public Lista getListaJuego() {
      System.out.print(listaJuego+"\n*************************\n");
        JOptionPane.showMessageDialog(null,listaJuego.toStringJuego()); 
        return listaJuego;
    }
    
    public Lista getListaAparato() {
      System.out.print(listaAparato+"\n*************************\n");
        JOptionPane.showMessageDialog(null,listaAparato.toStringAparato()); 
        return listaAparato;
    }
    
    public Lista getListaCombos() {
      System.out.print(listaCombos+"\n*************************\n");
        JOptionPane.showMessageDialog(null,listaCombos.toStringCombo()); 
        return listaCombos;
    }
    

    public void menuCarrito() {
      JOptionPane.showMessageDialog(null,carrito+"\n MONTO TOTAL DE LA ORDEN:"+carrito.montoTotal()+"\n"+"\n");

      int option = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1. para eliminar ultimo juego agregado (el mas arriba) o 0. para devolverse"));
      if (option == 0){
       menuUsuario();   
      }else if (option == 1){
          carrito.pop();
          System.out.print("Elimino exitosamente! El carrito ahora tiene: ");
          menuCarrito();
      }else{
          System.out.print("Opcion invalida");
          menuCarrito();
      }
        
    }

    public void setOrden(Pilas orden) {
        this.carrito = orden;
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

 int option = Integer.parseInt(JOptionPane.showInputDialog("\n1. Ver productos\n"
         + "2. Ver carrito\n"
         + "3. Buscar juego (sort)\n"
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
         orden.encola(new NodoCola(contadorOrdenid,new Orden (carrito,this.contadorOrdenid),listaUsuario.getUsuario().getNombreUsuario()));
         contadorOrdenid++;
         JOptionPane.showMessageDialog(null, "Su Orden ha sido completada!");
         System.out.println(orden.toString());
         limpiaCarrito();
         menuUsuario();
         break;
     //llevar usuario a area de pago       //llevar usuario a area de pago       //llevar usuario a area de pago       //llevar usuario a area de pago  
     
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

public void limpiaCarrito (){
    Pilas carrito1 = new Pilas();
    carrito = carrito1;
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
        JOptionPane.showMessageDialog(null, "El historial de ordenes es:\n"+orden);
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
   listaJuego.insertarJuego(new Juego("MEJOR TITULO 1", "MEJOR DESAROLLADOR 1", "Accion", "MEJOR DESCRIPCION", 1, 5, 100));
        listaJuego.insertarJuego(new Juego("El mejor juego x2 Electric Boogaloo", "Desarollador 2", "Estrategia", "Un juegaso 12/10", 2, 7, 2000));
         listaJuego.insertarJuego(new Juego("El mejor juego x3", "Desarollador 2", "Estrategia", "Un juegaso 12/10", 3, 7, 2000));
        listaAparato.insertarAparato(new Aparato("Audifonos", 2000, 50));
        listaAparato.insertarAparato(new Aparato("Mouse Gamer", 1500, 25));
        listaCombos.insertarCombo(new Combos("Call of duty", "Audifonos", 2450, 10, 1));
        listaUsuario.insertarUsuario(new Usuario("admin", "admin", 19, 1, 1));
        listaUsuario.insertarUsuario(new Usuario("user", "user", 18, 2, 2));
        carrito.push(new NodoPila(listaJuego.extrae(1)));
    }
    // </editor-fold> 

    public void menuCompra() {

        try {
            int product = Integer.parseInt(JOptionPane.showInputDialog(("\n" + "Seleccion el catalogo que desea ver: \n 1.Juegos\n2.Aparatos\n3.Combos")));
            switch (product) {
                case 1:
                    this.getListaJuego();
                    int option = Integer.parseInt(JOptionPane.showInputDialog(("\n" + "Insertar ID del juego que desea agregar al carrito o 0 para regresar")));

                    if (option == 0) {
                        menuUsuario();
                    } else {
                        if (listaJuego.extraeSinRestaJuego(option).getCantidadJuego() > 0) {
                            carrito.push(new NodoPila(listaJuego.extrae(option)));
                             JOptionPane.showMessageDialog(null, "El juego se ha agregado!");
                            menuCompra();
                        } else {

                            JOptionPane.showMessageDialog(null, "El juego se encuentra agotado!");
                        }

                    }
                    break;
                case 2:
                    this.getListaAparato();
                    int option1 = Integer.parseInt(JOptionPane.showInputDialog(("\n" + "Insertar ID del aparato que desea agregar al carrito o 0 para regresar")));

                    if (option1 == 0) {
                        menuUsuario();
                    } else {
                        if (listaAparato.extraeSinRestaAparato(option1).getCantidadDisponible() > 0) {
                            carrito.push(new NodoPila(listaAparato.extraeAparato(option1)));
                            menuCompra();
                        } else {

                            JOptionPane.showMessageDialog(null, "El aparato se encuentra agotado!");
                        }

                    }
                    break;

                case 3:
                    this.getListaCombos();
                    int option2 = Integer.parseInt(JOptionPane.showInputDialog(("\n" + "Insertar ID del combo que desea agregar al carrito o 0 para regresar")));

                    if (option2 == 0) {
                        menuUsuario();
                    } else {
                        if (listaCombos.extraeSinRestaCombo(option2).getCantidadDisponible() > 0) {
                            carrito.push(new NodoPila(listaCombos.extraeCombos(option2)));
                            menuCompra();
                        } else {

                            JOptionPane.showMessageDialog(null, "El combo se encuentra agotado!");
                        }

                    }

                    break;
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
