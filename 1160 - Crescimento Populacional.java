        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ta, pb, anos;
        double G1, G2;
        for (int i = 1; i <= t; i++) {
            anos = 0;
            ta = sc.nextInt();
            pb = sc.nextInt();
            G1 = sc.nextDouble();
            G2 = sc.nextDouble();
            while (pb >= ta) {
                ta += (ta * G1) / 100;
                pb += (pb * G2) / 100;
                anos++;
                if (anos > 100) {
                    break;
                }
            }
            if (anos > 100) {
                System.out.println("Mais de 1 seculo.");
            } else {
                System.out.println(anos + " anos.");
            }
        }
