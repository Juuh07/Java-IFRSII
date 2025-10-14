import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um valor: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um valor: ");
        int num3 = sc.nextInt();

        if(num1 <= num2 && num1 <= num3){
            System.out.println("O menor valor é: " + num1);
        } else if (num2 <= num1 && num2 <= num3){
            System.out.println("O menor valor é: " + num2);
        } else {
            System.out.println("O menor valor é: " + num3);
        }

        sc.close();
    }
}
