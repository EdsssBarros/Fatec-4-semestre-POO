/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author edson
 */
public class PessoaFisica extends Pessoa {
    
    private String cpf;
    private double base;
    
    public PessoaFisica (String cpf, String nome, int anoInscricao){
        
        super(nome, anoInscricao);
        this.cpf = cpf;        
    }
    
    
    
}
