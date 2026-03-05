import java.text.spi.BreakIteratorProvider;
import java.util.Scanner;

public class Ex4VetoresXeY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numero de elementos em X:");
        int n = scanner.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++){
            System.out.print("Elemento "+(i+1)+" :");
            x[i] = scanner.nextInt();
        }

        System.out.print("numero de elementos em Y:");
        int m = scanner.nextInt();
        int[] y = new int[m];
        for (int i = 0; i < m; i++){
            System.out.print("Elemento "+(i+1)+" :");
            y[i] = scanner.nextInt();
        }

        int rep = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                if (x[i] == y[j]){
                    rep++;
                }
            }
        }

        int sizeVetorZ = (m+n)-rep;
        int[] z = new int[sizeVetorZ];
        int k = 0;

        for (int i = 0; i < n; i++){
            z[k++] = x[i];
        }

        for (int i = 0; i < m; i++){
            boolean repetido = false;
            for (int j = 0; j < k; j++){
                if (y[i] == z[j]){
                    repetido = true;
                    break;
                }
            }
            if (!repetido){
                z[k++] = y[i];
            }
        }

        System.out.println("Lista conjunta:");

        for (int i = 0; i < k; i++){
            System.out.println(z[i]);
        }
        scanner.close();
    }
}
