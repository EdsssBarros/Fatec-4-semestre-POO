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
public class Pessoa {

    private String cpf;
    private String nome;

    public Pessoa(String c, String n){
        cpf = c;
        nome = n;
    }

    public String getCpf(){
        return(cpf);
    }

    public String getNome(){
        return(nome);
    }    
}