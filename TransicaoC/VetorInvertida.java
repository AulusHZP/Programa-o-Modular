public class VetorInvertida {
    public static int[] somarVetoresInvertido(int[] vetor1, int[] vetor2)
    {
        int N = vetor1.length;
        int[] resultado = new int[N];

        for (int i = 0; i < N; i++)
        {
            resultado[i] = vetor1[i] + vetor2[i]; 
        }

        for (int i = 0; i < N/2; i++)
        {
            int temp = resultado[i];
            resultado[i] = resultado [N- 1 - i ];
            resultado[N - 1 - i] = temp;
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] vetor1 = {5,7,3,9};
        int[] vetor2 = {2,4,10,8};

        int[] resultado = somarVetoresInvertido(vetor1, vetor2);

        for(int valor: resultado){
            System.out.println(valor + "\n ");
        }
    }
}
