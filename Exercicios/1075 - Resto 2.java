// Leia um valor inteiro N. Apresente todos os números entre 1 e 10000 que divididos por N dão resto igual a 2.
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        for (int i = 1; i <= 10000; i++) {
            if (i % valor == 2){
                System.out.println(i);
            }
        }
