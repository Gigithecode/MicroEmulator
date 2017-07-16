// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:37:00
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   khmermart.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import java.io.IOException;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.MIDlet;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            MainMenu

public class khmermart extends MIDlet
{

    public khmermart()
    {
        mainMenu = new MainMenu();
        instance = this;
        display = Display.getDisplay(this);
    }

    public void startApp()
    {
        display.setCurrent(mainMenu);
    }

    public void pauseApp()
    {
    }

    public void destroyApp(boolean flag)
    {
    }

    public static void quitApp()
    {
        instance.destroyApp(true);
        instance.notifyDestroyed();
        instance = null;
    }

    public static void showAlert(Exception exception)
    {
        showAlert(exception.getMessage());
    }

    public static void showAlert(String s)
    {
        Image image = null;
        try
        {
            image = Image.createImage("/ErrorClaim.png");
        }
        catch(IOException ioexception) { }
        Alert alert = new Alert("Error", "", image, AlertType.ERROR);
        alert.setTimeout(-2);
        alert.setString(s);
        display.setCurrent(alert);
    }

    static khmermart instance;
    private static Display display;
    private MainMenu mainMenu;
}