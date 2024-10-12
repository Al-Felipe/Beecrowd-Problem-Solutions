        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            long anterior = 0, atual = 1, proximo;
            for (int i = 0; i < n; i++) {
                proximo = anterior + atual;
                anterior = atual;
                atual = proximo;
            }
            System.out.println("Fib(" + n + ") = " + anterior);
        }
