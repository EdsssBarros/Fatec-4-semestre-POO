package fatec.poo.model;

/**
 *
 * @author Nathalia, Edson
 */
public class Exame {
    private int codigo;
    private String descricao;
    private String data;
    private String horario;
    private double valor;
    //Associacao
    private Consulta consulta;

    public Exame(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }
    
    public void setConsulta(Consulta consulta){
        this.consulta = consulta;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }
}
