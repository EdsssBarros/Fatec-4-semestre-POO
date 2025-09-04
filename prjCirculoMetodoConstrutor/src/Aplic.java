/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson.barros
 */
import java.util.Scanner;

public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String unidade;
        
        System.out.print("Digite a unidade de medida: ");
        unidade = entrada.next();
        
        //Definição do ponteiro e instanciação
        Circulo objCirc = new Circulo(unidade);

        objCirc.setRaio(5);

        System.out.println("Medida do raio do Círculo = " + objCirc.getRaio() + objCirc.getUnidadeMedida());
        System.out.println("Medida da área do Círculo = " + objCirc.calcArea() 
                + objCirc.getUnidadeMedida() + "²");
        System.out.println("Medida do perímetro do Círculo = " + objCirc.calcPerimetro() 
                + objCirc.getUnidadeMedida());
        System.out.println("Medida do diâmetro do Círculo = " + objCirc.calcDiametro() 
                + objCirc.getUnidadeMedida());
    }
}