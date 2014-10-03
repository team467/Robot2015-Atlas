/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;

/**
 *
 * @author kyle
 */
public class ButtonDrive
{

    private static ButtonDrive buttonDrive = null;

    //bools
    private boolean calibrate = false;
    private boolean carDrive = false;
    private boolean crabDriveFA = false;
    private boolean crabDriveNoFA = false;    
    private boolean turnInPlace = false;   
    private boolean sneak = false;
    private boolean turbo = false;    

    /**
     * Singleton
     *
     * @return
     */
    public static ButtonDrive getInstance()
    {
        if (buttonDrive == null)
        {
            buttonDrive = new ButtonDrive();
        }
        return buttonDrive;
    }

    /**
     * Private constructor
     */
    private ButtonDrive()
    {
    }
    
    
    
    /**
     * Update the value of the buttons. Must be called <b>every</b> loop.
     * @param joyLeft 
     */
    public void updateButtons(Joystick467 joyLeft)
    {
        calibrate = joyLeft.buttonDown(11);
        carDrive = joyLeft.buttonDown(3);
        crabDriveFA = joyLeft.buttonDown(5);        
        turnInPlace = joyLeft.buttonDown(2);
        crabDriveNoFA = !(carDrive || crabDriveFA || turnInPlace);        
        sneak = joyLeft.buttonDown(Joystick467.TRIGGER);
        turbo = joyLeft.buttonDown(7);        
    }
    
    /**
     * Update the value of the buttons. Must be called <b>every</b> loop.
     * @param joyLeft
     * @param joyRight 
     */
    public void updateButtons(Joystick467 joyLeft, Joystick467 joyRight)
    {

    }
    

    public boolean getSneak()
    {
        return sneak;
    }    
    
    public boolean getTurbo()
    {
        return turbo;
    }
    
    public boolean getCalibrate()
    {
        return calibrate;
    }
    
    public boolean getCarDrive()
    {
        return carDrive;
    }

    public boolean getCrabDriveFA()
    {
        return crabDriveFA;
    }

    public boolean getCrabDriveNoFA()
    {
        return crabDriveNoFA;
    }
    
    public boolean getTurnInPlace()
    {
        return turnInPlace;
    }    

}