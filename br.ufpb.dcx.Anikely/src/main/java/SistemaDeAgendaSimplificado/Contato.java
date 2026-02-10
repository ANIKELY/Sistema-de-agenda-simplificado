package SistemaDeAgendaSimplificado;

import java.io.Serializable;
import java.util.Objects;

public class Contato implements Serializable {
    private String nome;
    private int diaAniversario;
    private int mesAnivesario;
    public Contato (String nome, int diaAniversario, int mesAniversario){
        this.nome = nome;
        this.diaAniversario = diaAniversario;
        this.mesAnivesario = mesAniversario;
    }
    public String getNome(){
        return nome;
    }
    public void setNome (String nome){
        this.nome = nome;
    }
    public int getDiaAniversario(){
        return diaAniversario;
    }
    public void setDiaAniversario(int diaAniversario){
        this.diaAniversario = diaAniversario;
    }
    public int getMesAnivesario(){
        return mesAnivesario;
    }
    public void setMes (int mesAnivesario){
        this.mesAnivesario = mesAnivesario;
    }
    @Override
    public String toString(){
        return "Nome: " + "Data de aniverário: "+this.diaAniversario+"/"+this.mesAnivesario+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome,contato.nome);
    }
    @Override
    public int hashCode(){
        return Objects.hash(nome, diaAniversario, mesAnivesario);
    }
}
