package main;

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
