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
public class ConcretObservadorCliente implements IObservador{
    String nombre;

    public ConcretObservadorCliente(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void recibirNotificacion(String cambio) {
        System.out.println(this.nombre+" recibio notificacion, cambio que sucedio: "+cambio);
    }
    
}
