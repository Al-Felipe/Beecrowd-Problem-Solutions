        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            int coordenadaX = sc.nextInt();
            int coordenadaY = sc.nextInt();

            if (coordenadaX == 0 || coordenadaY == 0) {
                break;
            }

            if (coordenadaX > 0 && coordenadaY > 0) {
                System.out.println("primeiro");
            } else if (coordenadaX < 0 && coordenadaY > 0) {
                System.out.println("segundo");
            } else if (coordenadaX < 0 && coordenadaY < 0) {
                System.out.println("terceiro");
            } else {
                System.out.println("quarto");
            }
        }
