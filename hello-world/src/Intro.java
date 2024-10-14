public class Intro {
      /* Introdução a algoritmos de busca e ordenação.
      Algoritmos de Busca
      1. Busca Linear (Linear Search):

      Busca linear percorre cada elemento da lista até encontrar o elemento desejado ou chegar ao final da lista.
       */
      public static int busca(int[] array, int valor) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == valor) {
                    return i;  // Retorna o índice do elemento
                }
            }
            return -1;  // Retorna -1 se o elemento não for encontrado
        }
    
        public static void main(String[] args) {
            int[] array = {5, 3, 7, 2, 8};
            int valor = 7;
            int resultado = busca(array, valor);
            System.out.println("Elemento encontrado no índice: " + resultado);
        }
        /* 2. Busca Binária (Binary Search):

      Busca binária é mais eficiente, mas exige que o array esteja ordenado. Ela divide o array ao meio 
      repetidamente para encontrar o elemento desejado.
         
         */
        public static int busca1(int[] arraay, int vaalor) {
            int inicio = 0;
            int fim = arraay.length - 1;
    
            while (inicio <= fim) {
                int meio = (inicio + fim) / 2;
    
                if (arraay[meio] == vaalor) {
                    return meio;  // Retorna o índice do elemento
                } else if (arraay[meio] < vaalor) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
    
            return -1;  // Retorna -1 se o elemento não for encontrado
      }

            public static void main1(String[] args) {
                  int[] array1 = {2, 3, 5, 7, 8};
                  int valor1 = 7;
                  int resultado1 = busca(array1, valor1);
                  System.out.println("Elemento achado no índice: " + resultado1);
        }

}
