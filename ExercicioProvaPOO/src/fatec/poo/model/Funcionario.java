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
abstract public class Funcionario {
    
    private int registro;
    private String nome;
    private String dtAdmissao;
    public String cargo;
    
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;
    }
    
    abstract double calcSalBruto();
    
    public int getRegistro(){
        return(registro);
    }
    
    public String getNome(){
        return(nome);
    }
    
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    } 
    
    public String getCargo(){
        return(cargo);
    }
    
    public void setCargo(String c){
        cargo = c;
    }
}