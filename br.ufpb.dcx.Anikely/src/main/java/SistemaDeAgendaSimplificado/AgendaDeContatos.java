package SistemaDeAgendaSimplificado;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AgendaDeContatos {
    private Map<String, Contato> contatos = new HashMap<>();
    private String key;
    private GravadorDeDados gravador;
    public AgendaDeContatos(){
        this.contatos = new HashMap<>();
        this.gravador = new GravadorDeDados();
        this.key = "ARQUIVO_CONTATOS_String = 'contatos.dat'";
    }
    public void salvarDados() throws IOException {
        gravador.salvarDados = (contatos);
    }
    public void recuperarDados() throws IOException{
        Map<String, Contato> dadosRecuperados = gravador.recuperarDados();
        if (dadosRecuperados != null){
            this.contatos = dadosRecuperados;
        }
    }
    public boolean cadastrarContato (String nome, int diaAniversario, int mesAniversario){
        if (nome == null || nome.isEmpty()){
            return false;
        }
        if (diaAniversario < 1 || diaAniversario > 31 || mesAniversario < 1 || mesAniversario > 12){
            return false;
        }

        Contato novoContato = new Contato(nome,diaAniversario, mesAniversario);
        contatos.put(nome, novoContato);
        return true;
    }
    public Collection<Contato> pesquisaAniversariantes (int dia, int mes){
        return contatos.values().stream().filter(c -> c.getDiaAniversario() == dia && c.getMesAnivesario() == mes).collect(Collectors.toList());
    }
    public boolean removerContato (String nome) throws  ContatoInexistenteException{
        if (!contatos.containsKey(nome)) {
            throw  new ContatoInexistenteException("Contato: "+ nome + ", não existe na agenda!");
        }
        contatos.remove(nome);
        return true;
    }
    public int quantidadeDeContatos(){
        return contatos.size();
    }
}
