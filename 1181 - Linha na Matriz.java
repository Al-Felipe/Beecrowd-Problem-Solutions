        Scanner sc = new Scanner(System.in);
        int linha = sc.nextInt();
        double resultado = 0;
        char operacao = sc.next().toUpperCase().charAt(0);
        double[][] m = new double[12][12];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextDouble();
            }
        }

        for (int j = 0; j < m.length; j++) {
            resultado += m[linha][j];
        }

        if (operacao == 'M') resultado /= m.length;
        System.out.println(String.format("%.1f", resultado));
