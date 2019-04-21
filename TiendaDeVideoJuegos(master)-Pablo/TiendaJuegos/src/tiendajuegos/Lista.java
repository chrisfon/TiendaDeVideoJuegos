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

    public void insertarAparato(Aparato a) {
        if (cabeza == null) {
            cabeza = new NodoLista(a);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (a.getIdAparato()< cabeza.getAparato().getIdAparato()) {
            NodoLista aux = new NodoLista(a);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (ultimo.getAparato().getIdAparato() <= a.getIdAparato()) {
            NodoLista aux = new NodoLista(a);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {
            NodoLista aux = cabeza;
            while (aux.getNext().getAparato().getIdAparato() < a.getIdAparato()) {
                aux = aux.getNext();
            }
            NodoLista temp = new NodoLista(a);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }
    
    public void insertarCombo(Combos c) {
        if (cabeza == null) {
            cabeza = new NodoLista(c);
            ultimo = cabeza;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (c.getIdCombo()< cabeza.getCombos().getIdCombo()) {
            NodoLista aux = new NodoLista(c);
            aux.setNext(cabeza);
            cabeza.setBack(aux);
            cabeza = aux;
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else if (ultimo.getCombos().getIdCombo() <= c.getIdCombo()) {
            NodoLista aux = new NodoLista(c);
            aux.setBack(ultimo);
            ultimo.setNext(aux);
            ultimo = ultimo.getNext();
            ultimo.setNext(cabeza);
            cabeza.setBack(ultimo);

        } else {
            NodoLista aux = cabeza;
            while (aux.getNext().getCombos().getIdCombo() < c.getIdCombo()) {
                aux = aux.getNext();
            }
            NodoLista temp = new NodoLista(c);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp);
        }
    }
    
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
                     NodoLista aux=cabeza.getNext();               
                while(aux!=cabeza){                
               if (aux.getDatoJuego().getIdJuego()==id) {
                   if (aux.getDatoJuego().getCantidadJuego()>0){
                     aux.getDatoJuego().setCantidadJuego(aux.getDatoJuego().getCantidadJuego() - 1);
                    p=aux.getDatoJuego();   
                    }else{
                    
                       JOptionPane.showMessageDialog(null,"El juego se encuentra agotado!");
                    
                    } 
                    
                    
                 
                
                }
                    aux=aux.getNext();               
                } 
                
                    
                }               
               
            }
            
        }
     
    return p;
   }
       
   public Aparato extraeAparato(int id){
       Aparato p=null;
      if (cabeza!=null) {
            if (id>=cabeza.getAparato().getIdAparato() && id<=ultimo.getAparato().getIdAparato()) {
                if (cabeza.getAparato().getIdAparato()==id) {
                    if (cabeza.getAparato().getCantidadDisponible()>0){
                     cabeza.getAparato().setCantidadDisponible(cabeza.getAparato().getCantidadDisponible() - 1);
                    p=cabeza.getAparato();   
                    }
                    
                }else{
                     NodoLista aux=cabeza.getNext();               
                while(aux!=cabeza){                
               if (aux.getAparato().getIdAparato()==id) {
                   if (aux.getAparato().getCantidadDisponible()>0){
                     aux.getAparato().setCantidadDisponible(aux.getAparato().getCantidadDisponible() - 1);
                    p=aux.getAparato();   
                    }else{
                    
                       JOptionPane.showMessageDialog(null,"El aparato se encuentra agotado!");
                    
                    } 
                    
                    
                 
                
                }
                    aux=aux.getNext();               
                } 
                
                    
                }               
               
            }
            
        }
     
    return p;
   }
   
       
   public Combos extraeCombos(int id){
       Combos p=null;
      if (cabeza!=null) {
            if (id>=cabeza.getCombos().getIdCombo() && id<=ultimo.getCombos().getIdCombo()) {
                if (cabeza.getCombos().getIdCombo()==id) {
                    if (cabeza.getCombos().getCantidadDisponible()>0){
                     cabeza.getCombos().setCantidadDisponible(cabeza.getCombos().getCantidadDisponible() - 1);
                    p=cabeza.getCombos();   
                    }
                    
                }else{
                     NodoLista aux=cabeza.getNext();               
                while(aux!=cabeza){                
               if (aux.getCombos().getIdCombo()==id) {
                   if (aux.getCombos().getCantidadDisponible()>0){
                     aux.getCombos().setCantidadDisponible(aux.getCombos().getCantidadDisponible() - 1);
                    p=aux.getCombos();   
                    }else{
                    
                       JOptionPane.showMessageDialog(null,"El combo se encuentra agotado!");
                    
                    } 
                    
                    
                 
                
                }
                    aux=aux.getNext();               
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
       boolean encontrado = false;
        if (cabeza!=null) {
             if (aux.getDatoUsuario().getNombreUsuario().equals(nombreUsuario) && aux.getDatoUsuario().getContraseñaUsuario().equals(contrasenaUsuario)){
                usuario = aux.getDatoUsuario();
                return usuario;
             }
             aux = aux.getNext();
            while(aux != cabeza && !encontrado){
             if (aux.getDatoUsuario().getNombreUsuario().equals(nombreUsuario) && aux.getDatoUsuario().getContraseñaUsuario().equals(contrasenaUsuario)){
                usuario = aux.getDatoUsuario();
                encontrado = true;
            }else{
                 usuario = null;
                 
            }  
             
             aux = aux.getNext();
            }
            
                    }
        if (encontrado) {
            return usuario;
        } else {
            return null;
        }

    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    public String toStringJuego() {
        String s = "";
        NodoLista aux = cabeza;
        if (cabeza != null) {
            s += aux.toStringJuego() + ",";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux.toStringJuego() + ",";
                aux = aux.getNext();
            }
        }
        return s;
    }
    
    
    public String toStringAparato() {
        String s = "";
        NodoLista aux = cabeza;
        if (cabeza != null) {
            s += aux.toStringAparato()+ ",";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux.toStringAparato() + ",";
                aux = aux.getNext();
            }
        }
        return s;
    }
    
    public String toStringCombo() {
        String s = "";
        NodoLista aux = cabeza;
        if (cabeza != null) {
            s += aux.toStringCombo()+ ",";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux.toStringCombo() + ",";
                aux = aux.getNext();
            }
        }
        return s;
    }

    public Juego extraeSinRestaJuego(int id) {
        Juego p = null;
        if (cabeza != null) {
            if (id >= cabeza.getDatoJuego().getIdJuego() && id <= ultimo.getDatoJuego().getIdJuego()) {
                if (cabeza.getDatoJuego().getIdJuego() == id) {
                    if (cabeza.getDatoJuego().getCantidadJuego() > 0) {

                        p = cabeza.getDatoJuego();
                    } else {
                        JOptionPane.showMessageDialog(null, "El juego se encuentra agotado!");
                    }

                } else {
                    NodoLista aux = cabeza.getNext();
                    
                    while (aux != cabeza) {
                       if (aux.getDatoJuego().getIdJuego() == id) {
                        if (aux.getDatoJuego().getCantidadJuego() > 0) {

                            p = aux.getDatoJuego();
                        } else {
                            JOptionPane.showMessageDialog(null, "El juego se encuentra agotado!");
                        }

                        

                    }
                       aux = aux.getNext();
                    }
                    

                }

            }

        }

        return p;
    }

    public Aparato extraeSinRestaAparato(int id) {
        Aparato p = null;
        if (cabeza != null) {
            if (id >= cabeza.getAparato().getIdAparato() && id <= ultimo.getAparato().getIdAparato()) {
                if (cabeza.getAparato().getIdAparato() == id) {
                    if (cabeza.getAparato().getCantidadDisponible() > 0) {

                        p = cabeza.getAparato();
                    } else {
                        JOptionPane.showMessageDialog(null, "El aparato se encuentra agotado!");
                    }

                } else {
                    NodoLista aux = cabeza;
                    while (aux.getNext() != cabeza) {
                        aux = aux.getNext();
                    }
                    if (aux.getAparato().getIdAparato() == id) {
                        if (aux.getAparato().getCantidadDisponible() > 0) {

                            p = aux.getAparato();
                        } else {
                            JOptionPane.showMessageDialog(null, "El aparato se encuentra agotado!");
                        }

                        if (aux.getNext() == ultimo) {
                            ultimo = aux;

                        }

                    }

                }

            }

        }

        return p;
    }

    public Combos extraeSinRestaCombo(int id) {
        Combos p = null;
        if (cabeza != null) {
            if (id >= cabeza.getCombos().getIdCombo() && id <= ultimo.getCombos().getIdCombo()) {
                if (cabeza.getCombos().getIdCombo() == id) {
                    if (cabeza.getCombos().getCantidadDisponible() > 0) {

                        p = cabeza.getCombos();
                    } else {
                        JOptionPane.showMessageDialog(null, "El combo se encuentra agotado!");
                    }

                } else {
                    NodoLista aux = cabeza;
                    while (aux.getNext() != cabeza) {
                        aux = aux.getNext();
                    }
                    if (aux.getCombos().getIdCombo() == id) {
                        if (aux.getCombos().getCantidadDisponible() > 0) {

                            p = aux.getCombos();
                        } else {
                            JOptionPane.showMessageDialog(null, "El combo se encuentra agotado!");
                        }

                        if (aux.getNext() == ultimo) {
                            ultimo = aux;

                        }

                    }

                }

            }

        }

        return p;
    }

}
