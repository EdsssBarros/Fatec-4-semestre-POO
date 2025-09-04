/**
 *
 * @author edson.barros
 */

public class Circulo {

    private double raio;
    private String unidadeMedida;
    
    //Definição do método construtor
    public Circulo (String uniMed){
        unidadeMedida = uniMed;
    }

    public void setRaio (double r){
        raio = r;
    }

    public double getRaio (){
        return (raio);
    }
    
    public String getUnidadeMedida(){
        return (unidadeMedida);
    }

    public double calcArea (){
        return (Math.PI * (Math.pow (raio, 2)));
    }

    public double calcPerimetro (){
        return (2 * Math.PI * raio);
    }

    public double calcDiametro (){
        return (2 * raio);
    }
}