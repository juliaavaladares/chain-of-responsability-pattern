package main;

public class Atendente extends Aprovador {
    
    public Atendente(Aprovador superior) {
        setSucessosr(superior);
    }

    @Override
    public boolean aprovarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getTotalEmprestimo() < 25000){
            return true;
        }
        if(getSucessor() != null){
            return getSucessor().aprovarEmprestimo(emprestimo);
        }
        return false;
    }
    
}
