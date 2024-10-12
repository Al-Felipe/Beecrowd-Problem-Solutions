        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0, y = 1, soma;

        for (int i = 1; i <= n; i++) {
            if (i == n) System.out.println(x);
            else System.out.print(x + " ");
            soma = x + y;
            x = y;
            y = soma;
        }
