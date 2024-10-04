        Scanner sc = new Scanner(System.in);
        int notasValidas = 0;
        double media = 0;
        double somarNotas = 0;

        while (notasValidas != 2) {
            double nota = sc.nextDouble();
            if (nota >= 0 && nota <= 10) {
                somarNotas += nota;
                notasValidas++;
            } else {
                System.out.println("nota invalida");
            }
        }

        media = somarNotas / 2;
        System.out.println("media = " + String.format("%.2f", media));
