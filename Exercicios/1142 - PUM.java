        Scanner sc = new Scanner(System.in);
        int qtdLinhas = sc.nextInt();
        int linha = 1;
        int x = 1;
        int y = 2;
        int z = 3;

        while (linha <= qtdLinhas) {

            if (linha == 1) {
                System.out.println(x + " " + y + " " + z + " PUM");
            } else {
                x += 4;
                y += 4;
                z += 4;
                System.out.println(x + " " + y + " " + z + " PUM");
            }
            linha++;
        }
