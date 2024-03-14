public class ProximoElemento {
    public static void main(String[] args) {
        
        int proximoA = proximoElementoSequenciaA(7);
        System.out.println("Próximo elemento da sequência a): " + proximoA);

        
        int proximoB = proximoElementoSequenciaB(64);
        System.out.println("Próximo elemento da sequência b): " + proximoB);

        
        int proximoC = proximoElementoSequenciaC(36);
        System.out.println("Próximo elemento da sequência c): " + proximoC);

        
        int proximoD = proximoElementoSequenciaD(64);
        System.out.println("Próximo elemento da sequência d): " + proximoD);

       
        int proximoE = proximoElementoSequenciaE(8);
        System.out.println("Próximo elemento da sequência e): " + proximoE);

        int proximoF = proximoElementoSequenciaF(19);
        System.out.println("Próximo elemento da sequência f): " + proximoF);
    }

    public static int proximoElementoSequenciaA(int ultimo) {
        return ultimo + 2;
    }
    
    public static int proximoElementoSequenciaB(int ultimo) {
        return ultimo * 2;
    }

    public static int proximoElementoSequenciaC(int ultimo) {
        int indice = (int) Math.sqrt(ultimo) + 1;
        return indice * indice;
    }

    public static int proximoElementoSequenciaD(int ultimo) {
        int indice = (int) Math.sqrt(ultimo) + 1;
        return indice * indice;
    }

    
    public static int proximoElementoSequenciaE(int ultimo) {
        int a = 0, b = 1;
        while (b <= ultimo) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    
    public static int proximoElementoSequenciaF(int ultimo) {
      
        return ultimo + 1;
    }
}
