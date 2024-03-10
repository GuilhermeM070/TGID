package TestAplicação;

public class AplicaçãoTeste {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("12345678901234", "Empresa Teste");
        Conta conta = new Conta(1234567890, 1000.0);
        empresa.adicionarConta(conta);
        System.out.println("Saldo da empresa: " + empresa.getSaldo());
    }
}
