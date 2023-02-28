public class OgrenciKrediManager extends BaseKrediManager{
    public double hesapla(double tutar){
        return tutar * 1.10;
        /*
        basekredimanagerda olan keywordu burada yeniden tanımlanmasına overridding denir.
         */
    }
}
