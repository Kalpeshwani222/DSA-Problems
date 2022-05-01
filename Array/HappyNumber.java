import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        // run this loop if number is not equal to the 1
        while (n != 1) {

            int current = n;
            int sum = 0;

            // reducing the number
            while (current != 0) {
                int rem = current % 10; // getting the last no -9
                sum = sum + (rem * rem); // 9 square is 81
                current = current / 10; // 1
            }

            // check if the set already contains this elements then number is not happy
            if (set.contains(sum)) {
                return false;
            }

            // then adding the sum into the set and assign the sum to the n;
            n = sum;
            set.add(n);
        }

        // if it is 1 return true
        return true;
    }

    public static void main(String[] args) {
        int n = 19;
        if (isHappy(n)) {
            System.out.println("happy");
        } else {
            System.out.println("NOT happy");
        }

    }
}
