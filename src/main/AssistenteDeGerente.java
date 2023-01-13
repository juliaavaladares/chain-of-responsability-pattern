package main;

public class AssistenteDeGerente extends Aprovador{
   
    public AssistenteDeGerente(Aprovador superior) {
        setSucessosr(superior);
    }

    @Override
    public boolean aprovarEmprestimo(Emprestimo emprestimo) {
        if (emprestimo.getTotalEmprestimo() < 45000 && emprestimo.getTotalEmprestimo() > 25000 ){
            return true;
        }
        if(getSucessor() != null){
            return getSucessor().aprovarEmprestimo(emprestimo);
        }
        return false;
    }
}
