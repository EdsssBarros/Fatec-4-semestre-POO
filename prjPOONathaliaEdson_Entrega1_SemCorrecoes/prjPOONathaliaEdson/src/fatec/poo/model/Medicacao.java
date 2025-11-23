package fatec.poo.model;

/**
 *
 * @author Nathalia, Edson
 */
public class Medicacao {
    private String nome;
    private String dosagem;
    private int qtdDias;
    //Associacao
    private Consulta consulta;

    public Medicacao(String nome) {
        this.nome = nome;
    }

    public String getDosagem() {
        return dosagem;
    }

    public void setDosagem(String dosagem) {
        this.dosagem = dosagem;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public String getNome() {
        return nome;
    }
    
    public void setConsulta (Consulta consulta){
        this.consulta = consulta;
    }
}
