package colexio;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Estudante extends PersoasCole {

    private String nomeCole;
    private int nivel;

    /**
     * Constructor por defecto de la clase Estudante.
     */
    public Estudante() {
    }

    /**
     * Constructor con valores de la clase Estudante.
     *
     * @param nomeCole
     * @param nivel
     * @param nome
     * @param direccion
     */
    public Estudante(String nomeCole,int nivel,String nome,String direccion) {
        super(nome,direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }

    /**
     * Metodo getNomeCole que devolve un valor String.
     *
     * @return
     */
    public String getNomeCole() {
        return nomeCole;
    }

    /**
     * Metodo setNomeCole que le da un valor de tipo String a nomeCole.
     *
     * @param nomeCole
     */
    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    /**
     * Metodo getNivel que devolve un valor de tipo int.
     *
     * @return
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Metodo setNivel que le da un valor de tipo int a nivel.
     *
     * @param nivel
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Metodo toString que devolve un valor Sting.
     *
     * @return
     */
    @Override
    public String toString() {
        return (super.toString() + "\nNombre del colexio:" + nomeCole + "\nNivel:" + nivel);
    }

}
