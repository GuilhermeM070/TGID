package Cliente;

import java.util.ArrayList;
import java.util.List;

public class ServiçoCliente {

    private List<Cliente> clientes;

    public ServiçoCliente() {
        this.clientes = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

    public List<Cliente> getClientes() {
        return this.clientes;
    }

    public void adicionar(Cliente cliente) {
    }
}