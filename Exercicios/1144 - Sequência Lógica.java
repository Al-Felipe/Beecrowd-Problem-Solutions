        Scanner sc = new Scanner(System.in);
        int qtdLinhas = sc.nextInt();
        for (int i = 1; i <= qtdLinhas; i++) {
            int x = i * i;
            int y = i * i * i;
            System.out.println(i + " " + x + " " + y);

            x++;
            y++;
            System.out.println(i + " " + x + " " + y);
        }
