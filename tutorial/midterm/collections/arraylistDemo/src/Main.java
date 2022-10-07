import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        ArrayList sayilar = new ArrayList();

        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");
        //System.out.println(sayilar.size());

        //sayilar.set(0,100);

        //System.out.println(sayilar.get(0));

        //sayilar.remove(0);
        //sayilar.clear(); // tüm elemanları siler
        //System.out.println(sayilar.get(0));

        for (Object i : sayilar) {
            System.out.println(i);
        }
    }
}