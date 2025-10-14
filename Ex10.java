import java.util.Scanner;

public class Ex10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nota do Trabalho de laboratório: ");
        double notaLab = sc.nextDouble();
        System.out.println("Nota da Avaliação Semestral: ");
        double notaSem = sc.nextDouble();
        System.out.println("Nota do Exame Final: ");
        double notaFinal = sc.nextDouble();

        double media = ((notaLab * 2) + (notaSem * 3) + (notaFinal * 5)) / 10;

        if (media >= 8 && media <= 10){
            System.out.println("A");
        } else if (media >= 7 && media < 8){
            System.out.println("B");
        } else if (media >= 6 && media < 7){
            System.out.println("C");
        } else if (media >= 5 && media < 6){
            System.out.println("D");
        } else if (media >= 0 && media < 5){
            System.out.println("E");
        }

        sc.close();
    }
}