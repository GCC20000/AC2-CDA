package Aula6AC2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota da AC1:");
        double ac1 = scanner.nextDouble();
        
        System.out.println("Digite a nota da AC2:");
        double ac2 = scanner.nextDouble();
        
        System.out.println("Digite a nota da AG:");
        double ag = scanner.nextDouble();
        
        System.out.println("Digite a nota da AF:");
        double af = scanner.nextDouble();
        
        System.out.println("Digite a nota mínima necessária:");
        double notaMinima = scanner.nextDouble();
        
        double mediaFinal = calcularMediaFinal(ac1, ac2, ag, af);
        
        System.out.println("A média final do aluno é: " + mediaFinal);
        
        List<String> notasMenoresQueMinima = notasMenoresQueMinima(ac1, ac2, ag, af, notaMinima);
        if (!notasMenoresQueMinima.isEmpty()) {
            System.out.println("Notas menores que a nota mínima necessária:");
            for (String nota : notasMenoresQueMinima) {
                System.out.println(nota);
            }
        } else {
            System.out.println("Todas as notas estão acima ou iguais à nota mínima necessária.");
        }
        
        scanner.close();
    }
    
    public static double calcularMediaFinal(double ac1, double ac2, double ag, double af) {
        return (ac1 * 0.15) + (ac2 * 0.30) + (ag * 0.10) + (af * 0.45);
    }
    
    public static List<String> notasMenoresQueMinima(double ac1, double ac2, double ag, double af, double notaMinima) {
        List<String> notasMenores = new ArrayList<>();
        if (ac1 < notaMinima) {
            notasMenores.add("AC1: " + ac1);
        }
        if (ac2 < notaMinima) {
            notasMenores.add("AC2: " + ac2);
        }
        if (ag < notaMinima) {
            notasMenores.add("AG: " + ag);
        }
        if (af < notaMinima) {
            notasMenores.add("AF: " + af);
        }
        return notasMenores;
    }
}
