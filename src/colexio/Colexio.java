package colexio;

import javax.swing.JOptionPane;

/**
 * @author Juan Borrajo Rodriguez Nº5937
 */
public class Colexio {

    public static void main(String[] args) {
        Ensinante profe01 = new Ensinante("Matematicas","Susi","Vigo");//Objecto de la clase ensinante
        JOptionPane.showMessageDialog(null,profe01.toString());//Muestra en pantalla el toString de la clase Ensinante
        Estudante alumno01 = new Estudante("CFP Daniel Castelao",8,"Juan","Vigo");//Objecto de la clase Estudante.
        JOptionPane.showMessageDialog(null,alumno01.toString());//Muestra en pantalla el toString de la clase Estudante.
        EstudanteInternacional alumno02 = new EstudanteInternacional("Francia","CFP Daniel Castelao",3,"Antonio","Vigo");//Objecto de la clase EstudanteInternacional.
        JOptionPane.showMessageDialog(null,alumno02.toString());//Muestra en pantalla el toString de la clase EstudanteInternacional.
        String cambioNivel = JOptionPane.showInputDialog("Introduce nuevo nivel de alumno01");//Pedir el cambio de nivel de alumno01.
        int nuevoNivel = Integer.parseInt(cambioNivel);//cambia de un String a un Int.
        alumno01.setNivel(nuevoNivel);
        JOptionPane.showMessageDialog(null,alumno01.toString());//Muestra en pantalla el toString de la clase Estudante.
        String cambioMateria = JOptionPane.showInputDialog("Introduce nuevo materia para Profe01");//Pedir el cambio de materia de Profe01.
        profe01.setMateria(cambioMateria);
        JOptionPane.showMessageDialog(null,profe01.toString());//Muestra en pantalla el toString de la clase Ensinante

    }

}
