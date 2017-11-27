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
     * @param nomeCole Nome do colexio.
     * @param nivel Nivel del alumno.
     * @param nome Nome do alumno.
     * @param direccion Direccion do alumno.
     */
    public Estudante(String nomeCole,int nivel,String nome,String direccion) {
        super(nome,direccion);
        this.nomeCole = nomeCole;
        this.nivel = nivel;
    }

    /**
     * Metodo getNomeCole que devolve un valor String.
     *
     * @return Devuelve el nombre del colexio.
     */
    public String getNomeCole() {
        return nomeCole;
    }

    /**
     * Metodo setNomeCole que le da un valor de tipo String a nomeCole.
     *
     * @param nomeCole Nome do colexio.
     */
    public void setNomeCole(String nomeCole) {
        this.nomeCole = nomeCole;
    }

    /**
     * Metodo getNivel que devolve un valor de tipo int.
     *
     * @return devuelve el nivel del alumno.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Metodo setNivel que le da un valor de tipo int a nivel.
     *
     * @param nivel Nivel del alumno.
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Metodo toString que devolve un valor Sting.
     *
     * @return Devuelve el nombre del alumno,la direccion,el nome do colexio y
     * el nivel.
     */
    @Override
    public String toString() {
        return (super.toString() + "\nNombre del colexio:" + nomeCole + "\nNivel:" + nivel);
    }

}
