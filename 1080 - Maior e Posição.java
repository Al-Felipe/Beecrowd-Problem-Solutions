// Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

        Scanner sc = new Scanner(System.in);
        int[] valores = new int[100];
        int maiorValor = 0;
        int indice = 0;

        for (int i = 0; i < 100; i++) {
            int valor = sc.nextInt();
            valores[i] = valor;

            if (valores[i] > maiorValor){
                maiorValor = valores[i];
                indice = i + 1;
            }
        }

        System.out.println(maiorValor);
        System.out.println(indice);
