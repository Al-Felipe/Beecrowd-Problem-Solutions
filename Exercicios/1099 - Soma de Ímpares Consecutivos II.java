        Scanner sc = new Scanner(System.in);
        int qtdTestes = sc.nextInt();

        for (int i = 0; i < qtdTestes; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int min = Math.min(x, y);
            int max = Math.max(x, y);

            int oddSum = 0;
            for (int j = min + 1; j < max; j++) {
                if (j % 2 != 0) {
                    oddSum += j;
                }
            }
            System.out.println(oddSum);
        }
