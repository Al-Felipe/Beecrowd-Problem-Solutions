        Scanner sc = new Scanner(System.in);
        int novoGrenal = 0;
        int qtdGrenais = 0;
        int vitoriasInter = 0;
        int vitoriasGremio = 0;
        int empates = 0;
        String nomeVencedor = "";

        while (novoGrenal != 2) {
            int golsInter = sc.nextInt();
            int golsGremio = sc.nextInt();

            if (golsInter == golsGremio) empates++;

            if(golsInter > golsGremio){
                vitoriasInter++;
            }else{
                vitoriasGremio++;
            }

            System.out.println("Novo grenal (1-sim 2-nao)");
            novoGrenal = sc.nextInt();
            qtdGrenais++;
        }

        nomeVencedor = vitoriasInter > vitoriasGremio ? "Inter" : "Gremio";

        System.out.println(qtdGrenais + " grenais");
        System.out.println("Inter:" + vitoriasInter);
        System.out.println("Gremio:" + vitoriasGremio);
        System.out.println("Empates:" + empates);
        System.out.println(nomeVencedor + " venceu mais");
