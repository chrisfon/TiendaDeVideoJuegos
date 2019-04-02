/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendajuegos;

/**
 *
 * @author jrsal
 */
public class Cola {
    NodoCola frente;
    NodoCola ultimo;
    
    
    public void encola(NodoCola d){
        if (frente==null) {
            frente=d;
            ultimo=d;
        }else{
            ultimo.setAtras(d);
            ultimo=d;
        }
    }
    
    public NodoCola atiende(){
       NodoCola aux=frente;
        if (frente!=null) {
            frente=frente.getAtras();
            aux.setAtras(null);
        }
                return aux;
            }
    
    public String toString(){
        String s="";
        NodoCola aux= frente;
        while(aux!=null){
            s+=aux.toString()+"\nfgdf";
            aux=aux.getAtras();
        }
        return s;
    }
}
