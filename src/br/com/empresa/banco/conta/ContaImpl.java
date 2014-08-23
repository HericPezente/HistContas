/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.banco.conta;

/**
 *
 * @author MEUS DOCUMENTOS
 */
class ContaImpl {

    private double saldo;

    public void deposita(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void saca(double valor) {
        if (this.getSaldo() >= valor) {
            saldo -= valor; 
            
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
