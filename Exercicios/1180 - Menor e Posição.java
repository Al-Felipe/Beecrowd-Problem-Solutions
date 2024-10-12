        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }

        int menorValor = x[0];
        int posicaoMenor = 0;

        for (int i = 1; i < x.length; i++) {
            if (x[i] < menorValor) {
                menorValor = x[i];
                posicaoMenor = i;
            }
        }

        System.out.println("Menor valor: " + menorValor);
        System.out.println("Posicao: " + posicaoMenor);
