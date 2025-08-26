/**
 *
 * @author edson.barros
 */
public class Exemplo5 {
    public static void main(String[] args) {
        
        int x;
        int cont = 1;
        
        x = (int)(Math.random() * 100);
        
        System.out.println("\t\tTabuada do " + x + "\n\n");
        
        do{
            
        System.out.println(x + "*" + cont + "=" + x*cont);
        cont++;
        }
        while (cont <=10);
    }
}
