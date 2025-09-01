
import java.util.Scanner;

/**
 *
 * @author edson.barros
 */
public class Aplic {
    public static void main(String[] args) {
        double medAlt, medBase;
        int opcao;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.print("Digite a medida da altura do retângulo: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base do retângulo: ");
        medBase = entrada.nextDouble();
        
        //instanciação de um objeto da Classe Retangulo
        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n\n1 - Consultar medida da área");
            System.out.println("2 - Consultar medida do perímetro");
            System.out.println("3 - Consultar medida da diagonal");
            System.out.println("4 - Encerrar");
            System.out.print("\n\tDigite a opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Medida da área: " + objRet.calcArea());
                    break;
                case 2:
                    System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
                    break;
                case 3:
                    System.out.println("Medida da diagonal: " + objRet.calcDiagonal());
                    break;
                default:
                    break;
            }
        }while (opcao < 4);
    }
}
