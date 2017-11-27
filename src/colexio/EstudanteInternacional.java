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
     * @param pais nome do pais do alumno extranjero.
     * @param nomeCole nome do colexio
     * @param nivel nivel do alumno.
     * @param nome nome do alumno.
     * @param direccion direccion do alumno.
     */
    public EstudanteInternacional(String pais,String nomeCole,int nivel,String nome,String direccion) {
        super(nomeCole,nivel,nome,direccion);
        this.pais = pais;
    }

    /**
     * Metodo getPais que devolve un String.
     *
     * @return devolve o nome do pais.
     */
    public String getPais() {
        return pais;
    }

    /**
     * Metodo setPais que le da un valor String a pais.
     *
     * @param pais nome do pais do alumno.
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Metodo toString que devolve un String.
     *
     * @return devolve o nome,direccion,nome do colexio,nivel e pais do alumno.
     */
    @Override
    public String toString() {
        return (super.toString() + "\nPais:" + pais);
    }

}
