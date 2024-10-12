        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int soma = 0;
        int max = Math.max(x, y);
        int min = Math.min(x, y);

        for (int i = min; i <= max; i++) {
            if (i % 13 != 0) {
                soma += i;
            }
        }
        System.out.println(soma);
