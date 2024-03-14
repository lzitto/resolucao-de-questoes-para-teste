public class InverterString {
    public static void main(String[] args) {
        // String a ser invertida
        String original = "Hello, world!";

        // Invertendo a string
        String invertida = inverterString(original);

        // Exibindo a string invertida
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }

    // Função para inverter uma string
    public static String inverterString(String str) {
        // Converter a string para um array de caracteres
        char[] caracteres = str.toCharArray();

        // Inverter os caracteres
        int inicio = 0;
        int fim = caracteres.length - 1;
        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        // Construir a string invertida a partir do array de caracteres
        return new String(caracteres);
    }
}
