import java.util.Arrays;
import java.util.Scanner;

public class OrdenaValores {
    
        public static void ordenarEExibir(int a, int b, int c){
            int[] valores = {a, b, c};
            Arrays.sort(valores);
            System.out.println("Valores em ordem crescente: " + valores[0] + " , " + valores [1] + " , " + valores[2]);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o numero de conjuntos (N): ");
            int N = scanner.nextInt();

            for(int i = 0; i < N; i++ )
            {
                System.out.println("Conjunto " + (i + 1) + ":");

                System.out.println("Digite o primeiro valor: ");
                int valor1 = scanner.nextInt();

                System.out.print("Digite o segundo valor:");
                int valor2 = scanner.nextInt();

                System.out.print("Digite o terceiro valor:");
                int valor3 = scanner.nextInt();

                ordenarEExibir(valor1, valor2, valor3);
                System.out.println();
            }
            scanner.close();
        }
}
