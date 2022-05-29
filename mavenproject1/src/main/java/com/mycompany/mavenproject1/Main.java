/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author sergi
 * version v1.0
 */
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;
        
  /**
  * @param saldoactual saldo actual de la cuenta. --------------
  */

        operativa_cuenta();
    }

     /* Método que muestra el contenido del saldo actual además que permite incrementar 
            y reducir el saldo en la cuenta, a nombre de una persona, posteriormente mostrarlo e indicar si se ha conseguido 
            añadir o retirar     
    */    
    public static void operativa_cuenta() {
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");

        }
    }
}

