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


public class TesteLogica1a4 {

    public static void main(String[] args) {
        
        exercicio1 Ex1 = new exercicio1();
        exercicio2 Ex2 = new exercicio2();
        exercicio3 Ex3 = new exercicio3();
        exercicio4 Ex4 = new exercicio4();
        Scanner ler = new Scanner(System.in);

        int k;
        System.out.printf("Informe o exercicio:");
        k = ler.nextInt();
        
        if(k == 1)
            Ex1.Exer1();
        if(k == 2)
            Ex2.Exer2();
        if(k == 3)
            Ex3.Exer3();
        if(k == 4)
            Ex4.Exer4();
      
    }

}
