public class Main {
    public static void main(String[] args) {
    //07, de Outubro de 2024 - Aula de variaveis(tipo de dado texto)se constantes:
        String txt = "Vinicius Batista";

        System.out.println(txt);

        txt = "Cubo Academy";

        System.out.println(txt);
        //Constante
        final String txt2 = "Minha primeira constante";

        System.out.println(txt2);
    //08, de Outubro de 2024 - Tipos de dados primitivos: 
        //Número:
        //número inteiro:
        int numeroInteiro = 12;
        System.out.println(numeroInteiro);
        // números decimais (Double):
        double numeroDecimal = 12;
        System.out.println(numeroDecimal);
        //número lógico (boleano)
        boolean verdadeiroOuFalso = true;
        System.out.println(verdadeiroOuFalso);
    /*08, de Outubro de 2024 - Estrutura de condição IF:
        Trabalhando estrutura de decisão, é comparar algum valor, 
        usando operadores de comparação:
        ==, >=, <=, !=, >, <
        &&, ||, !nomeDaVariavel.
    */
        int numero1 = 10;
        int numero2 = 10;
        if (numero1 > numero2) {
            System.out.println("Numero 1 é maior que o número 2");
        
        } else if (numero1 == numero2) {
            System.out.println("Número 1 e 2 são iguais");
        } else {
            System.out.println("Número 2 é maior que o número 1");
        }
        //9, de Outubro de 2024 - Estruturas d repetição: for, while e do-while
        //For:
        for (int i = 0; i < 10; i++) {
            System.out.println("Contagem: " + i);
        }
        //While:
        int ipp = 0;
        while (ipp < 10) {
            System.out.println("Contagem: " + ipp); 
            ipp++;
        //Do-While
        int kkk = 0;
        do {
            System.out.println("Contagem: " + kkk);
                kkk++;
            } while (kkk < 10);
            
        }
        //9, de Outubro de 2024 - Introdução a métodos e funções.
        /*  public static void main(String[] args) {
        // Chamando o método
        saudacao();
    }

        // Definição do método
        public static void saudacao() {
        System.out.println("Olá, mundo!");
    }
}
 */       
      
         
    }
    

}
