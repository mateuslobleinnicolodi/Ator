package modelo;

public class Ator {
    private int codigo;
    private String nome_real;
    private String nome_art;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome_real() {
        return nome_real;
    }

    public void setNome_real(String nome_real) {
        this.nome_real = nome_real;
    }

    public String getNome_art() {
        return nome_art;
    }

    public void setNome_art(String nome_art) {
        this.nome_art = nome_art;
    }

    @Override
    public String toString() {
        return nome_art;
    }
}
