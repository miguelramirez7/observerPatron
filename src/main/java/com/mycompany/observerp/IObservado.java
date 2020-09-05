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
public interface IObservado {
    public void addObservador(IObservador observador);
    public void removeObservador(IObservador observador);
    public void notificar();
}
