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
public class Cola {
 NodoCola frente;
 NodoCola ultimo; 
    
    public void encola(NodoCola n){
   if (frente==null){
      frente = n;
      ultimo = n;
  }else{
      ultimo.setAtras(n);
      ultimo=n;
  }
 }   
public NodoCola atiende(){
     NodoCola aux=frente;
     if (frente!=null){
         frente = frente.getAtras();
         aux.setAtras(null);
     }
     
     return aux;
 }
  @Override
    public String toString() {
        String s = " ";
        NodoCola aux = frente;
        while (aux!=null){
            s+= aux+"\n";
            aux = aux.getAtras();
        }
        return s;
    }
}
