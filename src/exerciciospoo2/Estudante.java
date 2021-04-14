package exerciciospoo2;

import java.util.Scanner;

/**
 * @author RAFAEL
 */
public class Estudante {
    Scanner in = new Scanner(System.in);
    String nome;
    Double nota1;
    Double nota2;
    Double nota3;
    
    private Double media(){
        double media = (this.nota1+this.nota2+this.nota3)/3;
        return media;
    }
    
    public void situacaoEstudante(){
        if(this.media()>=7){
            System.out.printf("Aluno: %s\nMédia: %.2f\nAPROVADO!\n", this.nome, this.media());
        }else{
            System.out.printf("Aluno: %s\nMédia: %.2f\nREPROVADO!\nFaltando %.2f para passar\n",
                    this.nome, this.media(), (7 - this.media()));
        }
    }
    public void insereDados(){
        System.out.print("Digite o nome do estudante: ");
        this.nome = in.next();
        System.out.println("Insira as 3 notas do estudante");
        System.out.print("Nota 1:");
        this.nota1 = in.nextDouble();
        System.out.print("Nota 2:");
        this.nota2 = in.nextDouble();
        System.out.print("Nota 3:");
        this.nota3 = in.nextDouble();
    }
}
