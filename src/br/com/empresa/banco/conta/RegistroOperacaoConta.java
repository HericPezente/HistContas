/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco.conta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MEUS DOCUMENTOS
 */
class RegistroOperacaoConta implements ContaTributavel{
    
    private Conta conta;
    private Tributavel tributavel;
    private List<HistoricoOperacao> historicoOp= new ArrayList<HistoricoOperacao>();
    
    public RegistroOperacaoConta( ContaTributavel contatributavel){
        this.conta=contatributavel;
        this.tributavel=contatributavel;
        
    }

    public RegistroOperacaoConta(Conta conta){
        this.conta=conta;
    }
    
    @Override
    public void deposita(double valor) {
        double valorAnterior=this.conta.getSaldo();
        
        this.conta.deposita(valor);
        
        double valorAtual=this.conta.getSaldo();
        
        HistoricoOperacao historico=new HistoricoOperacao("Deposito", valorAnterior, valorAtual, valor);
        registraHistorico(historico);
        
    }

    @Override
    public void saca(double valor) {
        
        double valorAnterior=this.conta.getSaldo();
        
        this.conta.saca(valor);
        
        double valorAtual=this.conta.getSaldo();
        
        HistoricoOperacao historico=new HistoricoOperacao("Saque", valorAnterior, valorAtual, valor);
        registraHistorico(historico);
        
        
    }

    @Override
    public double getSaldo() {
        return this.conta.getSaldo();
    }

    @Override
    public void atualiza(double taxa) {
         
         
         double valorAnterior=this.conta.getSaldo();
        
        this.conta.atualiza(taxa);
        
        double valorAtual=this.conta.getSaldo();
        
        HistoricoOperacao historico=new HistoricoOperacao("Atualiza", valorAnterior, valorAtual, taxa);
        
        registraHistorico(historico);
         
    }

    @Override
    public double calculaTributavel() {
        return this.tributavel.calculaTributavel();
    }
    
    public void registraHistorico(HistoricoOperacao historicoOperacao){
        historicoOp.add(historicoOperacao);
    }
    
    public List<HistoricoOperacao> getHistoricoOp(){
        
        return historicoOp;
    }
    
    
}
