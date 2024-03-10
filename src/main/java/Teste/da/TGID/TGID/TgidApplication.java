package Teste.da.TGID.TGID;

import Cliente.ServiçoCliente;
import Empresa.ServiçoEmpresa;
import Transação.ServiçoTransação;

public class DemoAplicação {

	public static void main(String[] args) {
		// Instancia um serviço de empresa
		ServiçoEmpresa serviçoEmpresa = new ServiçoEmpresa();

		// Cria uma empresa
		Empresa empresa = new Empresa("Empresa 1", "1234567890");

		// Adiciona a empresa ao serviço
		serviçoEmpresa.adicionar(empresa);

		// Instancia um serviço de cliente
		ServiçoCliente serviçoCliente = new ServiçoCliente();

		// Cria um cliente
		Cliente cliente = new Cliente("Cliente 1", "1234567890");

		// Adiciona o cliente ao serviço
		serviçoCliente.adicionar(cliente);

		// Instancia um serviço de transação
		ServiçoTransação serviçoTransação = new ServiçoTransação();

		// Cria uma transação
		Transação transação = new Transação(1, "2023-03-08", 100.0, "compra");

		// Adiciona a transação ao serviço
		serviçoTransação.adicionar(transação);

		// Imprime as empresas cadastradas
		System.out.println("Empresas cadastradas:");
		for (Empresa e : serviçoEmpresa.getEmpresas()) {
			System.out.println(e);
		}

		// Imprime os clientes cadastrados
		System.out.println("Clientes cadastrados:");
		for (Cliente c : serviçoCliente.getClientes()) {
			System.out.println(c);
		}

		// Imprime as transações cadastradas
		System.out.println("Transações cadastradas:");
		for (Transação t : serviçoTransação.getTransações()) {
			System.out.println(t);
		}
	}
}
