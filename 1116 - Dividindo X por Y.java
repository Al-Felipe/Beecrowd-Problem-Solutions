        Scanner sc = new Scanner(System.in);
        int qtdValores = sc.nextInt();

        for (int i = 0; i < qtdValores; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                System.out.printf("%.1f\n", (double) x / y);
            }
        }
