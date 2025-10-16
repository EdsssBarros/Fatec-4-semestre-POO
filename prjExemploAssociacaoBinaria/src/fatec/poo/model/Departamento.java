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
public class Departamento {
    
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //multiplicidade 1..*, matriz de objetos
    private int numFunc;

    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0; //indica a posição do primeiro elementoda matriz de objetos
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }   
    
    //tem como parâmetro de entrada o endereço de um objeto da classe FuncionarioHorista, FuncionarioMensalista e 
    //FuncionariiComissionado
    public void addFuncionario (Funcionario f){
        funcionarios[numFunc]=f;
        numFunc ++;//numFunc += 1, numFunc +
    }
    
    public void listarFuncionarios(){
        System.out.println("/n/nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("Qtde. funcionarios: " + numFunc);
        System.out.println("/nRegistro/t/tnome/t/tCargo");
        for (int x = 0; x < numFunc; x++){
            System.out.print(funcionarios[x].getRegistro() + "/t/t");
            System.out.print(funcionarios[x].getNome() + "/t/t");
            System.out.println(funcionarios[x].getCargo() + "/t/t");            
        }
    }
}

