package controller;

import model.ModelDirectory;
import view.ViewDirectory;

/**
 *
 * @author Daniel Casvill
 */
public class ControllerDirectory 
{
    private ModelDirectory directory;
    private ViewDirectory viewDirectory;

    public ControllerDirectory(ModelDirectory directory, ViewDirectory viewDirectory) 
    {
        this.directory = directory;
        this.viewDirectory = viewDirectory;
    }
    
    
}
