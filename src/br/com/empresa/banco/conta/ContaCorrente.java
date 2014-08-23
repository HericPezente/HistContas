/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco.conta;

import java.util.List;

/**
 *
 * @author MEUS DOCUMENTOS
 */
public class ContaCorrente implements ContaTributavel{
    
    
    ContaImpl contaimpl= new ContaImpl();
    public static List<HistoricoOperacao> lista;
    
    public ContaCorrente(){
    };
    
    public static ContaTributavel criar(){
        RegistroOperacaoConta registroOp=new RegistroOperacaoConta(new ContaCorrente());
        lista=registroOp.getHistoricoOp();
        //return new RegistroOperacaoConta(new ContaCorrente());
        return registroOp;
    }
    
    @Override
    public void deposita(double valor) {
        this.contaimpl.deposita(valor);
        
    }

    @Override
    public void saca(double valor) {
       this.contaimpl.saca(valor);
    }

    @Override
    public double getSaldo() {
        return this.contaimpl.getSaldo();
    }

    @Override
    public void atualiza(double taxa) {
        double saldo=this.contaimpl.getSaldo();
        saldo= saldo * taxa * 2;
        this.contaimpl.setSaldo(saldo);
       
    }

    @Override
    public double calculaTributavel() {
        return 12;
    }
    
}
