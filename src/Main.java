import javax.swing.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner SenaiScanner = new Scanner(System.in);


        //PERGUNTA//


        //        String InputSenaiJava = JOptionPane.showInputDialog("??");
        //
        //        int input = Integer.parseInt(InputSenaiJava);
        //        input++;
        //
        //        String InputSenaiJava = JOptionPane.showInputDialog("??");


        //OPÇÕES//
//
//        String[] SenaiValues = {"Aluno 1", "Aluno 2", "Aluno 3"};
//        String Input2 = (String)JOptionPane.showInputDialog(null,
//
//                "Quem tirou nota maxima na prova? ",
//                "Título da Caixa de Diálogo",
//                2,
//                null,
//                SenaiValues,
//                SenaiValues[1]);


       //SCANNER

//        Scanner SenaiScanner = new Scanner(System.in);
//
//        // Lendo os valores
//        int x = SenaiScanner.nextInt();  // Sem parâmetro
//        double y = SenaiScanner.nextDouble();  // Sem parâmetro
//        SenaiScanner.nextLine();  // Consumindo a nova linha que fica pendente após nextDouble
//        String z = SenaiScanner.nextLine();  // Lendo a linha inteira
//
//        // Imprimindo os valores
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//
//        // Fechando o scanner
//        SenaiScanner.close();

        //CONVERSÃO DE TIPOS COM JOPTIONOANE//

//        String input = JOptionPane.showInputDialog("Digite um número:");
//        int numero = Integer.parseInt(input);
//        JOptionPane.showMessageDialog(null, "O número digitado + 1 é: " + (numero+ 1));

        // LEITURA DE ARQUIVO COM SCANNER

                try {
                    File arquivo = new File("dados.txt");
                    Scanner scanner = new Scanner(arquivo);

                    while (scanner.hasNextLine()) {
                        String linha = scanner.nextLine();
                        System.out.println(linha);
                    }

                    scanner.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Arquivo não encontrado.");
                }
            }
        }
