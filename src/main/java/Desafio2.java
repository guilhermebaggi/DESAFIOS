import java.util.Scanner;

/*2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela ocorre. */

public class Desafio2 {
    public static void main(String[] args) {
        int cont = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe uma string: ");
        String texto = entrada.nextLine();

        char[] carac = texto.toCharArray();

        for( char c : carac){
            if ( c == 'a' || c == 'A'){
                cont++;
            }
        }

        if(cont > 0){
            System.out.println("A letra (a/A) apareceu" + cont+ "vezes na string");
        }

        System.out.println("A letra (a/A) não apareceu na string");
    }
}
