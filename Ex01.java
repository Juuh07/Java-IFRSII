import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num1 = sc.nextInt();
        System.out.print("Digite outro número: ");
        int num2 = sc.nextInt();
        int dif;
        
        if(num1 > num2){
            dif = num1 - num2;
            System.out.println("A diferença entre " + num1 + " e " + num2 + " é: " + dif);
        } else {
            dif = num2 - num1;
            System.out.println("A diferença entre " + num2 + " e " + num1 + " é: " + dif);
        }
        sc.close();
    }
}
