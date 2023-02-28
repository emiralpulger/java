public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers = new BaseKrediManager[]
                {new OgretmenKrediManager(),new TarimKrediManager(),new OgrenciKrediManager()};

        for (BaseKrediManager krediManager:krediManagers){
            System.out.println(krediManager.hesapla(1000));
        }

    }

    /* output : 1180.0
                1180.0
                1100.0
     */

}