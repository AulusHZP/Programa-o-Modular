import java.util.Scanner;

public class ParImparArray {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        int[] A = new int[10];
        int[] ParImpar = {0,0};

        System.out.println("Digite 10 numeros inteiros:");
        for (int i = 0; i < 10; i++){
            A[i] =  Scanner.nextInt();

            if (A[i] %2 == 0)
            {
                ParImpar[0]++;
            }
            else
            {
                ParImpar[1]++;
            }
        }
        System.out.println ("Numero de elementos pares: " + ParImpar[0]);
        System.out.println ("Numero de elementos impares: " + ParImpar[1]);

        Scanner.close();
    }
}
