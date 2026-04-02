import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //  Declaração de Variaveis 
        
        String nome; 
        int idade;
        int anos; 
        int meses; 
        int dias;

        // Objeto que recebe os dados 
        Scanner sc = new Scanner(System.in); 

        // Saída de Dados 
        System.out.println("Informe seu nome:"); 
        nome=sc.nextLine(); 
        System.out.println("Informe sua idade em anos");
        anos=sc.nextInt(); 
        System.out.println("Informe sua idade em meses");
        meses=sc.nextInt(); 
        System.out.println("Informe sua idade em dias"); 
        dias=sc.nextInt(); 

        idade = (anos * 365) + (meses * 30) + dias; 
        System.out.println("Nome: Sua idade em dias é " +idade); 

        sc.close();
    } 

    
     
}
