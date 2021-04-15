package exerciciospoo1;

import java.util.Scanner;

/**
 * @author RafaelRodrigues1
 */
public class ExerciciosPoo1 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        System.out.print("Digite o nome do funcionário: ");
        f1.setNome(in.next());
        System.out.print("Digite o salário do funcionário: R$");
        f1.setSalarioB(in.nextDouble());
        System.out.print("Valor do imposto que será descontado do salário: R$");
        f1.setImposto(in.nextDouble());
        System.out.println(f1);  //Imprimir o objeto faz referência ao método toString.
        
        System.out.print("Aumento de salário(em %): ");
        f1.aumentoSalario(in.nextDouble());
        System.out.println(f1);
    }
    
}
