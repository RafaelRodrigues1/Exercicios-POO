package exerciciospoo1;

/**
 * @author RafaelRodrigues1
 */
public class Funcionario {
    
    private String nome;
    private double salarioB;
    private double imposto;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioB(double salarioB) {
        this.salarioB = salarioB;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }   
    
    private Double salarioL(){
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
