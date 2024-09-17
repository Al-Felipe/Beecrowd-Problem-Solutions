/* Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. 
Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. 
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
*/

        Scanner sc = new Scanner(System.in);
        int qtdTestes = sc.nextInt();
        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        for (int i = 0; i < qtdTestes; i++) {
            int qtdCobaia = sc.nextInt();
            String tipoCobaia = sc.next();
            if (tipoCobaia.equals("C")) {
                totalCoelhos += qtdCobaia;
            } else if (tipoCobaia.equals("R")) {
                totalRatos += qtdCobaia;
            } else {
                totalSapos += qtdCobaia;
            }

            totalCobaias += qtdCobaia;
        }

        double percentualCoelhos = totalCoelhos * 100 / totalCobaias;
        double percentualRatos = totalRatos * 100 / totalCobaias;
        double percentualSapos = totalSapos * 100 / totalCobaias;


        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.println("Percentual de coelhos: " + String.format("%.2f", percentualCoelhos) + " %");
        System.out.println("Percentual de ratos: " + String.format("%.2f", percentualRatos) + " %");
        System.out.println("Percentual de sapos: " + String.format("%.2f", percentualSapos) + " %");
