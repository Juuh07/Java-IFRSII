import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um valor: ");
        int num2 = sc.nextInt();
        System.out.println("Digite um valor: ");    
        int num3 = sc.nextInt();
        System.out.println("Digite um valor: ");
        int num4 = sc.nextInt();
        
        if(num1 % 2 == 0 && num1 % 3 == 0){
            System.out.println(num1);
        }
        if(num2 % 2 == 0 && num2 % 3 == 0){
            System.out.println(num2);
        }
        if(num3 % 2 == 0 && num3 % 3 == 0){
            System.out.println(num3);
        }
        if(num4 % 2 == 0 && num4 % 3 == 0){
            System.out.println(num4);
        }
        sc.close();
 }
}
