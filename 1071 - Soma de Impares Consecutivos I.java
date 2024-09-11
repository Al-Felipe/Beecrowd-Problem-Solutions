import java.util.Scanner;

public class SomadeImparesConsecutivosI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int oddCount = 0;

        for (int i = Math.min(x,y) + 1; i < Math.max(x,y); i++) {
            if (i % 2 != 0){
                oddCount += i;
            }
        }

        System.out.println(oddCount);

    }
}

