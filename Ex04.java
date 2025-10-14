import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        double a = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        double b = sc.nextInt();
        System.out.println("Digite um valor para C: ");
        double c = sc.nextInt();

        if(a + b <= c && a + c <= b && b + c <= a){
            System.out.println("Os valores não formam um triângulo.");
        } else {
            System.out.println("Os valores formam um triângulo.");
        }
        sc.close();
    }
}
