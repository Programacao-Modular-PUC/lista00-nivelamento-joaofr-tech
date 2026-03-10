import java.util.Scanner;

public class Ex8Vendedor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] preco = new double[10];
        int[] numero = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Qual preco: ");
            preco[i] = scanner.nextDouble();
            System.out.print("Quantos: ");
            numero[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Preco total: "+(preco[i]*numero[i]));
            
        }
    }
}
