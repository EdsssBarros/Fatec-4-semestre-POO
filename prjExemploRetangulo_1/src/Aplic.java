/**
 *
 * @author edson.barros
 */
public class Aplic {
    public static void main(String[] args) {
        //Definição do ponteiro
        Retangulo objRet;
        
        //Instanciação (alocação) de um objeto da classe Retangulo
        objRet = new Retangulo();
        
        //Passagem de mensagem
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da altura do Retângulo" + obj.getAltura());
        System.out.println("Medida da base do Retângulo: " + obj.getBase());
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perímetro " + objRet.calcPerimetro());
    }
}