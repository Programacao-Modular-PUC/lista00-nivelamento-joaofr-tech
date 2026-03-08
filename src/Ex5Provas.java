import java.sql.Array;
import java.util.Scanner;

public class Ex5Provas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] gabarito = new char[8];
        System.out.println("Gabarito");
        for (int i = 0; i < 8; i++){
            System.out.print("Q"+(i+1)+" :");
            gabarito[i] = scanner.next().charAt(0);
        }

        char[][] gabaritoAlunos = new char[10][8];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                System.out.print("Q"+(i+1)+" :");
                gabaritoAlunos[i][j] = scanner.next().charAt(0);
                scanner.nextLine();
            }
        }

        int[] alunoNota = new int[10];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (gabaritoAlunos[i][j] == gabarito[j]){
                    alunoNota[i]++;
                }
            }
        }

        for (int i = 0; i < 8; i++){
            System.out.println("Aluno "+(i+1)+": "+alunoNota[i]);
        }

        System.out.println("\n=== Resultados ===");
        int aprovados = 0;
        for (int i = 0; i < 10; i++) {  // ← era i < 8
            String situacao = alunoNota[i] >= 6 ? "APROVADO" : "REPROVADO";
            System.out.println("Aluno " + (i+1) +" | Nota: " + alunoNota[i] + " | " + situacao);
            if (alunoNota[i] >= 6) {
                aprovados++;
            }
        }

        double porcentagem = (aprovados / 10.0) * 100;
        System.out.printf("Aprovação Porcentagem: "+ porcentagem);
    }
}

