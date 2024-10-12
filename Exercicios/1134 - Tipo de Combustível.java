        Scanner sc = new Scanner(System.in);
        int codigoCombustivel = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (codigoCombustivel != 4) {
            codigoCombustivel = sc.nextInt();
            if (codigoCombustivel == 1) alcool++;
            if (codigoCombustivel == 2) gasolina++;
            if (codigoCombustivel == 3) diesel++;
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
