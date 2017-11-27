package colexio;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Ensinante extends PersoasCole {

    private String materia;

    /**
     * Constructor por defecto de la clase Ensinante.
     */
    public Ensinante() {
    }

    /**
     * Constructor con valores de la clase Ensinante.
     *
     * @param materia nombre de la materia que imparte el profesor
     * @param nome nombre del profesor
     * @param direccion direccion del profesor.
     */
    public Ensinante(String materia,String nome,String direccion) {
        super(nome,direccion);
        this.materia = materia;
    }

    /**
     * Metodo getMateria que retorna un String.
     *
     * @return nombre de la materia
     */
    public String getMateria() {
        return materia;
    }

    /**
     * Metodo setMateria que le da un valor de tipo String a materia.
     *
     * @param materia nombre de la materia que imparte el profesor
     */
    public void setMateria(String materia) {
        this.materia = materia;
    }

    /**
     * Metodo toString que devuelve un valor de tipo String.
     *
     * @return Muestra el nombre la direccion y la materia del profesor.
     */
    @Override
    public String toString() {
        return (super.toString() + "\nMateria:" + materia);
    }

}
