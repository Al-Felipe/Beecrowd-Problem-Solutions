        Scanner sc = new Scanner(System.in);
        int aux;
        int[] x = new int[20];

        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i < (x.length / 2); i++) {
            aux = x[i];
            x[i] = x[x.length - 1 - i];
            x[x.length - 1 - i] = aux;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
