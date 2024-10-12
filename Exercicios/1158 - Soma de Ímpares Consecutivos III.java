        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int cont = 0;
            int soma = 0;
            int x = sc.nextInt();
            int y = sc.nextInt();
            while (cont < y) {
                if (x % 2 != 0) {
                    soma += x;
                    cont++;
                }
                x++;
            }
            System.out.println(soma);
