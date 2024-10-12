        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x != 0) {
            for (int i = 1; i <= x; i++) {
                if (i == x) System.out.print(i);
                else System.out.print(i + " ");
            }
            System.out.println();
            x = sc.nextInt();
        }
