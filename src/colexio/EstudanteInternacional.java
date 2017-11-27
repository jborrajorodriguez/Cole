package colexio;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class EstudanteInternacional extends Estudante {

    private String pais;

    /**
     * Constructor con valores por defecto de la clase EstudanteInternacional.
     */
    public EstudanteInternacional() {
    }

    /**
     * Constructor con valores de la clase EstudanteInternacional.
     *
     * @param pais
     * @param nomeCole
     * @param nivel
     * @param nome
     * @param direccion
     */
    public EstudanteInternacional(String pais,String nomeCole,int nivel,String nome,String direccion) {
        super(nomeCole,nivel,nome,direccion);
        this.pais = pais;
    }

    /**
     * Metodo getPais que devolve un String.
     *
     * @return
     */
    public String getPais() {
        return pais;
    }

    /**
     * Metodo setPais que le da un valor String a pais.
     *
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Metodo toString que devolve un String.
     *
     * @return
     */
    @Override
    public String toString() {
        return (super.toString() + "\nPais:" + pais);
    }

}
