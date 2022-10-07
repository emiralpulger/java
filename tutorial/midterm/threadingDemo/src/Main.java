public class Main {
    public static void main(String[] args) {
        KronometreThread thread1 = new KronometreThread("Thread1");
        KronometreThread thread2 = new KronometreThread("Thread2");
        KronometreThread thread3 = new KronometreThread("Thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}