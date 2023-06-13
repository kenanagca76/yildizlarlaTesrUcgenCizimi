package odevler;

import java.util.Scanner;

public class yildizlarlaTersUcgen {
    public static void main(String[] args) {
        int i,j,k,basSayisi;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını girin:");
        basSayisi = input.nextInt();

        for(i=basSayisi; i >= 0; i--){
            for (j=1; j <= basSayisi-i; j++){
                System.out.print(" ");
            }
            for (k=1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

