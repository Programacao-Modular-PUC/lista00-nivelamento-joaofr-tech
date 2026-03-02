import java.util.Scanner;

public class Ex2Leitura3Valores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor X:");
        int x = scanner.nextInt();
        System.out.print("Valor Y:");
        int y = scanner.nextInt();
        System.out.print("Valor Z:");
        int z = scanner.nextInt();
        scanner.close();

        if (x > y && x > z){
            System.out.println("Maior é o X: "+x);
        }
        if (y > x && y > z){
            System.out.println("Maior é o Y: "+y);
        }
        if (z > x && z > y){
            System.out.println("Maior é o Z: "+z);
        }

        if (x < y && x < z){
            System.out.println("Menor é o X: "+x);
        }
        if (y < x && y < z){
            System.out.println("Menor é o Y: "+y);
        }
        if (z < x && z < y){
            System.out.println("Menor é o Z: "+z);
        }

        if (x > y && x < z || x > z && x < y){
            System.out.println("X ta dentro do intervalo");
        } else {
            System.out.println("X ta fora do intervalo");
        }

        if (x % y == 0 && x % z == 0){
            System.out.println("X é divisel por Y e Z");
        } else{
            System.out.println("X nao é divisivel");
        }

    }
}
