/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson.barros
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definição do ponteiro
        Circulo objCirc;

        //Instanciação (alocação) de um objeto da classe Circulo
        objCirc = new Circulo();

        objCirc.setRaio(5);

        System.out.println("Medida do raio do Círculo = " + objCirc.getRaio());
        System.out.println("Medida da área do Círculo = " + objCirc.calcArea());
        System.out.println("Medida do perímetro do Círculo = " + objCirc.calcPerimetro());
        System.out.println("Medida do diâmetro do Círculo = " + objCirc.calcDiametro());
    }
}