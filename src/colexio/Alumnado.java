package colexio;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Alumnado extends PersoasCole {

    private String nomeCole;
    private int nivel;

    public Alumnado() {
    }

    public Alumnado(String nomeCole,int nivel,String nome,String direccion) {
        super(nome,direccion);
        this.nomeCole=nomeCole;
        this.nivel=nivel;
    }

    public String getNomeCole() {
        return nomeCole;
    }

    public void setNomeCole(String nomeCole) {
        this.nomeCole=nomeCole;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel=nivel;
    }

    @Override
    public String toString() {
        return (super.toString()+"\nNombre do cole:"+nomeCole+"\nNivel"+nivel);
    }

}
