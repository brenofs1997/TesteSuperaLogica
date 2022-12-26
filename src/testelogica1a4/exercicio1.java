/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testelogica1a4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class exercicio1 {

    public exercicio1() {
    }
    
    public void Exer1(){
    Scanner sc = new Scanner(System.in);
        //sc.useLocale(Locale.ENGLISH);
        //Locale.setDefault(new Locale("en", "US"));

        List<Integer> lista = new ArrayList<>();
        List<Integer> par = new ArrayList<>();
        List<Integer> impar = new ArrayList<>();

        int n = sc.nextInt();
        int i =0;
        for(i =0; i < n; i++) {
            lista.add(sc.nextInt());
        }

        for(Integer x : lista) {
            if (x % 2 == 0) {
                par.add(x);
            } else {
                impar.add(x);
            }
        }

        Collections.sort(par);
        Collections.sort(impar);
        Collections.reverse(impar);

        for(Integer y : par) {
            System.out.println(y);
        }
        for(Integer z : impar) {
            System.out.println(z);
        }

        sc.close();
    }
}
