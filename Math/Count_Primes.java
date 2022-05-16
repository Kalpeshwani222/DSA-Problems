class Count_Primes {
    public static int countPrimes(int n) {
        if (n <= 2) {
            return 0; // checking 0 and 1
        }

        boolean[] composites = new boolean[n];

        int limit = (int) Math.sqrt(n);

        // array of composites -> True represents composite
        // and false represents prime
        for (int i = 2; i <= limit; i++) {
            if (composites[i] == false) {
                // marks the all the multiply of i as True
                // the first index to be flipped to true is i*i
                for (int j = i * i; j < n; j = j + i) {
                    composites[j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (composites[i] == false) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int n = 10;
        int res = countPrimes(n);
        System.out.println(res);
    }
}