import java.util.Scanner;

public class VetorFatorial {

    public static int fatorial (int n){
        int fatorial = 1;
        for (int i = 1; i <= n; i++)
        {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main (String[] args){
        Scanner Scanner = new Scanner (System.in);
        int[] A = new int[15];
        int[] B = new int[15];

        System.out.println ("Digite 15 numeros inteiros:");
        for (int i = 0; i < 15; i++)
        {
            A[i]= Scanner.nextInt();
        }

        for(int i = 0; i< 15; i++)
        {
            B[i] = fatorial(A[i]);
        }

        System.out.println ("Vetor A:");
        for(int i = 0; i < 15; i++)
        {
            System.out.println(A[i]+ " ");
        }
        System.out.println ("Vetor B:");
        for (int i = 0; i < 15; i++)
        {
            System.out.println(B[i] + "");
        }
    }
}