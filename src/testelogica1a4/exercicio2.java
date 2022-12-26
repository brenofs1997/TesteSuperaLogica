/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelogica1a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

    public exercicio2() {
    }

    public void Exer2(){
        Scanner sc = new Scanner(System.in);

        double notas[] = {100.0, 50.0, 20.0, 10.0, 5.0, 2.0};
        double moedas[] = {1.0, 0.50, 0.25, 0.10, 0.05, 0.01};
        int qtdNota, qtdMoeda;

        double valor = sc.nextDouble();
        valor = (valor * 100) + 0.05;

        System.out.println("NOTAS:");
        for(int i = 0; i < notas.length; i++) {
            qtdNota = (int) (valor / (notas[i] * 100));
            valor %= notas[i] * 100;
            System.out.printf("%d nota(s) de R$ %.2f%n", qtdNota, notas[i]);
        }

        System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++) {
            qtdMoeda = (int) (valor / (moedas[i] * 100));
            valor %= moedas[i] * 100;
            System.out.printf("%d moeda(s) de R$ %.2f%n", qtdMoeda, moedas[i]);
        }

        sc.close();
    }
}
