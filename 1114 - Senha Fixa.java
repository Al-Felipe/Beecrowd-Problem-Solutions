        Scanner sc = new Scanner(System.in);
        final int senhaCorreta = 2002;
        boolean flag = true;

        while (flag){
            int senhaUsuario = sc.nextInt();
            if (senhaUsuario == senhaCorreta){
                System.out.println("Acesso Permitido");
                flag = false;
            } else {
                System.out.println("Senha Invalida");
            }
        }
