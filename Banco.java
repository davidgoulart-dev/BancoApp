import java.util.List;

public class Banco {
    //atributos
    private String nome;
    private List<Conta> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    // Método para listar todos os clientes
    public void listarClientes() {
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            System.out.println(cliente.getNome());
        }
        }


}
