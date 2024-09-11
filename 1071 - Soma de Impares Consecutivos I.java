// Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos números impares entre eles.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();
        int oddCount = 0;

        for (int i = Math.min(x,y) + 1; i < Math.max(x,y); i++) {
            if (i % 2 != 0){
                oddCount += i;
            }
        }

        System.out.println(oddCount);


