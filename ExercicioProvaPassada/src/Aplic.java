/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import Palestrante;
import Participante;
import Pessoa;
import java.text.DecimalFormat;
/**
 *
 * @author edson.barros
 */

 public class Aplic{
    public static void main(String[] args){

        DecimalFormat df = new DecimalFormat("#,##0.00");

        Participante partic1 = new Participante("99999999999", "Gislaine Moline", "gislaine.moline@eduzz.com");

        partic1.setValorPalestra(500);
        partic1.setPresenca(1);
        palest.addValorReceber(500);

        Participante partic2 = new Participante("88888888888", "Guilherme Hiroshi", "guilherme.kadoo@eduzz.com");

        partic2.setValorPalestra(800);
        partic2.setPresenca(0);
        palest.addValorReceber(800);

        Palestrante palest = new Palestrante("37537697892", "Edson Barros", "Atividade em fazer nada");

        System.out.println("Nome do palestrante: " + palest.getNome());
        System.out.println("CPF do Palestrante: " + palest.getCpf());

        System.out.println("\n\n Total faturado na palestra: " + palest.totalReceber());
        System.out.println("Taxa de cobrança: " + palest.taxaCobranca());
        System.out.println("Total a receber: " + palest.addValorReceber());
    }
 }