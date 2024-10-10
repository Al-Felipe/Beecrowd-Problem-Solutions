        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();
        int soma = 0;
        int qtdSomados = 0;

        while (x >= z) {
            z = sc.nextInt();
        }

        while (soma <= z) {
            soma += x;
            x++;
            qtdSomados++;
        }

        System.out.println(qtdSomados);
