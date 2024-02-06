package org.example;

// Klavyeden girilen "Affine Şifre" algoritmasıyla şifrelenmiş kelimeyi belirtilen anahtarlara göre çözümleyen program
// GXINB - a -> 5 b -> 1 = BURSA
//SVZPIQBF - s -> 5 -> 1 = TEKIRDAG

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String sm,m=" ";
        int i,a,b,y,ta=0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nLütfen Şifreli Kelimeyi Giriniz : ");
        sm = scanner.nextLine().toUpperCase();
        System.out.print("Anahtar ( a ) : ");
        a = scanner.nextInt();
        System.out.print("Anahtar ( b ) : ");
        b = scanner.nextInt();

        for (i=1; i<27; i++)
            if ((a*i)%26==1){
                ta=i;
                break;
            }
        for (i=0; i<sm.length(); i++) {
            y =(int) sm.charAt(i)-65;
            if (y - b < 0)
                y += 26;
            m+=(char) ((ta * (y - b)) % 26 + 65);
        }
        System.out.printf("Şifresi Çözülmüş Kelime : %s",m);
    }

}