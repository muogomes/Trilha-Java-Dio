

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            System.out.print("Digite o numero da conta: ");
                int numeroConta = sc.nextInt();
                    System.out.print("Digite o numero da agencia: ");
                        String numeroAgencia = sc.next();
                            System.out.print("Digite o nome de cliente: ");
                        String nomeCliente = sc.next();
                    System.out.print("Digite o valor do saldo: ");
                String valorSaldo = sc.next();    


        
        
        
        
        
        
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, " + "sua agência é " + numeroAgencia + " conta " + numeroConta + " e seu saldo" + valorSaldo +  " já está disponível para saque");
    }
}
