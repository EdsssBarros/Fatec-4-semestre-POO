package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Nathalia, Edson
 */
public class Consulta {
    private int codigo;
    private String data;
    private double valor;
    //associações
    private Medico medico;
    private Paciente paciente;
    private ArrayList<Exame> exames;
    private ArrayList<Medicacao> medicacoes;

    public Consulta(int codigo, String data) {
        this.codigo = codigo;
        this.data = data;
        this.exames = new ArrayList<>();
        this.medicacoes = new ArrayList<>();
}

    public int getCodigo() {
        return codigo;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcValorTotalPagar(){
        double valorTotal = this.valor; 
        for (Exame exame : exames) {
          valorTotal += exame.getValor();
        }
        return valorTotal;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    
    public void addMedicacao(Medicacao m){
        medicacoes.add(m);
        m.setConsulta(this);
    }
    
    public void addExame(Exame e){
        exames.add(e);
    }
}