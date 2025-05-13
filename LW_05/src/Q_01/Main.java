package Q_01;

public class Main {
    public static void main(String[] args) {
        int i =10;
        int count = 0;

        while (i <= 49) {
            if (count % 10 == 0 && count != 0) {
                System.out.print("\n");
            }
            System.out.printf("%d ",i);
            count++;
            i++;
        }
    }
}
