/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.observerp;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ConcretObservadoProducto implements IObservado{
    
    private ArrayList<IObservador> observadores = new ArrayList<IObservador>();

    public ConcretObservadoProducto() {
    }
    
    
    //se tiene q notificar a los opbservdores si hay un cambio este ejemplo notificara cuando se agrege un observador nuevo ese es el cambio
    @Override
    public void addObservador(IObservador observador) {
       this.observadores.add(observador);
       this.notificar();
       
    }

    @Override
    public void removeObservador(IObservador observador) {
       this.observadores.remove(observador);
    }

    @Override
    public void notificar() {
        for (IObservador observadors : observadores) {
            observadors.recibirNotificacion("se agrego nuevo observador en el observado");
            
        }
        System.out.println("\nfin notificaciones\n");
    }
    
}
