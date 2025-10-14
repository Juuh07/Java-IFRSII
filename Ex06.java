import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor para A: ");
        int a = sc.nextInt();
        System.out.println("Digite um valor para B: ");
        int b = sc.nextInt();
        System.out.println("Digite um valor para C: ");
        int c = sc.nextInt();

        if(a + b <= c || a + c <= b || b + c <= a){
            System.out.println("Os valores não formam um triângulo.");
        } else {
            if(a == b && b == c){
                System.out.println("Os valores formam um triângulo equilátero.");
            } else if (a == b || a == c || b == c){
                System.out.println("Os valores formam um triângulo isósceles.");
            } else {
                System.out.println("Os valores formam um triângulo escaleno.");
            }
        }
        sc.close();
    }
}
