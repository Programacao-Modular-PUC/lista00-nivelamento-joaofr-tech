import java.util.Scanner;

public class Ex7Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {
                "janeiro", "fevereiro", "marco", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        for (int i = 0; i < 12; i++) {
            System.out.print("Temperatura mes "+(i+1)+": ");
            temperaturas[i] = scanner.nextDouble();
        }

        double maiorTemperatura = 0;
        int mesDeMaiorTemperatura = 0;
        double menorTemperatura = 99999;
        int mesDeMenorTemperatura = 0;
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > maiorTemperatura){
                maiorTemperatura = temperaturas[i];
                mesDeMaiorTemperatura = i;
            }
            if (temperaturas[i] < menorTemperatura){
                menorTemperatura = temperaturas[i];
                mesDeMenorTemperatura = i;
            }
        }

        System.out.println("Maior temperatura: "+maiorTemperatura+" em "+meses[mesDeMaiorTemperatura]);
        System.out.println("Menor temperatura: "+menorTemperatura+" em "+meses[mesDeMenorTemperatura]);
    }
}
