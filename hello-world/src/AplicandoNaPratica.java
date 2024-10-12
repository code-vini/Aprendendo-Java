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
      }
  }  