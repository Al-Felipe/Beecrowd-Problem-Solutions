/* 
Leia um valor inteiro N. Este valor será a quantidade de valores que serão lidos em seguida. Para cada valor lido, 
mostre uma mensagem em inglês dizendo se este valor lido é par (EVEN), ímpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). 
No caso do valor ser igual a zero (0), embora a descrição correta seja (EVEN NULL), pois por definição zero é par, seu programa deverá imprimir apenas NULL.
*/
        Scanner sc = new Scanner(System.in);
        int qtdValorLido = sc.nextInt();

        for (int i = 0; i < qtdValorLido; i++) {
            int valor = sc.nextInt();
            if (valor % 2 == 0 && valor > 0) {
                System.out.println("EVEN POSITIVE");
            } else if (valor % 2 == 0 && valor < 0) {
                System.out.println("EVEN NEGATIVE");
            } else if (valor % 2 != 0 && valor > 0) {
                System.out.println("ODD POSITIVE");
            } else if (valor % 2 != 0 && valor < 0) {
                System.out.println("ODD NEGATIVE");
            } else {
                System.out.println("NULL");
            }
        }
