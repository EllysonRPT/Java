package EXSerie;

public class Agenda {
    String data;
    String hora;
    String desc;
    String nome;
    
    public Agenda(String data, String hora, String desc, String nome) {
        this.data = data;
        this.hora = hora;
        this.desc = desc;
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
