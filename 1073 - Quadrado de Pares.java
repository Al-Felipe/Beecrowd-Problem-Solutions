  Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0){
                System.out.println(i + "^2 = " + i * i);
            }
        }
