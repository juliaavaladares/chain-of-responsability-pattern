package main;

import java.util.ArrayList;

public abstract class Aprovador {

    protected ArrayList listaDocumentos = new ArrayList();
    private Aprovador sucessor;

    public Aprovador getSucessor() {
        return sucessor;
    }

    public void setSucessosr(Aprovador sucessor) {
        this.sucessor = sucessor;
    }

    public abstract boolean aprovarEmprestimo(Emprestimo emprestimo);


}
