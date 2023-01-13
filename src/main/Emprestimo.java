package main;

public class Emprestimo{
    public float totalEmprestimo;
    public String descricaoEmprestimo;
    
    public Emprestimo(float totalEmprestimo, String descricaoEmprestimo) {
        this.totalEmprestimo = totalEmprestimo;
        this.descricaoEmprestimo = descricaoEmprestimo;
    }

    public float getTotalEmprestimo() {
        return totalEmprestimo;
    }
    public void setTotalEmprestimo(float totalEmprestimo) {
        this.totalEmprestimo = totalEmprestimo;
    }
    public String getDescricaoEmprestimo() {
        return descricaoEmprestimo;
    }
    public void setDescricaoEmprestimo(String descricaoEmprestimo) {
        this.descricaoEmprestimo = descricaoEmprestimo;
    }
}