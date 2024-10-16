import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cliente david = new Cliente();
        david.setNome("David");
        Conta cc = new ContaCorrente(david);
        cc.depositar(100);
        Conta poupanca = new ContaPoupanca(david);
        cc.transferir(100,poupanca);
        //Quando chamamos o construtor dela a conta já gera agencia e conta
      cc.imprimirExtrato();
      poupanca.imprimirExtrato();

        // Criar instância do Banco e adicionar contas
        Banco banco = new Banco();
        List<Conta> contas = new ArrayList<>();
        contas.add(cc);
        contas.add(poupanca);
        banco.setContas(contas);

        // Listar clientes
        System.out.println("=== Clientes ===");
        banco.listarClientes();

    }
}
