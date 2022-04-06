import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> actionNumber = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        Action actor = new Action();
        Random random = new Random();
        int n = 1234;//random.nextInt(8999) + 1000;
        int k = 0;
        while (n!=k) {
            k = scanner.nextInt();
            actionNumber.add(actionNumber.size(), k);
            System.out.println(actor.action(n,k));
            System.out.println(actionNumber);
            System.out.println(actor.countNumber);

        }
        if (n==k){
            actionNumber.clear();
            System.out.println("You win!");
        }
    }
}
