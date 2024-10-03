        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == b) {
                flag = false;
            } else if (a > b) {
                System.out.println("Decrescente");
            } else {
                System.out.println("Crescente");
            }
        }
