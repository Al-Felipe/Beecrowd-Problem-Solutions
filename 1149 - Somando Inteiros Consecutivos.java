        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int soma = 0;

        while (n <= 0){
            n = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            soma += i + a;
        }

        System.out.println(soma);
