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

public class FuncionarioComissionado extends Funcionario{
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int r, String n, String dtAdm, double tc){
        super(r, n, dtAdm);
        taxaComissao = tc;
    }
    
    public double getSalBase(){
        return (salBase);
    }
    
    public void setSalBase(double sb){
        salBase = sb;
    }
    
    public double getTaxaComissao(){
        return(taxaComissao);
    }
    
    public double getTotalVendas(){
        return(totalVendas);
    }
    
    public void addVendas(double vendas){
        totalVendas += vendas;
    }
    
    public double calcSalBruto(){
        return(salBase + (taxaComissao/100 * totalVendas));
    }
    
    public double calcGratificacao(){
        if (totalVendas <= 5000)
            return(0);
        else
            if(totalVendas <= 10000){
                return(calcSalBruto()*0.03);
            }
            else
                return(calcSalBruto()*0.05);
    }
    
    public double calcSalLiquido(){
        return(super.calcSalLiquido() + calcGratificacao());
    }
}