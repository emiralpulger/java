public abstract class GameCalculator {
    public abstract void hesapla();
    public final void gameOver(){
        System.out.println("Oyun bitti");
    }
    /*
       abstrack tanımlandığı zaman her class'ta kendi
       fonsiyonunu yazacak.
       final ise sadece burada yazılmış kodu kullanabilirsin override yapamazsın.
       abstrack sınıflar asla "new"lenemez.
     */
}
