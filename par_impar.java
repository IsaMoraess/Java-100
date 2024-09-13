/*Crie uma classe com um método que lê um número e determina se o mesmo é par ou ímpar. Um número é par se for divisível exato por 2, ou seja, se o referido número for dividido por 2 e for par o resto será zero. Esse método deve ser chamado pelo método main de outra classe do mesmo projeto. */

import java.util.Scanner;

public class par_impar{  // DECLAREI A CLASSE
    public void numero(){  // DECLAREI O MÉTODO
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("O valor " + num + " é par");
        }
        else
        System.out.println("O valor " + num + " é ímpar");
    }
}

