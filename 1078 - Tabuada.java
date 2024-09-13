/* Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N: 
1 x N = N      2 x N = 2N        ...       10 x N = 10N */

        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(i + " x " + valor + " = " + i*valor);
        }
