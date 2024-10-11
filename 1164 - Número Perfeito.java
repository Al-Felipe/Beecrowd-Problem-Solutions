        Scanner sc = new Scanner(System.in);
        int qtdTestes = sc.nextInt();
        for (int i = 0; i < qtdTestes; i++) {
            int soma = 0;
            int x = sc.nextInt();
            for (int j = 1; j < x; j++) {
                if (x % j == 0) soma += j;
            }
            if (soma == x) System.out.println(x + " eh perfeito");
            else System.out.println(x + " nao eh perfeito");
        }
