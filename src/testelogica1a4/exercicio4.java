/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelogica1a4;

import java.util.Scanner;

public class exercicio4 {

    public exercicio4() {
    }

    public void Exer4() {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de frases:");
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {
            String frase = readLine(leitor);
            StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
            parte1.reverse();
            parte2.reverse();
            System.out.println(parte1.toString() + parte2.toString());
        }
    }

    public static String readLine(Scanner leitor) {
        String line = leitor.nextLine();
        while (line.isEmpty()) {
            line = leitor.nextLine();
        }
        return line;
    }

}
