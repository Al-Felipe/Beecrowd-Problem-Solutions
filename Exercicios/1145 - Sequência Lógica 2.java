        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 1; i <= y; i++) {
            System.out.println(i);
            if (i % x == 0) System.out.println("");
            else System.out.print(" ");
        }
