import java.sql.Array;
import java.util.Scanner;

public class Ex3Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] matriculaModelagem = new int[3];
        int[] matriculaPM = new int[3];
        System.out.print("Quantas matriculas(n): ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            System.out.print("Numero Matricula PM: ");
            matriculaPM[i] = scanner.nextInt();
            System.out.print("Numero Matricula Modelagem: ");
            matriculaModelagem[i] = scanner.nextInt();
        }
        int interseccao = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                if (matriculaPM[i] == matriculaModelagem[j]){
                    interseccao++;
                }
            }
        }

        System.out.println("Estao na duas materias: "+interseccao+" aluno(s)");

    }
}
