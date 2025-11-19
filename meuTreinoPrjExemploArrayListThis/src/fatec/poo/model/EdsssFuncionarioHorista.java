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
public class EdsssFuncionarioHorista extends EdsssFuncionario {
    
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public EdsssFuncionarioHorista (int registro, String nome, String dtAdmissao, double valHorTrab){
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    
    public void setQtdeHorTrab(int qtdeHorTrab){
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(0.075 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}
