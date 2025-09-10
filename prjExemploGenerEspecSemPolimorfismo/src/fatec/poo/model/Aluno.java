/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author edson.barros
 */
public class Aluno extends Pessoa {
    private int regEscolar;
    private double mensalidade;
    
    public Aluno (int re, String n, String dn){
        super (n, dn); //chamada do método construtor da superclasse Pessoa
        regEscolar = re;
    }
    
    public void setMensalidade (double m){
        mensalidade = m;
    }
    
    public int getRegEscolar(){
        return(regEscolar);
    }
    
    public double getMensalidade(){
        return(mensalidade);
    }
}
