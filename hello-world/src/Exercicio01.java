//fazendo mudanças aqui para main.
import java.util.Scanner;

public class Exercicio01 {
      public static void main(String[] args) {
            // Chamando o método
            saudacao();
            soma();
            repetindofor();
            repetindowhile();
            manips();
            //fazendometodu();
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
            /*/* ### **Exercício 4: Estrutura de Repetição (while)**
            1. **Escreva um programa que imprime os números de 1 a 10 usando um loop** 
            `while`**.***/ 
            public static void repetindowhile(){
                  for (int vin = 1; vin <= 10; vin++){
                        System.out.println(vin);
                  } 
            }
            /* ### **Exercício 5: Introdução a Métodos**
            1. **Escreva um programa que possui um método para calcular 
            o quadrado de um número e imprime o resultado.** 
            public static void fazendometodu(){
                  int numero = 5;
                  int resultado = quadrado(numero);
                  System.out.println("O quadrado de " + numero + " é: " + resultado);
                  Não deu certo ;(
            */
            /*### **Exercício 6: Manipulação de Strings**

            1. **Escreva um programa que conta o número de caracteres em uma string fornecida pelo usuário.**
            
             */
            public static void manips(){
                  Scanner scannerr = new Scanner(System.in);
                  System.out.println("Digite uma palavra ou frase: ");
                  String texto = scannerr.nextLine();
                  int comprimento = texto.length();
                  System.out.println("Número de carecteres: " + comprimento);
            }
            
      }
