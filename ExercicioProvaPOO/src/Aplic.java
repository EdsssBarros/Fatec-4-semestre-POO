/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import fatec.poo.model.Funcionario;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import java.text.DecimalFormat;
/**
 *
 * @author edson.barros
 */

public class Aplic{
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,##0.00");
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/1978", 15.8);
        
        funcHor.setQtdeHorTrab(90);
        funcHor.setCargo("Programador");
        
        System.out.println("Registro: " + funcHor.getRegistro());
        System.out.println("Nome: " + funcHor.getNome());
        System.out.println("Data de Admissão: " + funcHor.getDtAdmissao());
        System.out.println("Cargo " + funcHor.getCargo());
        System.out.println("Salário Bruto: " + df.format(funcHor.calcSalBruto()));
    }
}
