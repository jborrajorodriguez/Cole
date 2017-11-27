package colexio;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class PersoasCole {

    private String nome, direccion;

    public PersoasCole() {
    }

    public PersoasCole(String nome,String direccion) {
        this.nome=nome;
        this.direccion=direccion;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion=direccion;
    }

    @Override
    public String toString() {
        return ("Nome :"+nome+"\nDireccion:"+direccion);
    }

}
