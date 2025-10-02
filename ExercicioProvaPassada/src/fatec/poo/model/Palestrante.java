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
public class Palestrante extends Pessoa{

    private String temaPalestra;
    private double taxaCobranca;
    private double totalReceber;

    public Palestrante(String c, String n, String pt){
        super(c, n);
        temaPalestra = pt;
    }

    public void setTaxaCobranca(double tc){
        taxaCobranca = tc;
    }

    public double getTaxaCobranca(){
        return(taxaCobranca);
    }

    public double getTotalReceber(){
        return(totalReceber);
    }

    public void addValorReceber(double vp){
        totalReceber = totalReceber + (vp * taxaCobranca);
    }
}