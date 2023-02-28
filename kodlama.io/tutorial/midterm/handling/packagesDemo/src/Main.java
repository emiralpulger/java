import matematik.DortIslem;
import matematik.Logaritma;
//import matematik.*; bu şekilde bütün classları dahil eder.

import java.util.Scanner;

//build-in o dilin içinde yer alan paketler
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınız : ");

        String isim = scanner.nextLine();

        System.out.println("Merhaba "+isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(1,2);
        Logaritma logaritma = new Logaritma();

    }
}