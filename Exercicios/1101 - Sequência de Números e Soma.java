        Scanner sc = new Scanner(System.in);
        int j = 0;

        while (j != 1) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int min = Math.min(x, y);
            int max = Math.max(x, y);
            int sum = 0;

            for (int i = min; i <= max; i++) {
                if (min <= 0 || max <= 0) {
                    j = 1;
                    break;
                }
                System.out.print(i + " ");
                sum += i;
            }
            if (sum > 0) {
                System.out.println("Sum=" + sum);
            }
        }
