public class MatrizOperacoes {
    public static void exibirMatriz(int[][] matriz){
        for(int[] linha:matriz)
        {
            for(int elemento:linha){
                System.out.println(elemento + " ");
            }
            System.out.println();
        }
    }
    // a)Exibi a matriz transposta A^T
    public static int[][] transposta(int[][]matriz){
        int N =matriz.length;
        int[][] transposta = new int[N][N];

        for (int i = 0; i < N; i++)
        {
            for(int j = 0;j < N; j++)
            {
                transposta[i][j] = matriz[j][i];
            }
        }
        return transposta;
    }

    //b)exibir a soma dos quadrados da diagonal secundária
    public static int somaQuadradosDiagonalSecundaria(int[][] matriz)
    {
        int N = matriz.length;
        int soma = 0;

        for(int i = 0; i < N; i++ )
        {
            soma += matriz[i][N - 1 - i]* matriz[i][N - 1 - i];
        }
        return soma;
    }

    //c)Multiplicacao da matriz por uma constante c
    public static int[][] multiplicarPorConstante(int[][] matriz, int C){
        int N= matriz.length;
        int [][] resultado = new int[N][N];

        for (int i = 0; i < N; i++)
        {
            for(int j = 0; j < N; j++)
            {
                resultado[i][j] = matriz[i][j] * C;
            }
        }
        return  resultado;
    }

    //d) inverter a 3 linha com a 3 coluna
    public static void inverterLinhaColuna(int[][] matriz, int linha, int coluna){
        int N = matriz.length;

        for(int i = 0; i < N; i++){
            int temp = matriz[linha][i];
            matriz[linha][i] = matriz[i][coluna];
            matriz[i][coluna] = temp;
        }
    }

    public static void main(String[] args) {
        int [][] A = {
            {5,10,7,8},
            {13,4,1,3},
            {9,2,6,5},
            {10,7,4,9}
        };

        System.out.println("Matriz Original");
        exibirMatriz(A);

        // a) Exibir a matriz transposta
        System.out.println("\nMatriz Transposta:");
        int[][] transposta = transposta(A);
        exibirMatriz(transposta);

         // b) Soma dos quadrados da diagonal secundária
         int somaQuadrados = somaQuadradosDiagonalSecundaria(A);
         System.out.println("\nSoma dos quadrados da diagonal secundária: " + somaQuadrados);

        // c) Multiplicar a matriz por uma constante C
        int C = 2; // Exemplo de constante
        System.out.println("\nMatriz multiplicada por " + C + ":");
        int[][] matrizMultiplicada = multiplicarPorConstante(A, C);
        exibirMatriz(matrizMultiplicada);

        // d) Inverter a 3ª linha com a 3ª coluna
        inverterLinhaColuna(A, 2, 2); // Inverte a 3ª linha com a 3ª coluna
        System.out.println("\nMatriz após inverter a 3ª linha com a 3ª coluna:");
        exibirMatriz(A);
    }
}
