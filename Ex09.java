import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Valor do salário: ");
        double salario = sc.nextDouble();

        if (salario < 5000){
            double reajuste = salario * 0.30;
            double novoSalario = salario + reajuste;
            System.out.println("O novo salário é: " + novoSalario);
        }else{
            System.out.println("O salário não terá reajuste.");
        }

        sc.close();
    }
}