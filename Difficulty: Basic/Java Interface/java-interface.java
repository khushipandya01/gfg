class testClass implements in1 {

    public void display(int k) {

        int count = 0;

        for (int i = 2; i <= k; i++) {
            boolean prime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                count++;
            }
        }

        System.out.println(count);
    }
}