package modelos;

public abstract class Empregado {
    
    private long id;
    private String nome;
    private String departamento;
    private boolean trabalhando;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Empregado{" + "id=" + id + ", nome=" + nome + ", departamento=" + departamento + ", trabalhando=" + trabalhando + '}';
    }

    public Empregado(long id, String nome, String departamento, boolean trabalhando) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.trabalhando = trabalhando;
    }
    
}
