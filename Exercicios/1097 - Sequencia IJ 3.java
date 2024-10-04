/* Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
*/

        int i = 1;
        int k = 7;
        int l = 5;
        while (i <= 9){
            for (int j = k; j >= l ; j--) {
                System.out.println("I=" + i + " J=" + j);
            }
            l+=2;
            k+=2;
            i+=2;
        }
