        Scanner sc = new Scanner(System.in);
        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            x[i] = num;
            if (x[i] <= 0) x[i] = 1;
            System.out.println("X[" + i + "] = " + x[i]);
        }
    }
