import java.util.Scanner;

public class PesquisaPopulacao {
        public static void calcularMediaSalario()
        {
        Scanner scanner = new Scanner(System.in);
        double salario, somaSalarios = 0;
        int numeroDePessoas = 0;
        
            while (true) { 
                System.out.println("\n12Digite o salario (ou valor negativo para sair): ");
                salario = scanner.nextDouble();

                if (salario < 0){
                    break;
                }
                somaSalarios += salario;
                numeroDePessoas++;
            }
            if (numeroDePessoas > 0){
                double mediaSalario = somaSalarios/ numeroDePessoas;
                System.out.println("Media de salario da populacao: " + mediaSalario);
            }else{
                System.out.println("Nenhum dado foi inserido");
            }
            scanner.close();
        }

        public static void main(String[] args) {
            calcularMediaSalario();
        }
    }
