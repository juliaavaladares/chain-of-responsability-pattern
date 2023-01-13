package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import main.*;

public class EmprestimoTest {
    
    @Test
    public void assistenteDeGerenteDeveAprovarEmprestimo(){
        Gerente gerente = new Gerente(null);
        AssistenteDeGerente assistenteDeGerente = new AssistenteDeGerente(gerente);
        Emprestimo emprestimo = new Emprestimo(30000, "Comprar um carro");
        
        assertTrue(assistenteDeGerente.aprovarEmprestimo(emprestimo));
    }
    
    @Test
    public void atendenteDeveAprovarEmprestimo(){
        Gerente gerente = new Gerente(null);
        Atendente atendente = new Atendente(gerente);
        Emprestimo emprestimo = new Emprestimo(20000, "Comprar um carro");
        
        assertTrue(atendente.aprovarEmprestimo(emprestimo));
    }
    
    @Test
    public void gerenteDeveAprovarEmprestimo(){
        Gerente gerente = new Gerente(null);
        Emprestimo emprestimo = new Emprestimo(50000, "Comprar um carro");
        
        assertTrue(gerente.aprovarEmprestimo(emprestimo));
    }
}
