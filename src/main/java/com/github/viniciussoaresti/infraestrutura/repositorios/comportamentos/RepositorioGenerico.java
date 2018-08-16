package com.github.viniciussoaresti.infraestrutura.repositorios.comportamentos;
import java.util.List;
/**
 *
 * @author Vinícius Soares
 */
public interface RepositorioGenerico <T, G> {
    public void inserir(T t);
    public void alterar (T t);
    public T recuperar (G codigo);
    public void deletar (T t);
    public List<T> recuperarTodos();  
}
