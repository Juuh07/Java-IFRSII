import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 9 ){
            System.out.println("O valor está na faia permitida!");
        } else {
            System.out.println("O valor está fora da faixa permitida!");
        }
        sc.close();
    }
}
