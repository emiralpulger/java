import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        sozluk.size();

        for (String item: sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }

        System.out.println(sozluk);
        System.out.println(sozluk.get("table"));
    }
}