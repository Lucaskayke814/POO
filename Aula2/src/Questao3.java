import javax.swing.*;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String frase;
        int cont = 0;

        System.out.print("Digite uma frase: ");
        frase = ler.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'||frase.charAt(i)=='A'||frase.charAt(i)=='E'||frase.charAt(i)=='I'||frase.charAt(i)=='O'||frase.charAt(i)=='U')

                cont++;
        }
        System.out.println("Total de vogais: "+ cont);
    }
}
