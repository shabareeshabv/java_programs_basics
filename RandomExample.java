import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <= 10; i++) {
            int x = r.nextInt(200)+100;
            //int x = 100 + r.nextInt(100); this logic is also same
            System.out.println(x);
        }
    }
}
