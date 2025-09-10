
import fatec.poo.model.Aluno;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson.barros
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno objAlu = new Aluno(1010, "Carlos Silveira","15/03/78");
        objAlu.setMensalidade(1500);
        
        System.out.println("Registro escolar" + objAlu.getRegEscolar());
        System.out.println("Nome: " + objAlu.getNome());
        System.out.println("Data Nascimento: " + objAlu.GetDataNascimento());
        System.out.println("Mensalidade: " + objAlu.getMensalidade());
    }
}