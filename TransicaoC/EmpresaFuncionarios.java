import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


class Funcionario{
    String nome;
    String sexo;
    LocalDate dataNascimento;
    int idade;
    public Funcionario (String nome, String sexo, LocalDate dataNascimento)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.idade = calcularIdade(dataNascimento);
    }
    private int calcularIdade (LocalDate dataNascimento)
    {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}

public class EmpresaFuncionarios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        //coleta informacoes
        System.out.println ("Digite as informacoes dos funcionarios (Nome, sexo, Data de Nascimento):");

        for(int i = 0; i < 10; i ++)
        {
            System.out.println ("Funcionario" + (i+1) + ";");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.println ("Sexo (M/F):");
            String sexo = scanner.nextLine().toUpperCase();

            System.out.print("Data de Nascimento (dd/MM/yyyy):");
            String dataNascimentoStr = scanner.nextLine();
            LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

            funcionarios.add(new Funcionario(nome,sexo, dataNascimento));
        }

        int totalFuncionarios = funcionarios.size();
        int totalFeminino = 0;
        int totalMasculino = 0;
        int somaIdade = 0;
        int somaIdadesFeminino = 0;
        int somaIdadeMasculino = 0;

        System.out.println ("\nRelatorio dos funcionarios:");
        for (Funcionario func : funcionarios){
            System.err.println("Nome:" + func.nome + ",Sexo:" + func.sexo + ", Data de Nascimento:" + func.dataNascimento.format(formatter) + ", Idade:" + func.idade );
            somaIdade += func.idade;

            if(func.sexo.equals("F")){
                totalFeminino++;
                somaIdadesFeminino += func.idade;
            }
            else if (func.sexo.equals("M"))
            {
                totalMasculino++;
                somaIdadeMasculino += func.idade;
            }
        }
        double percentualFeminino = (totalFeminino/ (double) totalFuncionarios) * 100;
        double percentualMasculino = (totalMasculino/ (double) totalFuncionarios) *100;
        double idadeMediaGeral = somaIdade / (double) totalFuncionarios;
        double idadeMediaFeminina = totalFeminino == 0 ? 0: somaIdadesFeminino / (double) totalFeminino;
        double idadeMediaMasculino = totalMasculino == 0 ? 0: somaIdadeMasculino/ (double) totalMasculino;

        System.out.println("Total de Funcionarios: " + totalFuncionarios);
        System.out.println("Total de Funcionarias Femininas: "+ totalFeminino + "{" + percentualFeminino + "%}");
        System.out.println("Total de Funcionarios Masculino: "+ totalMasculino + "{" + percentualMasculino + "%}");
        System.out.println("Idade Media Geral: " + idadeMediaGeral);
        System.out.println("Idade Media das funcionarias Femininas: " + idadeMediaFeminina);
        System.out.println("Idade Media dos funcionario Masculinos: " + idadeMediaMasculino);
        scanner.close();
    }
    
}
