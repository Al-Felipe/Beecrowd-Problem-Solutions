        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double[] n = new double[100];
        n[0] = x;

        for (int i = 1; i < n.length; i++) {
            n[i] = n[i - 1] / 2.0;
        }

        for (int i = 0; i < n.length; i++) {
            System.out.println("N[" + i + "] = " + String.format("%.4f", n[i]));
        }
