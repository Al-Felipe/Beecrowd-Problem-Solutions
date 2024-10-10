        Scanner sc = new Scanner(System.in);
        int idade = sc.nextInt();
        double acumulaIdade = 0;
        double qtdIdade = 0;

        while (idade >= 0){
            acumulaIdade += idade;
            idade = sc.nextInt();
            qtdIdade++;
        }

        double media = acumulaIdade  / qtdIdade;
        System.out.println(String.format("%.2f", media));
