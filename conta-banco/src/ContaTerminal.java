import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
   
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        float Saldo;


        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine(); 

        System.out.println("Por favor, digite o número da conta !");
        numero = scanner.nextInt(); 

        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo !");
        Saldo = scanner.nextFloat();
        
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %g já está disponível para saque ", nomeCliente, agencia, numero, Saldo );
        System.out.println(mensagem);
    }
}
