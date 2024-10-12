        Scanner sc = new Scanner(System.in);
        double[] x = new double[100];

        for (int i = 0; i < 100; i++) {
            double num = sc.nextDouble();
            x[i] = num;
            if (x[i] <= 10) System.out.println("A[" + i + "] = " + x[i]);
        }
