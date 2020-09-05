/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.observerp;

/**
 *
 * @author User
 */
public class pruebaObserver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //creamos al observado
        IObservado producto = new ConcretObservadoProducto();
        
        //creamos los observadores
        IObservador cl1 = new ConcretObservadorCliente("juan");
        IObservador cl2 = new ConcretObservadorCliente("miguel");
        IObservador cl3 = new ConcretObservadorCliente("pepe");
        
        //agregamos los observadores en el observado entonces ahi ya estaria cambiando el producto y notificando q estamoa agregando observdaores
        producto.addObservador(cl1);
        producto.addObservador(cl2);
        producto.addObservador(cl3);
              
        
        

    }
    
}
