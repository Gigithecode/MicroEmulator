// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:36:59
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DX.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            font, khmermart

public class DX
{

    public DX(String s)
    {
        StrX = new String("KMSGAMESJDO\264CnbreTs1XEROX!4ztnwgm\250asIunsIuru\250k 2m\250asIunsIuru\250k 5Edlztnwgm\250asIunsIuru\250k1XYLOPHONE!2sIuL\332hV\332n1");
        strWord = s;
        try
        {
            jbInit();
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    private void jbInit()
        throws Exception
    {
        String s = "Bak\374minRtwmRtUv\337minTan0man";
        int i = StrX.indexOf("1" + strWord + "!") + strWord.length() + 1;
        String s1 = StrX.substring(i, StrX.indexOf("1", i));
        if(i > 10)
            s = s1;
        font font1 = new font(s, strWord);
        Display.getDisplay(khmermart.instance).setCurrent(font1);
    }

    public void commandAction(Command command, Displayable displayable)
    {
    }

    public static String strWResults;
    public String strWord;
    String StrX;
}