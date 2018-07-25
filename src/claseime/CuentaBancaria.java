/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseime;

/**
 *
 * @author Vocho
 */
public class CuentaBancaria {

    long numero;
    String titular;
    long saldo;

    void ingresar(long cantidad) {
        saldo += cantidad;
    }

    void retirar(long cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= cantidad;
        }
    }

}
