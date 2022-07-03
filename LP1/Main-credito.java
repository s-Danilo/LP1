importar java.util.Scanner;

aula pública Exercício {
   public static void main(String[] args) {
        int conta, saldoInicial, itensComprados, creditosIns, limitCredito, saldoNv;

    Entrada do Scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta ou -1 para finalizar.");
            conta = entrada.nextInt();
        while(conta != -1){
            System.out.println("Digite o saldo inicial do cliente:");
                saldoInicial = entrada.nextInt();
            System.out.println("Digite o total do crédito:");
                itensComprados = entrada.nextInt();
            System.out.println("Digite o total de créditos do mes:");
                creditosIns = entrada.nextInt();
            System.out.println("Digite ou limite de crédito autorizado:");
                limiteCrédito = entrada.nextInt();
                    saldoNv = saldoInicial + itensComprados - creditosIns;

        if (saldoNv > limiteCredito){
            System.out.println("Limite de crédito excedido.");
            conta = -1;
        } senão
            System.out.printf("Limite de crédito aprovado. Saldo atual:\n %d \n", saldoNv);
            conta = -1;
        }


    }

}