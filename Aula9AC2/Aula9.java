package Aula9AC2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos alunos terão as notas calculadas?");
        int numAlunos = scanner.nextInt();
        
        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("Digite o nome do aluno " + i + ":");
            String nomeAluno = scanner.next();
            
            System.out.println("Quantas notas serão inseridas para o aluno " + nomeAluno + "?");
            int numNotas = scanner.nextInt();
            
            List<Double> notas = new ArrayList<>();
            List<Double> pesos = new ArrayList<>();
            
            double somaPesos = 0;
            for (int j = 1; j <= numNotas; j++) {
                System.out.println("Digite a nota " + j + " para o aluno " + nomeAluno + ":");
                double nota = scanner.nextDouble();
                notas.add(nota);
                
                System.out.println("Digite o peso da nota " + j + " (em %) para o aluno " + nomeAluno + ":");
                double peso = scanner.nextDouble();
                pesos.add(peso);
                somaPesos += peso;
            }
            
            if (somaPesos > 100) {
                System.out.println("Erro: A soma dos pesos das notas não pode ser maior que 100% para o aluno " + nomeAluno + ".");
                continue;
            }
            
            double mediaFinal = calcularMediaFinal(notas, pesos);
            String condicao = calcularCondicao(mediaFinal);
            
            System.out.println("Aluno: " + nomeAluno);
            System.out.println("Média final: " + mediaFinal);
            System.out.println("Condição: " + condicao);
            System.out.println();
        }
        
        scanner.close();
    }
    
    public static double calcularMediaFinal(List<Double> notas, List<Double> pesos) {
        double soma = 0;
        for (int i = 0; i < notas.size(); i++) {
            soma += (notas.get(i) * pesos.get(i) / 100);
        }
        return soma;
    }
    
    public static String calcularCondicao(double mediaFinal) {
        if (mediaFinal >= 5) {
            return "Aprovado";
        } else if (mediaFinal >= 2.1) {
            return "Necessita fazer a substitutiva";
        } else {
            return "Reprovado";
        }
    }
}
