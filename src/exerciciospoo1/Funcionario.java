package exerciciospoo1;

/**
 * @author RafaelRodrigues1
 */
public class Funcionario {
    
    public String nome;
    public double salarioB;
    public double imposto;
    
    public Double salarioL(){
        Double salarioL = this.salarioB - this.imposto;
        return salarioL;
    }
    
    public void aumentoSalario(double x){
        this.salarioB += (this.salarioB * x/100);
    }
    
    public String toString(){
        return "Nome: " + this.nome + String.format("\nSalário líquido: R$%.2f", this.salarioL());
    }
}
