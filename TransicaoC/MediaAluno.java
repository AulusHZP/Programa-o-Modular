import java.util.Scanner;

public class MediaAluno {
    
    public static void calcularMedia(double nota1, double nota2, double nota3, char tipoMedia)
    {
        double media;

        if (tipoMedia == 'A'){
            media = (nota1 + nota2 + nota3)/3;
            System.out.println("Media aritmética: " + media);
        } else if (tipoMedia == 'P'){
            media = (nota1 *5 +  nota2 *3 + nota3 *2) / 10;
            System.out.println("Media ponderada: " + media);
        }
        else{
            System.out.println("Tipo de media invalido :(");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero de alunos:");
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++)
        {
            System.out.println("Aluno " + (i+1)+ ":");
            
            System.out.print ("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print ("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print ("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            System.out.println("Digite o tipo de media (A para aritmetica e P para ponderada):");
            char tipoMedia = scanner.next().toUpperCase().charAt(0);

            calcularMedia(nota1, nota2, nota3, tipoMedia);
            System.out.println();

        }
        scanner.close();
    }
}
