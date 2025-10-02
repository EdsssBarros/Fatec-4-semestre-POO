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
public class Participante extends Pessoa {
    private String email;
    private double valorPalestra;
    private boolean presenca;

    public Participante(String c, String n, String e){
        super(c, n);
        email = e;
    }

    public void setValorPalestra(double v){
        valorPalestra = v;
    }

    public void setPresenca(boolean p){
        presenca = p;
    }

    public String getEmail(){
        return(email);
    }

    public double getValorPalestra(){
        return(valorPalestra);
    }
}
