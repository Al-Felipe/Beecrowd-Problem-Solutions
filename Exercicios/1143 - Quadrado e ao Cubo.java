        Scanner sc = new Scanner(System.in);
        int qtdLinhas = sc.nextInt();
        int linha = 1;
        int x = 1;
        int y = 1;
        int z = 1;

        while (linha <= qtdLinhas) {
            if (linha == 1) {
                System.out.println(x + " " + y + " " + z);
            } else {
                x++;
                y = x * x;
                z = x * x * x;
                System.out.println(x + " " + y + " " + z);
            }
            linha++;
        }
