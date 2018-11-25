package com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes;
import com.github.viniciussoaresti.pmgus.infraestrutura.dao.PersistenceDao;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.negocio.Ocorrencia;
import java.util.List;
/**
 *
 * @author pronatec
 */
public class RepositorioOcorrenciaImplBD implements RepositorioGenerico<Ocorrencia, Integer>{
    @Override
    public void inserir(Ocorrencia t){
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Ocorrencia t){
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Ocorrencia recuperar(Integer codigo){
       try{
           return (Ocorrencia)PersistenceDao.getInstance().read("select a from Ocorrencia a where a.codigo="+codigo).get(0);
       }catch(IndexOutOfBoundsException index){
           return null;
       }
    }

    @Override
    public void deletar(Ocorrencia t){
    PersistenceDao.getInstance().delete(t);
    
    }

    @Override
    public List<Ocorrencia> recuperarTodos(){
        return PersistenceDao.getInstance().read("select a from Ocorrencia a");
    }
}
