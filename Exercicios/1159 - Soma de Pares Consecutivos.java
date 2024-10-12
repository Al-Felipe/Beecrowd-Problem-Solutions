        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x != 0) {
            int cont = 0;
            int soma = 0;
            while (cont < 5) {
                if (x % 2 == 0) {
                    soma += x;
                    cont++;
                }
                x++;
            }
            System.out.println(soma);
            x = sc.nextInt();
        }
