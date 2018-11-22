package com.github.viniciussoaresti.pmgus.controladores;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import com.github.viniciussoaresti.pmgus.infraestrutura.repositorios.implementacoes.RepositorioOcorrenciaImplBD;
import com.github.viniciussoaresti.pmgus.negocio.Ocorrencia;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
/**
 *
 * @author vinic
 */
@ManagedBean
@SessionScoped
public class OcorrenciaController {
    
    private RepositorioGenerico<Ocorrencia,Integer> repositorioOcorrencia = null;
    private Ocorrencia ocorrenciaCadastro;
    private Ocorrencia selectedOcorrencia;

    public void setRepositorioOcorrencia(RepositorioGenerico<Ocorrencia, Integer> repositorioOcorrencia) {
        this.repositorioOcorrencia = repositorioOcorrencia;
    }

    public RepositorioGenerico<Ocorrencia, Integer> getRepositorioOcorrencia() {
        return repositorioOcorrencia;
    }    
    
    public OcorrenciaController(){
        this.repositorioOcorrencia = new RepositorioOcorrenciaImplBD();
        this.ocorrenciaCadastro = new Ocorrencia();
        
    }
    
     public void inserir(){
        //String nome =((String)((HttpSession)FacesContext.getCurrentInstance().getExternalContext().getSession(true)).getAttribute("tipo de drogaController"));        
        this.repositorioOcorrencia.inserir(this.ocorrenciaCadastro);
        this.ocorrenciaCadastro = new Ocorrencia();
        
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","a ocorrencia foi cadastrada com sucesso!"));
    }

   public void alterar(Ocorrencia c){
        this.repositorioOcorrencia.alterar(c);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","a ocorrencia foi alterada com sucesso!"));
    }
    
    public Ocorrencia recuperarOcorrencia(Integer codigo){
        return this.repositorioOcorrencia.recuperar(codigo);
    }
    
    public void deletar(){
        this.repositorioOcorrencia.deletar(selectedOcorrencia);
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO,"sucesso!","a ocorrencia foi deletada com sucesso!"));
    }
    
    public List<Ocorrencia> recuperarTodosOcorrencia(){
        return this.repositorioOcorrencia.recuperarTodos();
    }

    public Ocorrencia getOcorrenciaCadastro() {
        return ocorrenciaCadastro;
    }

    public void setOcorrenciaCadastro(Ocorrencia clienteCadastro) {
        this.ocorrenciaCadastro = clienteCadastro;
    }

    public Ocorrencia getSelectedOcorrencia() {
        return selectedOcorrencia;
    }

    public void setSelectedOcorrencia(Ocorrencia selectedCliente) {
        this.selectedOcorrencia = selectedCliente;
    }
}