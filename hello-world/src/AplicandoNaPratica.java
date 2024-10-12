import java.util.ArrayList;

public class AplicandoNaPratica {
      public static void AplicandoNaPratica(String[] args) {
            // Trabalhando com Arrays
            int[] array = {1, 2, 3, 4, 5};
            for (int i = 0; i < array.length; i++) {
                System.out.println("Array elemento: " + array[i]);
            }
    
            // Trabalhando com ArrayList
            ArrayList<Integer> lista = new ArrayList<>();
            lista.add(1);
            lista.add(2);
            lista.add(3);
            for (int numero : lista) {
                System.out.println("ArrayList elemento: " + numero);
            }
        }
}
