        Scanner sc = new Scanner(System.in);
        int novoCalculo = 0;

        while (novoCalculo != 2) {
            double soma = 0;
            int j = 0;

            while (j < 2) {
                double nota = sc.nextDouble();
                if (nota >= 0.0 && nota <= 10.0) {
                    soma += nota;
                    j++;
                } else {
                    System.out.println("nota invalida");
                }
            }

                double media = (soma) / 2;
                System.out.println("media = " + String.format("%.2f", media));

                System.out.println("novo calculo (1-sim 2-nao)");
                novoCalculo = sc.nextInt();

                while (novoCalculo < 1 || novoCalculo > 2) {
                    System.out.println("novo calculo (1-sim 2-nao)");
                    novoCalculo = sc.nextInt();
                }
            }
