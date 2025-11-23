
import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        
        Departamento dep1 = new Departamento("CP", "Compras");
        Departamento dep2 = new Departamento("RH", "Recursos Humanos");        
         
        Projeto objPrj = new Projeto(1234, "Segurança no Trabalho");
        objPrj.setDtInicio("03/11/2025");
        objPrj.setDtTermino("25/11/2025"); 
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux. Administrativo");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionário horista " + funcHor.getNome() +
                           " trabalha no departamento de " +
                           funcHor.getDepartamento().getNome());
    
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionário mensalista " + funcMen.getNome() + 
                           " trabalha no departamento de " + 
                            funcMen.getDepartamento().getNome());
        
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionário comissionado " + funcCom.getNome() +
                           " trabalha no departamento de " +
                            funcCom.getDepartamento().getNome());
        
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        dep1.listarFuncionarios();
        
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        dep2.addFuncionario(funcCom);  
        dep2.listarFuncionarios();
        
        
       //Estabelece a associação binária
       //entre 1 objeto da classe FuncionarioHorista
       //com um objeto da classe Projeto
       funcHor.setProjeto(objPrj);
       System.out.println("\n\nO funcionário horista " + funcHor.getNome() +
                           " está alocado no projeto " + 
                           funcHor.getProjeto().getDescricao());
       
       //Estabelece a associação binária
       //entre 1 objeto da classe FuncionarioMensalista
       //com um objeto da classe Projeto
       funcMen.setProjeto(objPrj);
       System.out.println("O funcionário mensalista " + funcMen.getNome() +
                           " está alocado no projeto " + 
                           funcMen.getProjeto().getDescricao());

       //Estabelece a associação binária
       //entre 1 objeto da classe FuncionarioComissionado
       //com 1 objeto da classe Projeto
       funcCom.setProjeto(objPrj);
       System.out.println("O funcionário comissionado " + funcCom.getNome() +
                           " está alocado no projeto " + 
                           funcCom.getProjeto().getDescricao());
       
       //Estabelece a associação binária
       //entre 1 objeto da classe Projeto
       //com 1 ou mais objetos da classe Funcionario 
       //(Horista, Mensalista, Comissionado)
       objPrj.addFuncionario(funcHor);
       objPrj.addFuncionario(funcMen);
       objPrj.addFuncionario(funcCom);

       objPrj.listarFuncionarios();
    }    
}
