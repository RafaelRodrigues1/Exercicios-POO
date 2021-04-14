package exerciciospoo3;

import java.util.Scanner;

/**
 * @author RAFAEL
 */
public class ExerciciosPoo3 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double dolar, real, PrecoDolar;
        System.out.print("Qual o preço do dólar? R$");
        PrecoDolar = in.nextDouble();
        System.out.print("Quantos dólares você quer comprar? U$");
        dolar = in.nextDouble();
        real = ConversaoMoeda.cambio(PrecoDolar, dolar);
        System.out.println("Você terá de pagar R$" + real);
    }
}
