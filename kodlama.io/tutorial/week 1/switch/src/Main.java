public class Main {
    public static void main(String[] args) {
        char grade = 'a';

        switch (grade) {
            case 'A':
                System.out.println("Mükemmel Geçtiniz!");
                break;
            case 'B':
                System.out.println("Çok İyi Geçtiniz!");
                break;
            case 'C':
                System.out.println("iyi Geçtiniz!");
                break;
            case 'D':
                System.out.println("Şartlı Geçtiniz!");
                break;
            case 'F':
                System.out.println("Maalesef Kaldınız!");
                break;
            default:
                System.out.println("Geçersiz Not Girdiniz!");
                break;
        }
    }
}