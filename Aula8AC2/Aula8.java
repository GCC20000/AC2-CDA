package Aula8AC2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas notas serão inseridas?");
        int numNotas = scanner.nextInt();
        
        List<Double> notas = new ArrayList<>();
        List<Double> pesos = new ArrayList<>();
        
        double somaPesos = 0;
        for (int i = 1; i <= numNotas; i++) {
            System.out.println("Digite a nota " + i + ":");
            double nota = scanner.nextDouble();
            notas.add(nota);
            
            System.out.println("Digite o peso da nota " + i + " (em %):");
            double peso = scanner.nextDouble();
            pesos.add(peso);
            somaPesos += peso;
        }
        
        if (somaPesos > 100) {
            System.out.println("Erro: A soma dos pesos das notas não pode ser maior que 100%.");
            return;
        }
        
        double mediaFinal = calcularMediaFinal(notas, pesos);
        
        System.out.println("A média final do aluno é: " + mediaFinal);
        
        scanner.close();
    }
    
    public static double calcularMediaFinal(List<Double> notas, List<Double> pesos) {
        double soma = 0;
        for (int i = 0; i < notas.size(); i++) {
            soma += (notas.get(i) * pesos.get(i) / 100);
        }
        return soma;
    }
}
