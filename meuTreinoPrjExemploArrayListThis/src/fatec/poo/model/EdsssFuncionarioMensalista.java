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
public class EdsssFuncionarioMensalista extends EdsssFuncionario {
    
    private double valSalMin;
    private double numSalMin;
    
    public EdsssFuncionarioMensalista(double valSalMin, int registro, String nome, String dtAdmissao){
        super(registro, nome, dtAdmissao);
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin (double numSalMin){
        this.numSalMin = numSalMin;
    }
    
    public double calcSalBruto(){
        return(valSalMin * numSalMin);
    }
    
}
