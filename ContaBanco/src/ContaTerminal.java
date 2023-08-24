import java.util.Scanner;

public class ContaTerminal {
    
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
    try (Scanner ler = new Scanner(System.in)) {
        int numero ;
        String agencia,nomedocliente,agenciaCorreta ;
        Double saldo;
            while (true) {
            System.out.println("1- Para Criar uma nova conta \n2- Para consultar seu saldo \n3- Sair");
            int key = ler.nextInt();
            
        switch (key) {
            case 1:
                System.out.printf("Informe o Numero da sua conta:\n");
                numero = ler.nextInt();
                System.out.printf("Informe a sua Agencia:\n");
                agencia = ler.next();
                System.out.printf("Informe o seu nome:\n");
                nomedocliente = ler.next();
                System.out.printf("Informe o saldo da sua conta\n");
                saldo = ler.nextDouble();

                System.out.println("Ola "  + nomedocliente + " , obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + "  , conta " + numero + " e seu saldo " + saldo + " ja esta disponivel para saque");
                Double saldo2 = saldo;
                break;
            case 2 :

                System.out.print("Digite o número da agência: ");
                agencia = ler.next();

                
                agenciaCorreta = agencia; 

                if (agencia == agenciaCorreta) {
                System.out.println("Agência correta. Bem-vindo!\nSeu saldo e de");
                } else {
                System.out.println("Agência incorreta. Verifique o número digitado.");
                }
                break;
            case 3:
                System.out.println("Saindo do programa.");
                return;  // Sai do programa quando o usuário escolhe a opção 3
            default:
            System.out.println("Opção inválida. Digite uma opção válida.");
        }
        }
    }
}
}
