package SistemaDeAgendaSimplificado;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GravadorDeDados {
    private String ARQUIVO_CONTATOS= "DADOS.dat";
    public Map<String, Contato> recuperarDados () throws IOException{
        File arquivo = new File(ARQUIVO_CONTATOS);

        if (!arquivo.exists()){
            return new HashMap<>();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_CONTATOS))){
            Map<String, Contato> contatos = (HashMap<String, Contato>) in.readObject();
            return contatos;
        }catch (ClassNotFoundException e){
            throw new IOException("Erro ao recuperar dados: "+ e.getMessage(), e);
        }
    }
    public void salvarDados (Map<String, Contato> contatos) throws  IOException{
        File dir = new File("dados");
        if (!dir.exists()){
            dir.mkdir();
        }
        try(ObjectInputStream out = new ObjectInputStream(new FileOutputStream(ARQUIVO_CONTATOS)){
            out.writeObject(n);
        }

    }
}
