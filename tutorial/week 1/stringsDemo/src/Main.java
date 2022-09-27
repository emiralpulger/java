public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel.";
        System.out.println("Eleman sayısı: " + mesaj.length());
        System.out.println("5. Eleman: " + mesaj.charAt(4));
        // . elemana erişir
        System.out.println(mesaj.concat(" Yaşasın!"));
        //concat komutu parantez içindeki metini sona ekler
        System.out.println(mesaj.startsWith("b"));
        // ... ile başlıyorsa true
        System.out.println(mesaj.endsWith("."));
        char karakterler[] = new char[5];
        mesaj.getChars(0, 5, karakterler, 0);
        // bu komutu belirli yerden belirli yere kadar karakterleri alır. özel durumu 0'dan başlamaz.
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        //mesajın içerisindeki harfin kaçıncı olduğunu belirtir.
        System.out.println(mesaj.lastIndexOf('a'));
        // aramaya sondan başlar

        String yenimesaj = mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        // ilk karakteri veya karakterleri değiştrir
        System.out.println(mesaj.substring(2));
        // bir yerden  itibaren metini parçalar.
        System.out.println(mesaj.substring(2, 5));
        // bir yerden bir yere kadar parçalar

        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        // küçük harfe çevirir
        System.out.println(mesaj.toUpperCase());
        // büyük harfe çevirir
        System.out.println(mesaj.trim());
        // trimler
    }
}