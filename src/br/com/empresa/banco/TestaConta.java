/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.HistoricoOperacao;
import sun.nio.cs.HistoricallyNamedCharset;



/**
 *
 * @author MEUS DOCUMENTOS
 */
class TestaConta {
    public static void main(String[] args){
        
         Conta cc= ContaCorrente.criar();
         cc.deposita(1000);
         cc.deposita(2000);
         
         for(HistoricoOperacao ho:ContaCorrente.lista){
             System.out.println(ho);
         }
         
         
         
    }
    
}
