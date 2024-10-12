        Scanner sc = new Scanner(System.in);
        int qtdTeste = sc.nextInt();
        for (int i = 0; i < qtdTeste; i++) {
            int x = sc.nextInt();
            int cont = 0;
            for (int j = 2; j < x; j++) {
                if (x % j == 0) cont++;
            }

            if (cont == 0) System.out.println(x + " eh primo");
            else System.out.println(x + " nao eh primo");
        }
