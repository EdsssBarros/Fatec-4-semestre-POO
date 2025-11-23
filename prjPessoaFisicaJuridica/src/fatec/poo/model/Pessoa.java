/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fatec.poo.model.PedidoCompra;
import java.util.ArrayList;
package fatec.poo.model;

/**
 *
 * @author edson
 */
public abstract class Pessoa {
    
    private String nome;
    private int anoInscricao;
    private double totalCompras;
    private ArrayList<PedidoCompra> pedidos;
    
    public Pessoa (String nome, int anoInscricao){
        
        this.nome = nome;
        this.anoInscricao = anoInscricao;
        this.totalCompras = 0;
        pedidos = new ArrayList<>();        
    }
    
    public abstract double calcBonus(int anoAtual);

    public void addCompras (double valor){
        this.totalCompras += valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoInscricao(int anoInscricao) {
        this.anoInscricao = anoInscricao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoInscricao() {
        return anoInscricao;
    }

    public double getTotalCompras() {
        return totalCompras;
    }
    
}
