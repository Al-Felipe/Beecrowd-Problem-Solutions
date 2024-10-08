        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int max = Math.max(x, y);
        int min = Math.min(x, y);

        for (int i = min + 1; i < max; i++) {
            if (i % 5 == 2 || i % 5 == 3) {
                System.out.println(i);
            }
        }
