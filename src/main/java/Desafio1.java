import java.util.Scanner;

/*1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
 (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
 informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence
 ou não a sequência.*/

public class Desafio1 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (numero == num1 || numero == num2) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            return;
        }

        int proximoNumero = num1 + num2;

        while (proximoNumero <= numero) {
            if (proximoNumero == numero) {
                System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
                return;
            }
            num1 = num2;
            num2 = proximoNumero;
            proximoNumero = num1 + num2;
        }

        System.out.println("O número " + numero + " não pertence à sequência");
    }
}
