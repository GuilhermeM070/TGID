package Empresa;

import java.util.ArrayList;
import java.util.List;

public class ServiçoEmpresa {

    private List<Empresa> empresas;

    public ServiçoEmpresa() {
        this.empresas = new ArrayList<>();
    }

    public void adicionarEmpresa(Empresa empresa) {
        this.empresas.add(empresa);
    }

    public void removerEmpresa(Empresa empresa) {
        this.empresas.remove(empresa);
    }

    public List<Empresa> getEmpresas() {
        return this.empresas;
    }

    public void adicionar(Empresa empresa) {
    }
}
