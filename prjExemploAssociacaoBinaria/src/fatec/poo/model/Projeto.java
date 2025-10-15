
package fatec.poo.model;

/**
 *
 * @author Fatec
 */

public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;   

    public Projeto(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDtInicio() {
        return dtInicio;
    }

    public String getDtTermino() {
        return dtTermino;
    }

    public void setDtInicio(String dtInicio) {
        this.dtInicio = dtInicio;
    }

    public void setDtTermino(String dtTermino) {
        this.dtTermino = dtTermino;
    }
}
