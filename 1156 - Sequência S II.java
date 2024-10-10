        double x, y =1, z, s=0;
        for(x =1; x <=39; x +=2)
        {
            z = x / y;
            s+= z;
            y *=2;
        }
        System.out.printf("%.2f\n", s);
