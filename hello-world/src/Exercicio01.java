import java.util.Scanner;

public class Exercicio01 {
      public static void main(String[] args) {
            // Chamando o método
            saudacao();
            soma();
            repetindofor();
        }
    
            // Definição do método - Exercicio 01 -  Olá Mundo

            public static void saudacao() {
                  System.out.println("Olá, mundo!");
        }
            // Exercicio 02 - Soma
            public static void soma() {
                  Scanner scanner = new Scanner(System.in);
                  System.out.println("Digite o primeiro número: ");
                  int num1  = scanner.nextInt();
                  System.out.println("Digite o segundo número: ");
                  int num2 = scanner.nextInt();
                  int soma = num1 + num2;
                  System.out.println("A soma é: " + soma);
            }
            /*Exercício 3: Estrutura de Repetição (for)
            Escreva um programa que imprime os números de 1 a 10 usando um loop for. */
            public static void repetindofor() {
                  for (int gg = 1; gg <= 10; gg++) {
                        System.out.println("Repetição de: "+ gg);
                  }
            }


}