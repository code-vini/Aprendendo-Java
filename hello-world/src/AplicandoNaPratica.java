public class AplicandoNaPratica {
      public static void main(String[] args) {
          // Declaração e Inicialização
          int[][][] matriz = new int[2][2][2];
  
          // Atribuindo valores
          int valor = 1;
          for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[i].length; j++) {
                  for (int k = 0; k < matriz[i][j].length; k++) {
                      matriz[i][j][k] = valor;
                      valor++;
                  }
              }
          }
  
          // Exibindo valores
          for (int i = 0; i < matriz.length; i++) {
              for (int j = 0; j < matriz[i].length; j++) {
                  for (int k = 0; k < matriz[i][j].length; k++) {
                      System.out.print(matriz[i][j][k] + " ");
                  }
                  System.out.println();
              }
          }
          String saudacao = "Olá, mundo!";

          // Concatenação de strings
          String parte1 = "Olá, ";
          String parte2 = "Java!";
          String saudacaoFinal = parte1 + parte2;
  
          // Métodos úteis
          int comprimento = saudacao.length();
          char letra = saudacao.charAt(1);
          String mundo = saudacao.substring(5, 10);
          boolean contem = saudacao.contains("mundo");
          String novaSaudacao = saudacao.replace('m', 'M');
          String maiusculas = saudacao.toUpperCase();
          String minusculas = saudacao.toLowerCase();
  
          // Exibindo resultados
          System.out.println("Saudação: " + saudacao);
          System.out.println("Saudação final: " + saudacaoFinal);
          System.out.println("Comprimento: " + comprimento);
          System.out.println("Letra na posição 1: " + letra);
          System.out.println("Substring: " + mundo);
          System.out.println("Contém 'mundo'? " + contem);
          System.out.println("Saudação com 'M': " + novaSaudacao);
          System.out.println("Maiúsculas: " + maiusculas);
          System.out.println("Minúsculas: " + minusculas);
      

      }
  }  