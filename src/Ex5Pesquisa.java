import java.util.Scanner;

public class Ex5Pesquisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maiorIdade = 0;
        int sexoFimininoVeia = 0;
        int menorIdade = 99999;
        int loopFim = 1;
        while (loopFim != -1){
            System.out.print("Sexo: ");
            String sexo = scanner.nextLine();
            System.out.print("Cor dos Olhos: ");
            String corOlhos = scanner.nextLine();
            System.out.print("Cor dos Cabelos: ");
            String corCabelo = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade > maiorIdade){
                maiorIdade = idade;
            }
            if (idade < menorIdade){
                menorIdade = idade;
            }
            if (sexo.equalsIgnoreCase("feminino") && idade >= 18 && idade <=35
                    && corOlhos.equalsIgnoreCase("verdes") && corCabelo.equalsIgnoreCase("louros")){
                sexoFimininoVeia++;
            }

            System.out.print("Se deseja parar digite -1:");
            loopFim = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("Maior idade: "+maiorIdade);
        System.out.println("Menor idade: "+menorIdade);
        System.out.println("Quantidade feminina especifica: "+sexoFimininoVeia);


    }
}
