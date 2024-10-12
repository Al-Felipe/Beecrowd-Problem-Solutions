        Scanner sc = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int x, countPar = 0, countImpar = 0;
        for (int i = 0; i < 15; i++) {
            x = sc.nextInt();

            if (x % 2 == 0) {
                par[countPar] = x;
                countPar++;
            } else {
                impar[countImpar] = x;
                countImpar++;
            }

            if (countPar == 5) {
                countPar = 0;
                for (int j = 0; j < par.length; j++) {
                    System.out.println("par[" + j + "] = " + par[j]);
                }
            } else if (countImpar == 5) {
                countImpar = 0;
                for (int j = 0; j < impar.length; j++) {
                    System.out.println("impar[" + j + "] = " + impar[j]);
                }
            }
        }

        for (int i = 0; i < countImpar; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int i = 0; i < countPar; i++) {
            System.out.println("par[" + i + "] = " + par[i]);
        }
