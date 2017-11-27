package colexio;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class PersoasCole {

    private String nome, direccion;

    /**
     * Constructor por defecto.
     */
    public PersoasCole() {
    }

    /**
     * Constructor con parametros.
     *
     * @param nome nome das persoas do cole
     * @param direccion direccion das persoas do cole.
     */
    public PersoasCole(String nome,String direccion) {
        this.nome = nome;
        this.direccion = direccion;
    }

    /**
     * Metodo getNome que retorna el valor de nome.
     *
     * @return devolve o nome da persoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Metodo setNome que la da un valor de tipo String a nome.
     *
     * @param nome asigna o nome da persoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Metodo getDireccion que retorna el valor de direccion.
     *
     * @return devolve a direccion.
     */

    public String getDireccion() {
        return direccion;
    }

    /**
     * Metodo setDireccion que asigna un valor de tipo String a direccion.
     *
     * @param direccion asigna a direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Metodo toString que retorna un valor de tipo String.
     *
     * @return devolve o nome e a direccion.
     */
    @Override
    public String toString() {
        return ("Nome :" + nome + "\nDireccion:" + direccion);
    }

}
