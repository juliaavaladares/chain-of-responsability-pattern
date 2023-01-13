package main;

public class Gerente extends Aprovador {
    
    public Gerente(Aprovador superior) {
        setSucessosr(superior);
    }

    @Override
    public boolean aprovarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getTotalEmprestimo() >= 45000){
            return true;
        }
        if(getSucessor() != null){
            return getSucessor().aprovarEmprestimo(emprestimo);
        }
        return false;
    }
}
    

