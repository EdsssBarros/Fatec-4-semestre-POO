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
public class Instrutor extends Pessoa {
    private int identificacao;
    private String areaAtuacao;
    
    public Instrutor (int ident, String n, String tel){
        super (n, tel);
        identificacao = ident;
    }
    
    public void setAreaAtuacao (String area){
        areaAtuacao = area;
    }
    
    public int getIdenficicacao(){
        return (identificacao);
    }   
    
    public String getAreaAtuacao(){
        return (areaAtuacao);
    }
}