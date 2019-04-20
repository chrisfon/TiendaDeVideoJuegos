/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajuegos;
import javax.swing.JOptionPane;
/**
 *
 * @author PJ129
 */

public class Lista {
    
    private Usuario usuario;
    private NodoLista cabeza;
    private NodoLista ultimo;

    public void insertarJuego(Juego j) {
        if (cabeza == null) {
            cabeza = new NodoLista(j);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (j.getIdJuego() < cabeza.getDatoJuego().getIdJuego()) {
            NodoLista aux = new NodoLista(j);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (ultimo.getDatoJuego().getIdJuego() <= j.getIdJuego()) {
            NodoLista aux = new NodoLista(j);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {
            NodoLista aux = cabeza;
            while (aux.getNext().getDatoJuego().getIdJuego() < j.getIdJuego()) {
                aux = aux.getNext();
            }
            NodoLista temp = new NodoLista(j);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }
    
    
   public Juego extrae(int id){
       Juego p=null;
      if (cabeza!=null) {
            if (id>=cabeza.getDatoJuego().getIdJuego() && id<=ultimo.getDatoJuego().getIdJuego()) {
                if (cabeza.getDatoJuego().getIdJuego()==id) {
                    if (cabeza.getDatoJuego().getCantidadJuego()>0){
                     cabeza.getDatoJuego().setCantidadJuego(cabeza.getDatoJuego().getCantidadJuego() - 1);
                    p=cabeza.getDatoJuego();   
                    }
                    
                }else{
                     NodoLista aux=cabeza;               
                while(aux.getNext()!=cabeza){                
               aux=aux.getNext();               
                } 
                if (aux.getDatoJuego().getIdJuego()==id) {
                   if (aux.getDatoJuego().getCantidadJuego()>0){
                     aux.getDatoJuego().setCantidadJuego(aux.getDatoJuego().getCantidadJuego() - 1);
                    p=aux.getDatoJuego();   
                    }else{
                    
                       JOptionPane.showMessageDialog(null,"El juego se encuentra agotado!");
                    
                    } 
                    
                    if (aux.getNext()== ultimo) {
                        ultimo=aux;
                        
                    }
                 
                
                }
                    
                }               
               
            }
            
        }
     
    return p;
   }
    public void insertarUsuario(Usuario u){
        if (cabeza == null) {
            cabeza = new NodoLista(u);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);
            

        } else if (u.getUsuarioID() < cabeza.getDatoUsuario().getUsuarioID()) {
            NodoLista aux = new NodoLista(u);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (ultimo.getDatoUsuario().getUsuarioID()<= u.getUsuarioID()) {
            NodoLista aux = new NodoLista(u);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {
            NodoLista aux = cabeza;
            while (aux.getNext().getDatoUsuario().getUsuarioID() < u.getUsuarioID()) {
                aux = aux.getNext();
            }
            NodoLista temp = new NodoLista(u);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }
    
    public Usuario buscarUsuario (String nombreUsuario, String contrasenaUsuario){
       Usuario usuario = null;
       NodoLista aux= cabeza;
        if (cabeza!=null) {
            while(!aux.getDatoUsuario().getNombreUsuario().equals(nombreUsuario) && !aux.getDatoUsuario().getContraseñaUsuario().equals(contrasenaUsuario)){
                aux= aux.getNext();
            }
            if (aux.getDatoUsuario().getNombreUsuario().equals(nombreUsuario) && aux.getDatoUsuario().getContraseñaUsuario().equals(contrasenaUsuario)){
                usuario = aux.getDatoUsuario();
            }
            
        }
        return usuario;
    } 
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    @Override
    public String toString() {
        String s="";
       NodoLista aux= cabeza;
        if (cabeza!=null) {
            s+=aux+",";
            aux=aux.getNext();
            while(aux!=cabeza){
                s+=aux +",";
                aux= aux.getNext();
            }
        }
        return s;
    }
    
public Juego extraeSinResta(int id){
       Juego p=null;
      if (cabeza!=null) {
            if (id>=cabeza.getDatoJuego().getIdJuego() && id<=ultimo.getDatoJuego().getIdJuego()) {
                if (cabeza.getDatoJuego().getIdJuego()==id) {
                    if (cabeza.getDatoJuego().getCantidadJuego()>0){
                     
                    p=cabeza.getDatoJuego();   
                    }else{
                         JOptionPane.showMessageDialog(null,"El juego se encuentra agotado!");
                    }
                    
                }else{
                     NodoLista aux=cabeza;               
                while(aux.getNext()!=cabeza){                
               aux=aux.getNext();               
                } 
                if (aux.getDatoJuego().getIdJuego()==id) {
                   if (aux.getDatoJuego().getCantidadJuego()>0){
                     
                    p=aux.getDatoJuego();   
                    }else{
                        JOptionPane.showMessageDialog(null,"El juego se encuentra agotado!");
                   }
                    
                    if (aux.getNext()== ultimo) {
                        ultimo=aux;
                        
                    }
                 
                
                }
                    
                }               
               
            }
            
        }
     
    return p;
   }
    
}
