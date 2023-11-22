package main;
/**
 * Estudiantes: 
 * Daniel Castillo Villamarín - 1727303
 * Andres Valencia - 1960722
 * Profesor: Luis Johany Romo Portilla
 * Fundamentos de programacion orientada a eventos
 * @FPOE group 81
 * @Lab number 3
 */
import controller.ControllerDirectory;
import model.ModelDirectory;
import view.ViewDirectory;

/**
 *
 * @author Daniel Casvill
 */
public class Main {


    public static void main(String[] args) 
    {
        new ControllerDirectory(new ModelDirectory(), new ViewDirectory());
    }
    
}
