import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite um valor para A: ");
        double a = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        double b = sc.nextInt();
        System.out.println("Digite um valor para C: ");
        double c = sc.nextInt();

        double delta = (b * b) - 4 * a * c;
        if (delta < 0){
            System.out.println("A equação não possui raizes reais.");
        } else if (delta > 0){
            System.out.println("A equação possui duas raizes reais.");
        } else {
            System.out.println("A equação possui uma raiz real.");
        }
        
        sc.close();
    }
}
