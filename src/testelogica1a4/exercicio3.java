/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelogica1a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio3 {

    public void Exer3() {
        
        
        Scanner ler = new Scanner(System.in);

        int n, k;
        System.out.printf("Informe o valor alvo");
        k = ler.nextInt();

        System.out.printf("Informe o tamanho do lista:");
        n = ler.nextInt();

        ArrayList<Integer> entrada = new ArrayList<Integer>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();
        ArrayList<Integer> numerosImpares = new ArrayList<Integer>();

        System.out.println("Informe os numeros da lista:");
        for (int i = 0; i < n; i++) {
            ler = new Scanner(System.in);
            entrada.add(ler.nextInt());
            int dif = i == 0 ? 0 : entrada.get(i) - entrada.get(i - 1);
            if (dif < 0) {
                dif = dif * -1;
            }
            if (entrada.get(i) % 2 == 0 && i > 0 && dif == k) {
                numerosPares.add(entrada.get(i));
            } else if (entrada.get(i) % 2 != 0 && i > 0 && dif == k) {
                numerosImpares.add(entrada.get(i));
            }
        }

        Collections.sort(numerosPares);
        Collections.sort(numerosImpares);
        Collections.reverse(numerosImpares);

        System.out.println("Numeros pares:");
        for (int par : numerosPares) {
            System.out.println(par);
        }

        System.out.println("Numeros impares:");
        for (int impar : numerosImpares) {
            System.out.println(impar);
        }
        ler.close();
    }

    public exercicio3() {
    }
}
