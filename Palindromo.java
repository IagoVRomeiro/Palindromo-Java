import java.util.Scanner;

public class Palindromo {
    
   
    public static boolean ePalindromo(String valor) {
     
        valor = valor.replaceAll("[^a-zA-Z]", "").toLowerCase();
        
        
        int inicio = 0;
        int fim = valor.length() - 1;
        
        
        while (inicio < fim) {
           
            if (valor.charAt(inicio) != valor.charAt(fim)) {
                return false;
            }
          
            inicio++;
            fim--;
        }
       
        return true;
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String linha;

        while (!(linha = ler.nextLine()).equals("FIM")) {
        
            if (ePalindromo(linha)) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        }
        ler.close();
    }
}
