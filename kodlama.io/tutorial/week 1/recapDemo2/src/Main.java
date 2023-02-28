public class Main {
    public static void main(String[] args) {
        double[] mylist = {11.6, 2.1, 3.5};
        double max = mylist[0];
        double total = 0;

        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam = " + total);
        System.out.println(max);
    }
}