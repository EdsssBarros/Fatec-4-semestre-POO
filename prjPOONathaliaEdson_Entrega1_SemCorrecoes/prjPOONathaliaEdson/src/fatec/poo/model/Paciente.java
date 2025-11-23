package fatec.poo.model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author Nathalia, Edson
 */
public class Paciente extends Pessoa{
    private LocalDate dataNascimento;
    private double peso, altura;
    //associacao
    private ArrayList<Consulta> consultas;

    public Paciente(String cpf, String nome, LocalDate dataNascimento) {
        super(cpf, nome);
        this.dataNascimento = dataNascimento;
        this.consultas = new ArrayList<>();
    }

    public String getDataNascimento() {
       return dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }   

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

   public int calcIdade(LocalDate dataAtual){
    return Period.between(dataNascimento, dataAtual).getYears();
    }
    
    public double calcIMC(){
        return peso / Math.pow(altura, 2); 
    }
    
    public void addConsulta(Consulta c){
        consultas.add(c);
        c.setPaciente(this);
    }
}
