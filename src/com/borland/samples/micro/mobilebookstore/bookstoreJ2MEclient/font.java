// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:37:00
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   font.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            Search, khmermart

public class font extends Canvas
    implements CommandListener
{

    public font(String s1, String s2)
    {
        x = 0;
        y = 0;
        c = 0;
        d = 0;
        a = 0;
        b = 0;
        i = 0;
        h = 0;
        arow = 0;
        strContent = s1;
        strWord = s2;
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
        setCommandListener(this);
        addCommand(new Command("BACK", 4, 1));
        addCommand(new Command("Exit", 2, 0));
    }

    public void commandAction(Command command, Displayable displayable)
    {
        switch(command.getCommandType())
        {
        case 2: // '\002'
            khmermart.quitApp();
            break;

        case 4: // '\004'
            Search search = new Search();
            Display.getDisplay(khmermart.instance).setCurrent(search);
            break;
        }
    }

    @SuppressWarnings("unused")
	private String getAction(int i1)
    {
        int j1 = getGameAction(i1);
        switch(j1)
        {
        case 1: // '\001'
            return "UP";

        case 2: // '\002'
            return "LEFT";

        case 3: // '\003'
        case 4: // '\004'
        default:
            return "";

        case 5: // '\005'
            return "RIGHT";

        case 6: // '\006'
            return "DOWN";
        }
    }

    protected void keyPressed(int i1)
    {
        if(i1 == -2)
            arow -= 5;
        if(i1 == -1)
            arow += 5;
        repaint();
    }

    private void k(Graphics g1)
    {
        g1.drawLine(x, y - 7, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 1, y - 9, x + 1, y - 9);
        g1.drawLine(x + 2, y - 6, x + 2, y - 7);
        g1.drawLine(x + 2, y - 9, x + 2, y - 10);
        g1.drawLine(x + 3, y - 7, x + 3, y - 9);
        g1.drawLine(x + 4, y - 7, x + 4, y - 7);
        g1.drawLine(x + 4, y - 9, x + 4, y - 9);
        g1.drawLine(x + 5, y - 7, x + 5, y - 7);
        g1.drawLine(x + 5, y - 9, x + 5, y - 10);
        g1.drawLine(x + 6, y - 6, x + 6, y - 9);
        g1.drawLine(x + 7, y, x + 7, y - 6);
        g1.drawLine(x + 7, y - 9, x + 7, y - 9);
        x += 9;
    }

    private void x(Graphics g1)
    {
        g1.drawLine(x, y - 1, x, y - 4);
        g1.drawLine(x, y - 7, x, y - 9);
        g1.drawLine(x + 1, y - 9, x + 1, y - 10);
        g1.drawLine(x + 1, y - 10, x + 4, y - 10);
        g1.drawLine(x + 5, y - 9, x + 5, y - 9);
        g1.drawLine(x + 6, y - 8, x + 6, y - 7);
        g1.drawLine(x + 1, y, x + 4, y);
        g1.drawLine(x + 1, y - 4, x + 3, y - 4);
        g1.drawLine(x + 4, y - 5, x + 5, y - 5);
        g1.drawLine(x + 6, y - 6, x + 6, y - 6);
        g1.drawLine(x + 1, y - 6, x + 3, y - 6);
        g1.drawLine(x + 2, y - 7, x + 3, y - 7);
        g1.drawLine(x + 6, y - 1, x + 6, y - 4);
        g1.drawLine(x + 5, y - 1, x + 5, y - 2);
        g1.drawLine(x + 4, y - 1, x + 4, y - 1);
        x += 8;
    }

    private void K(Graphics g1)
    {
        g1.drawLine(x, y - 7, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 1, y - 9, x + 1, y - 9);
        g1.drawLine(x + 2, y - 6, x + 2, y - 7);
        g1.drawLine(x + 2, y - 9, x + 2, y - 10);
        g1.drawLine(x + 3, y - 7, x + 3, y - 9);
        g1.drawLine(x + 4, y - 7, x + 4, y - 7);
        g1.drawLine(x + 4, y - 9, x + 4, y - 9);
        g1.drawLine(x + 5, y - 7, x + 5, y - 7);
        g1.drawLine(x + 5, y - 9, x + 5, y - 10);
        g1.drawLine(x + 6, y - 6, x + 6, y - 9);
        g1.drawLine(x + 7, y, x + 7, y - 6);
        g1.drawLine(x + 7, y - 9, x + 7, y - 9);
        g1.drawLine(x + 2, y - 1, x + 3, y - 2);
        g1.drawLine(x + 3, y - 2, x + 4, y - 2);
        x += 9;
    }

    private void X(Graphics g1)
    {
        g1.drawLine(x, y - 7, x, y - 9);
        g1.drawLine(x + 1, y - 1, x + 1, y - 9);
        g1.drawLine(x + 2, y, x + 5, y);
        g1.drawLine(x + 5, y - 8, x + 5, y - 9);
        g1.drawLine(x + 6, y - 1, x + 6, y - 7);
        g1.drawLine(x + 6, y - 9, x + 6, y - 10);
        g1.drawLine(x + 6, y - 9, x + 8, y - 9);
        g1.drawLine(x + 7, y, x + 9, y);
        g1.drawLine(x + 9, y, x + 9, y - 1);
        g1.drawLine(x + 9, y - 8, x + 9, y - 8);
        g1.drawLine(x + 10, y - 1, x + 10, y - 7);
        g1.drawLine(x + 10, y - 9, x + 12, y - 9);
        x += 12;
    }

    private void g(Graphics g1)
    {
        g1.drawLine(x, y - 5, x, y - 5);
        g1.drawLine(x + 1, y, x + 1, y - 6);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 3, y - 1, x + 3, y - 1);
        g1.drawLine(x + 4, y - 1, x + 4, y - 2);
        g1.drawLine(x + 5, y, x + 5, y - 1);
        g1.drawLine(x + 6, y, x + 6, y - 10);
        g1.drawLine(x + 5, y - 10, x + 5, y - 10);
        g1.drawLine(x + 5, y - 8, x + 5, y - 8);
        g1.drawLine(x + 4, y - 9, x + 4, y - 9);
        g1.drawLine(x + 2, y - 7, x + 5, y - 7);
        g1.drawLine(x + 2, y - 7, x + 2, y - 8);
        g1.drawLine(x + 1, y - 8, x + 1, y - 12);
        x += 8;
    }

    private void c(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y - 1, x + 1, y - 7);
        g1.drawLine(x + 2, y, x + 6, y);
        g1.drawLine(x + 7, y - 1, x + 7, y - 7);
        g1.drawLine(x + 5, y - 7, x + 7, y - 7);
        g1.drawLine(x + 5, y - 4, x + 7, y - 4);
        g1.drawLine(x + 4, y - 5, x + 4, y - 6);
        g1.drawLine(x + 1, y - 9, x + 7, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        g1.drawLine(x + 3, y - 8, x + 3, y - 8);
        g1.drawLine(x + 5, y - 10, x + 5, y - 10);
        g1.drawLine(x + 6, y - 8, x + 6, y - 8);
        x += 9;
    }

    private void q(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 2);
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 2, y - 2, x + 3, y - 2);
        g1.drawLine(x + 3, y - 1, x + 4, y - 1);
        g1.drawLine(x + 4, y, x + 6, y);
        g1.drawLine(x + 6, y, x + 6, y - 9);
        g1.drawLine(x + 1, y - 9, x + 7, y - 9);
        g1.drawLine(x + 5, y - 7, x + 5, y - 10);
        g1.drawLine(x + 4, y - 6, x + 4, y - 5);
        g1.drawLine(x + 5, y - 4, x + 5, y - 4);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        x += 9;
    }

    private void C(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 2, y, x + 4, y - 2);
        g1.drawLine(x + 4, y - 2, x + 6, y);
        g1.drawLine(x + 7, y, x + 7, y - 7);
        g1.drawLine(x + 7, y - 9, x + 7, y - 12);
        g1.drawLine(x + 6, y - 11, x + 6, y - 12);
        g1.drawLine(x + 1, y - 9, x + 4, y - 9);
        g1.drawLine(x + 4, y - 8, x + 6, y - 8);
        x += 9;
    }

    private void Q(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 9);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 2, y - 1, x + 2, y - 2);
        g1.drawLine(x + 1, y - 10, x + 4, y - 10);
        g1.drawLine(x + 5, y - 1, x + 5, y - 9);
        g1.drawLine(x + 1, y - 10, x + 4, y - 10);
        g1.drawLine(x + 6, y, x + 9, y);
        g1.drawLine(x + 6, y - 1, x + 6, y - 1);
        g1.drawLine(x + 10, y - 1, x + 10, y - 7);
        g1.drawLine(x + 9, y - 8, x + 9, y - 9);
        g1.drawLine(x + 8, y - 8, x + 8, y - 8);
        g1.drawLine(x + 10, y - 9, x + 11, y - 9);
        g1.drawLine(x + 10, y - 10, x + 10, y - 10);
        g1.drawLine(x + 11, y - 1, x + 11, y - 1);
        g1.drawLine(x + 11, y, x + 14, y);
        g1.drawLine(x + 15, y - 1, x + 15, y - 7);
        g1.drawLine(x + 14, y - 8, x + 14, y - 8);
        g1.drawLine(x + 15, y - 9, x + 16, y - 9);
        x += 17;
    }

    private void j(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 2, y - 2, x + 2, y - 2);
        g1.drawLine(x + 3, y, x + 3, y - 2);
        g1.drawLine(x + 1, y - 9, x + 7, y - 9);
        g1.drawLine(x + 7, y, x + 7, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        g1.drawLine(x + 3, y - 8, x + 3, y - 8);
        g1.drawLine(x + 5, y - 10, x + 6, y - 10);
        g1.drawLine(x + 4, y + 2, x + 5, y + 1);
        g1.drawLine(x + 5, y + 3, x + 11, y + 3);
        g1.drawLine(x + 10, y + 2, x + 11, y + 2);
        g1.drawLine(x + 10, y + 1, x + 11, y + 1);
        x += 8;
        g1.drawLine(x, y - 10, x + 1, y - 10);
        g1.drawLine(x + 2, y - 9, x + 2, y - 9);
        g1.drawLine(x + 3, y, x + 3, y - 8);
        x += 5;
    }

    private void d(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 9);
        g1.drawLine(x + 1, y - 10, x + 2, y - 10);
        g1.drawLine(x + 1, y - 7, x + 1, y - 7);
        g1.drawLine(x + 4, y - 7, x + 4, y - 7);
        g1.drawLine(x + 1, y - 6, x + 4, y - 6);
        g1.drawLine(x + 1, y, x + 3, y - 2);
        g1.drawLine(x + 3, y - 1, x + 4, y - 1);
        g1.drawLine(x + 4, y, x + 4, y);
        g1.drawLine(x + 5, y, x + 5, y - 11);
        x += 9;
    }

    private void f(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 10);
        g1.drawLine(x + 1, y - 1, x + 1, y - 10);
        g1.drawLine(x + 2, y, x + 6, y);
        g1.drawLine(x + 7, y, x + 7, y - 8);
        g1.drawLine(x + 5, y - 9, x + 6, y - 8);
        g1.drawLine(x + 5, y - 11, x + 6, y - 10);
        g1.drawLine(x + 4, y - 9, x + 4, y - 10);
        g1.drawLine(x + 5, y - 9, x + 7, y - 11);
        g1.drawLine(x + 6, y - 12, x + 7, y - 12);
        g1.drawLine(x + 5, y - 13, x + 6, y - 13);
        x += 9;
    }

    private void D(Graphics g1)
    {
        g1.drawLine(x, y - 1, x, y - 4);
        g1.drawLine(x, y - 1, x, y - 4);
        g1.drawLine(x, y - 7, x, y - 9);
        g1.drawLine(x, y - 9, x + 6, y - 9);
        g1.drawLine(x + 1, y - 10, x + 1, y - 10);
        g1.drawLine(x + 4, y - 10, x + 5, y - 10);
        g1.drawLine(x + 3, y - 8, x + 3, y - 8);
        g1.drawLine(x, y - 6, x + 3, y - 6);
        g1.drawLine(x, y - 4, x + 3, y - 4);
        g1.drawLine(x + 4, y - 5, x + 6, y - 5);
        g1.drawLine(x + 6, y, x + 6, y - 9);
        g1.drawLine(x + 1, y, x + 6, y);
        g1.drawLine(x + 4, y - 1, x + 5, y - 1);
        x += 9;
    }

    private void F(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 8);
        g1.drawLine(x + 1, y - 9, x + 6, y - 9);
        g1.drawLine(x + 3, y - 8, x + 3, y - 8);
        g1.drawLine(x + 5, y - 10, x + 5, y - 10);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 2, y - 1, x + 2, y - 1);
        g1.drawLine(x + 6, y, x + 7, y - 1);
        g1.drawLine(x + 6, y, x + 6, y - 9);
        g1.drawLine(x + 8, y, x + 9, y);
        g1.drawLine(x + 10, y - 1, x + 10, y - 7);
        g1.drawLine(x + 9, y - 8, x + 9, y - 8);
        g1.drawLine(x + 10, y - 9, x + 12, y - 9);
        g1.drawLine(x + 10, y - 10, x + 10, y - 10);
        x += 13;
    }

    private void N(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 9);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 2, y - 1, x + 2, y - 1);
        g1.drawLine(x + 1, y - 10, x + 4, y - 10);
        g1.drawLine(x + 4, y - 9, x + 5, y - 9);
        g1.drawLine(x + 5, y, x + 5, y - 9);
        g1.drawLine(x + 6, y, x + 8, y - 2);
        g1.drawLine(x + 8, y - 2, x + 10, y);
        g1.drawLine(x + 11, y, x + 11, y - 9);
        g1.drawLine(x + 12, y - 9, x + 12, y - 9);
        g1.drawLine(x + 12, y - 10, x + 15, y - 10);
        g1.drawLine(x + 15, y - 9, x + 15, y - 9);
        g1.drawLine(x + 16, y, x + 16, y - 9);
        x += 18;
    }

    private void t(Graphics g1)
    {
        g1.drawLine(x, y - 7, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 1, y - 9, x + 1, y - 9);
        g1.drawLine(x + 2, y - 6, x + 2, y - 7);
        g1.drawLine(x + 2, y - 9, x + 2, y - 10);
        g1.drawLine(x + 3, y - 7, x + 3, y - 9);
        g1.drawLine(x + 4, y - 7, x + 4, y - 7);
        g1.drawLine(x + 4, y - 9, x + 4, y - 9);
        g1.drawLine(x + 5, y - 7, x + 5, y - 7);
        g1.drawLine(x + 5, y - 9, x + 5, y - 10);
        g1.drawLine(x + 6, y - 6, x + 6, y - 9);
        g1.drawLine(x + 7, y, x + 7, y - 6);
        g1.drawLine(x + 7, y - 9, x + 7, y - 9);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 2, y - 2, x + 3, y - 1);
        x += 9;
    }

    private void z(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y - 1, x + 1, y - 7);
        g1.drawLine(x + 2, y, x + 6, y);
        g1.drawLine(x + 7, y - 1, x + 7, y - 5);
        g1.drawLine(x + 6, y - 5, x + 6, y - 5);
        g1.drawLine(x + 6, y - 3, x + 6, y - 3);
        g1.drawLine(x + 5, y - 4, x + 5, y - 4);
        g1.drawLine(x + 1, y - 9, x + 4, y - 9);
        g1.drawLine(x + 4, y - 8, x + 6, y - 8);
        g1.drawLine(x + 7, y - 9, x + 7, y - 12);
        g1.drawLine(x + 6, y - 11, x + 6, y - 12);
        x += 9;
    }

    private void T(Graphics g1)
    {
        g1.drawLine(x, y - 7, x, y - 9);
        g1.drawLine(x + 1, y - 1, x + 1, y - 6);
        g1.drawLine(x + 2, y - 5, x + 6, y - 5);
        g1.drawLine(x + 2, y, x + 4, y);
        g1.drawLine(x + 5, y - 1, x + 5, y - 5);
        g1.drawLine(x + 1, y - 10, x + 1, y - 10);
        g1.drawLine(x + 1, y - 9, x + 1, y - 9);
        g1.drawLine(x + 2, y - 10, x + 6, y - 10);
        g1.drawLine(x + 6, y - 9, x + 6, y - 7);
        g1.drawLine(x + 3, y - 7, x + 6, y - 7);
        x += 9;
    }

    private void Z(Graphics g1)
    {
        g1.drawLine(x, y - 8, x + 2, y - 10);
        g1.drawLine(x + 3, y - 8, x + 5, y - 10);
        g1.drawLine(x + 1, y - 9, x + 2, y - 9);
        g1.drawLine(x + 6, y - 9, x + 7, y - 9);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 1, y, x + 3, y - 2);
        g1.drawLine(x + 3, y - 2, x + 5, y);
        g1.drawLine(x + 6, y, x + 6, y - 6);
        g1.drawLine(x + 5, y - 6, x + 5, y - 6);
        g1.drawLine(x + 4, y - 5, x + 5, y - 4);
        x += 9;
    }

    private void n(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 4);
        g1.drawLine(x, y - 6, x, y - 8);
        g1.drawLine(x + 1, y - 9, x + 1, y - 9);
        g1.drawLine(x + 2, y - 10, x + 5, y - 10);
        g1.drawLine(x + 6, y - 9, x + 6, y - 7);
        g1.drawLine(x + 5, y - 9, x + 5, y - 9);
        g1.drawLine(x + 4, y - 6, x + 5, y - 6);
        g1.drawLine(x + 4, y - 7, x + 4, y - 7);
        g1.drawLine(x + 1, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y - 1, x + 2, y - 1);
        g1.drawLine(x + 2, y, x + 6, y);
        g1.drawLine(x + 6, y, x + 6, y - 4);
        g1.drawLine(x + 3, y - 4, x + 6, y - 4);
        x += 9;
    }

    private void b(Graphics g1)
    {
        g1.drawLine(x + 1, y - 1, x + 1, y - 7);
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x, y - 9, x + 2, y - 9);
        g1.drawLine(x + 1, y, x + 5, y);
        g1.drawLine(x + 6, y - 1, x + 6, y - 8);
        g1.drawLine(x + 5, y - 9, x + 5, y - 9);
        g1.drawLine(x + 6, y - 10, x + 8, y - 10);
        g1.drawLine(x + 1, y - 10, x + 1, y - 10);
        x += 9;
    }

    private void p(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 2, y, x + 4, y - 2);
        g1.drawLine(x + 4, y - 2, x + 6, y);
        g1.drawLine(x + 7, y, x + 7, y - 6);
        g1.drawLine(x + 5, y - 5, x + 6, y - 6);
        g1.drawLine(x + 6, y - 4, x + 6, y - 4);
        g1.drawLine(x + 7, y - 9, x + 7, y - 12);
        g1.drawLine(x + 6, y - 11, x + 6, y - 12);
        g1.drawLine(x + 1, y - 9, x + 4, y - 9);
        g1.drawLine(x + 4, y - 8, x + 6, y - 8);
        x += 9;
    }

    private void B(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 2, y - 2, x + 2, y - 2);
        g1.drawLine(x + 3, y, x + 3, y - 2);
        g1.drawLine(x + 1, y - 9, x + 7, y - 9);
        g1.drawLine(x + 7, y, x + 7, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        g1.drawLine(x + 3, y - 8, x + 3, y - 8);
        g1.drawLine(x + 5, y - 10, x + 6, y - 10);
        x += 9;
    }

    private void P(Graphics g1)
    {
        g1.drawLine(x, y - 7, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 1, y - 9, x + 1, y - 9);
        g1.drawLine(x + 2, y - 6, x + 2, y - 7);
        g1.drawLine(x + 2, y - 9, x + 2, y - 10);
        g1.drawLine(x + 3, y - 7, x + 3, y - 9);
        g1.drawLine(x + 4, y - 7, x + 4, y - 7);
        g1.drawLine(x + 4, y - 9, x + 4, y - 9);
        g1.drawLine(x + 5, y - 7, x + 5, y - 7);
        g1.drawLine(x + 5, y - 9, x + 5, y - 10);
        g1.drawLine(x + 6, y - 6, x + 6, y - 9);
        g1.drawLine(x + 7, y, x + 7, y - 6);
        g1.drawLine(x + 7, y - 9, x + 7, y - 9);
        g1.drawLine(x, y, x, y - 2);
        x += 9;
    }

    private void m(Graphics g1)
    {
        g1.drawLine(x + 1, y - 1, x + 1, y - 7);
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x, y - 9, x + 2, y - 9);
        g1.drawLine(x + 1, y, x + 5, y);
        g1.drawLine(x + 6, y - 1, x + 6, y - 8);
        g1.drawLine(x + 5, y - 9, x + 5, y - 9);
        g1.drawLine(x + 6, y - 10, x + 8, y - 10);
        g1.drawLine(x + 1, y - 10, x + 1, y - 10);
        g1.drawLine(x + 1, y - 5, x + 6, y - 5);
        x += 9;
    }

    private void y(Graphics g1)
    {
        g1.drawLine(x, y - 1, x, y - 10);
        g1.drawLine(x + 1, y - 10, x + 2, y - 9);
        g1.drawLine(x + 1, y - 7, x + 2, y - 8);
        g1.drawLine(x + 1, y, x + 4, y);
        g1.drawLine(x + 1, y - 1, x + 1, y - 1);
        g1.drawLine(x + 5, y - 1, x + 5, y - 7);
        g1.drawLine(x + 4, y - 8, x + 4, y - 8);
        g1.drawLine(x + 5, y - 9, x + 7, y - 9);
        g1.drawLine(x + 5, y - 10, x + 5, y - 10);
        g1.drawLine(x + 6, y, x + 9, y);
        g1.drawLine(x + 10, y - 1, x + 10, y - 7);
        g1.drawLine(x + 9, y - 8, x + 9, y - 8);
        g1.drawLine(x + 9, y - 9, x + 11, y - 9);
        g1.drawLine(x + 9, y - 10, x + 9, y - 10);
        x += 12;
    }

    private void r(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 1);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 2, y, x + 2, y - 7);
        g1.drawLine(x + 1, y - 8, x + 1, y - 8);
        g1.drawLine(x + 2, y - 9, x + 4, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        x += 6;
    }

    private void l(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 9);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 2, y - 1, x + 2, y - 2);
        g1.drawLine(x + 1, y - 10, x + 4, y - 10);
        g1.drawLine(x + 5, y - 1, x + 5, y - 9);
        g1.drawLine(x + 1, y - 10, x + 4, y - 10);
        g1.drawLine(x + 6, y, x + 9, y);
        g1.drawLine(x + 6, y - 1, x + 6, y - 1);
        g1.drawLine(x + 10, y - 1, x + 10, y - 7);
        g1.drawLine(x + 9, y - 8, x + 9, y - 9);
        g1.drawLine(x + 8, y - 8, x + 8, y - 8);
        g1.drawLine(x + 10, y - 9, x + 11, y - 9);
        g1.drawLine(x + 10, y - 10, x + 10, y - 10);
        x += 13;
    }

    private void v(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 1);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 2, y, x + 2, y - 7);
        g1.drawLine(x + 1, y - 8, x + 1, y - 8);
        g1.drawLine(x + 2, y - 9, x + 4, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        g1.drawLine(x + 4, y - 9, x + 4, y - 12);
        g1.drawLine(x + 2, y - 11, x + 4, y - 12);
        x += 6;
    }

    private void s(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 7);
        g1.drawLine(x, y, x, y - 9);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 1, y - 9, x + 1, y - 10);
        g1.drawLine(x + 2, y - 1, x + 2, y - 2);
        g1.drawLine(x + 2, y - 10, x + 2, y - 11);
        g1.drawLine(x + 3, y - 10, x + 3, y - 10);
        g1.drawLine(x + 1, y - 8, x + 4, y - 8);
        g1.drawLine(x + 5, y - 1, x + 5, y - 7);
        g1.drawLine(x + 6, y, x + 9, y);
        g1.drawLine(x + 6, y, x + 9, y);
        g1.drawLine(x + 10, y, x + 10, y - 8);
        g1.drawLine(x + 9, y - 9, x + 9, y - 9);
        g1.drawLine(x + 10, y - 10, x + 11, y - 10);
        x += 13;
    }

    private void h(Graphics g1)
    {
        g1.drawLine(x + 1, y - 1, x + 1, y - 7);
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x, y - 9, x + 2, y - 9);
        g1.drawLine(x + 1, y, x + 5, y);
        g1.drawLine(x + 6, y - 1, x + 6, y - 8);
        g1.drawLine(x + 5, y - 9, x + 5, y - 9);
        g1.drawLine(x + 6, y - 10, x + 8, y - 10);
        g1.drawLine(x + 6, y - 10, x + 10, y - 10);
        g1.drawLine(x + 11, y, x + 11, y - 9);
        x += 13;
    }

    private void L(Graphics g1)
    {
        g1.drawLine(x, y - 7, x, y - 9);
        g1.drawLine(x + 1, y - 1, x + 1, y - 6);
        g1.drawLine(x + 2, y - 5, x + 6, y - 5);
        g1.drawLine(x + 2, y, x + 4, y);
        g1.drawLine(x + 5, y - 1, x + 5, y - 5);
        g1.drawLine(x + 1, y - 10, x + 1, y - 10);
        g1.drawLine(x + 1, y - 9, x + 1, y - 9);
        g1.drawLine(x + 2, y - 10, x + 6, y - 10);
        g1.drawLine(x + 6, y - 9, x + 6, y - 7);
        g1.drawLine(x + 3, y - 7, x + 6, y - 7);
        x += 4;
        y += 6;
        g1.drawLine(x, y, x, y - 3);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 2, y - 1, x + 3, y - 1);
        g1.drawLine(x + 3, y, x + 4, y);
        g1.drawLine(x + 5, y, x + 5, y - 13);
        g1.drawLine(x + 4, y - 14, x + 4, y - 14);
        g1.drawLine(x + 5, y - 15, x + 7, y - 15);
        g1.drawLine(x + 5, y - 16, x + 5, y - 16);
        g1.drawLine(x - 1, y - 2, x - 1, y - 3);
        y -= 6;
        x += 9;
    }

    private void G(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 1);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 2, y, x + 2, y - 7);
        g1.drawLine(x + 1, y - 8, x + 1, y - 8);
        g1.drawLine(x + 2, y - 9, x + 4, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        g1.drawLine(x + 3, y - 5, x + 7, y - 5);
        x += 5;
        g1.drawLine(x, y, x, y - 1);
        g1.drawLine(x + 1, y - 2, x + 1, y - 2);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 2, y, x + 2, y - 7);
        g1.drawLine(x + 1, y - 8, x + 1, y - 8);
        g1.drawLine(x + 2, y - 9, x + 4, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        x += 6;
    }

    private void Fb(Graphics g1)
    {
        g1.drawLine(x + 1, y - 1, x + 1, y - 7);
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x, y - 9, x + 2, y - 9);
        g1.drawLine(x + 1, y, x + 5, y);
        g1.drawLine(x + 6, y - 1, x + 6, y - 8);
        g1.drawLine(x + 5, y - 9, x + 5, y - 9);
        g1.drawLine(x + 6, y - 10, x + 8, y - 10);
        g1.drawLine(x + 1, y - 10, x + 1, y - 10);
        g1.drawLine(x, y + 3, x + 2, y + 3);
        g1.drawLine(x, y + 4, x + 1, y + 4);
        g1.drawLine(x + 3, y + 1, x + 3, y + 2);
        g1.drawLine(x + 4, y + 2, x + 5, y + 2);
        x += 9;
    }

    @SuppressWarnings("unused")
	private void FB(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 7);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 2, y - 2, x + 2, y - 2);
        g1.drawLine(x + 3, y, x + 3, y - 2);
        g1.drawLine(x + 1, y - 9, x + 7, y - 9);
        g1.drawLine(x + 7, y, x + 7, y - 9);
        g1.drawLine(x + 2, y - 10, x + 2, y - 10);
        g1.drawLine(x + 3, y - 8, x + 3, y - 8);
        g1.drawLine(x + 5, y - 10, x + 6, y - 10);
        g1.drawLine(x, y + 3, x + 2, y + 3);
        g1.drawLine(x, y + 4, x + 1, y + 4);
        g1.drawLine(x + 3, y + 1, x + 3, y + 2);
        g1.drawLine(x + 4, y + 2, x + 5, y + 2);
        x += 10;
    }

    private void Fo(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 3);
        g1.drawLine(x, y - 6, x, y - 7);
        g1.drawLine(x, y - 10, x + 1, y - 10);
        g1.drawLine(x, y, x + 3, y);
        g1.drawLine(x, y - 3, x + 3, y - 3);
        g1.drawLine(x, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y - 8, x + 4, y - 8);
        g1.drawLine(x + 2, y - 9, x + 3, y - 9);
        g1.drawLine(x + 1, y - 11, x + 5, y - 11);
        g1.drawLine(x + 4, y - 1, x + 4, y - 1);
        g1.drawLine(x + 4, y - 4, x + 4, y - 4);
        g1.drawLine(x + 5, y - 4, x + 5, y + 3);
        g1.drawLine(x + 5, y - 6, x + 5, y - 8);
        g1.drawLine(x + 5, y - 12, x + 5, y - 12);
        g1.drawLine(x + 4, y + 3, x + 4, y + 3);
        x += 8;
    }

    private void FE(Graphics g1)
    {
        g1.drawLine(x, y - 5, x, y - 6);
        g1.drawLine(x + 1, y, x + 1, y - 9);
        g1.drawLine(x + 2, y, x + 3, y - 1);
        g1.drawLine(x + 3, y - 1, x + 4, y);
        g1.drawLine(x + 5, y, x + 5, y - 7);
        g1.drawLine(x + 1, y - 7, x + 1, y - 7);
        g1.drawLine(x + 2, y - 8, x + 4, y - 8);
        x += 8;
    }

    private void Fu(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 3);
        g1.drawLine(x, y - 6, x, y - 7);
        g1.drawLine(x, y, x + 3, y);
        g1.drawLine(x, y - 3, x + 3, y - 3);
        g1.drawLine(x, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y - 8, x + 4, y - 8);
        g1.drawLine(x + 2, y - 9, x + 3, y - 9);
        g1.drawLine(x + 4, y - 1, x + 4, y - 1);
        g1.drawLine(x + 4, y - 4, x + 4, y - 4);
        g1.drawLine(x + 5, y - 4, x + 5, y + 3);
        g1.drawLine(x + 5, y - 6, x + 5, y - 8);
        g1.drawLine(x + 4, y + 3, x + 4, y + 3);
        x += 8;
    }

    private void FO(Graphics g1)
    {
        g1.drawLine(x, y, x, y - 3);
        g1.drawLine(x, y - 6, x, y - 7);
        g1.drawLine(x, y, x + 3, y);
        g1.drawLine(x, y - 3, x + 3, y - 3);
        g1.drawLine(x, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y - 8, x + 4, y - 8);
        g1.drawLine(x + 2, y - 9, x + 3, y - 9);
        g1.drawLine(x + 4, y - 1, x + 4, y - 1);
        g1.drawLine(x + 4, y - 4, x + 4, y - 4);
        g1.drawLine(x + 5, y - 4, x + 5, y + 3);
        g1.drawLine(x + 5, y - 6, x + 5, y - 8);
        g1.drawLine(x + 4, y + 3, x + 4, y + 3);
        g1.drawLine(x, y - 10, x, y - 11);
        g1.drawLine(x, y - 11, x + 3, y - 11);
        g1.drawLine(x + 4, y - 10, x + 5, y - 10);
        x += 8;
    }

    private void FU(Graphics g1)
    {
        g1.drawLine(x, y - 1, x, y - 7);
        g1.drawLine(x + 1, y - 8, x + 3, y - 8);
        g1.drawLine(x + 2, y - 7, x + 3, y - 7);
        g1.drawLine(x + 1, y - 5, x + 1, y - 6);
        g1.drawLine(x + 2, y - 5, x + 2, y - 5);
        g1.drawLine(x + 1, y, x + 4, y);
        g1.drawLine(x + 4, y, x + 4, y - 2);
        g1.drawLine(x + 2, y - 3, x + 3, y - 3);
        g1.drawLine(x + 4, y - 4, x + 4, y - 7);
        x++;
        y += 6;
        g1.drawLine(x, y - 1, x, y - 3);
        g1.drawLine(x + 1, y - 2, x + 1, y - 3);
        g1.drawLine(x + 1, y, x + 4, y);
        g1.drawLine(x + 5, y - 1, x + 5, y - 12);
        g1.drawLine(x + 4, y - 13, x + 4, y - 13);
        g1.drawLine(x + 5, y - 14, x + 7, y - 14);
        g1.drawLine(x + 5, y - 15, x + 5, y - 15);
        y -= 6;
        x += 8;
    }

    private void BA(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 9);
        g1.drawLine(x + 1, y - 1, x + 1, y - 10);
        g1.drawLine(x + 2, y, x + 5, y);
        g1.drawLine(x + 5, y + 2, x + 5, y - 8);
        g1.drawLine(x + 1, y - 10, x + 7, y - 10);
        g1.drawLine(x + 4, y - 9, x + 4, y - 9);
        g1.drawLine(x + 8, y, x + 8, y - 9);
        x += 11;
    }

    private void a(Graphics g1)
    {
        g1.drawLine(x, y - 10, x + 1, y - 10);
        g1.drawLine(x + 2, y - 9, x + 2, y - 9);
        g1.drawLine(x + 3, y, x + 3, y - 8);
        x += 5;
    }

    private void e(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 10);
        g1.drawLine(x + 1, y - 9, x + 3, y - 9);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 2, y - 2, x + 2, y - 2);
        g1.drawLine(x + 3, y - 1, x + 3, y - 1);
        x += 5;
    }

    private void E(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 10);
        g1.drawLine(x + 1, y - 9, x + 3, y - 9);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 2, y - 2, x + 2, y - 2);
        g1.drawLine(x + 3, y - 1, x + 3, y - 1);
        g1.drawLine(x, y - 13, x, y - 13);
        g1.drawLine(x + 1, y - 12, x + 1, y - 14);
        g1.drawLine(x + 1, y - 12, x + 3, y - 12);
        g1.drawLine(x + 3, y - 12, x + 3, y - 16);
        g1.drawLine(x + 2, y - 16, x + 2, y - 16);
        x += 5;
    }

    private void E9(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y, x + 1, y - 10);
        g1.drawLine(x + 1, y - 9, x + 3, y - 9);
        g1.drawLine(x + 2, y, x + 2, y);
        g1.drawLine(x + 2, y - 2, x + 2, y - 2);
        g1.drawLine(x + 3, y - 1, x + 3, y - 1);
        g1.drawLine(x, y - 15, x, y - 18);
        g1.drawLine(x + 1, y - 13, x + 1, y - 14);
        g1.drawLine(x + 1, y - 14, x + 3, y - 14);
        g1.drawLine(x + 3, y - 13, x + 3, y - 14);
        g1.drawLine(x + 2, y - 12, x + 2, y - 12);
        x += 5;
    }

    private void A(Graphics g1)
    {
        g1.drawLine(x, y - 10, x + 1, y - 10);
        g1.drawLine(x + 2, y - 9, x + 2, y - 9);
        g1.drawLine(x + 3, y, x + 3, y - 8);
        g1.drawLine(x + 4, y - 9, x + 4, y - 11);
        g1.drawLine(x + 3, y - 12, x + 3, y - 13);
        g1.drawLine(x + 2, y - 13, x + 2, y - 14);
        x += 5;
    }

    private void m1(Graphics g1)
    {
        x -= 5;
        g1.drawLine(x, y + 6, x, y + 2);
        g1.drawLine(x + 1, y + 6, x + 4, y + 6);
        g1.drawLine(x + 5, y + 5, x + 5, y - 13);
        g1.drawLine(x, y - 14, x + 4, y - 14);
        g1.drawLine(x, y - 13, x, y - 16);
        x += 8;
    }

    private void m2(Graphics g1)
    {
        x -= 4;
        g1.drawLine(x, y + 6, x, y + 2);
        g1.drawLine(x + 1, y + 6, x + 4, y + 6);
        g1.drawLine(x + 5, y + 5, x + 5, y - 17);
        g1.drawLine(x, y - 13, x + 5, y - 13);
        g1.drawLine(x, y - 13, x, y - 15);
        g1.drawLine(x, y - 13, x, y - 15);
        g1.drawLine(x + 1, y - 16, x + 2, y - 16);
        g1.drawLine(x + 3, y - 15, x + 3, y - 15);
        g1.drawLine(x + 4, y - 14, x + 4, y - 14);
        g1.drawLine(x + 3, y - 16, x + 3, y - 18);
        x += 8;
    }

    private void m3(Graphics g1)
    {
        g1.drawLine(x, y - 2, x, y - 3);
        g1.drawLine(x, y - 5, x, y - 6);
        g1.drawLine(x + 1, y - 2, x + 1, y - 3);
        g1.drawLine(x + 1, y - 5, x + 1, y - 6);
        x += 4;
    }

    private void H(Graphics g1)
    {
        g1.drawLine(x, y - 1, x, y - 2);
        g1.drawLine(x + 3, y - 1, x + 3, y - 2);
        g1.drawLine(x + 1, y - 3, x + 2, y - 3);
        g1.drawLine(x + 1, y, x + 2, y);
        g1.drawLine(x, y - 6, x, y - 9);
        g1.drawLine(x + 3, y - 6, x + 3, y - 9);
        g1.drawLine(x + 1, y - 10, x + 2, y - 10);
        g1.drawLine(x + 1, y - 5, x + 2, y - 5);
        x += 5;
    }

    private void sp(Graphics g1)
    {
        g1.drawLine(x, y - 3, x + 1, y - 3);
        g1.drawLine(x + 1, y - 1, x + 1, y - 3);
        g1.drawLine(x, y, x, y);
        x += 6;
    }

    private void Xs(Graphics g1)
    {
        y += 5;
        x -= 5;
        g1.drawLine(x, y - 4, x, y - 4);
        g1.drawLine(x + 1, y, x + 1, y - 3);
        g1.drawLine(x + 2, y, x + 3, y);
        g1.drawLine(x + 3, y - 3, x + 3, y - 3);
        g1.drawLine(x + 4, y - 1, x + 4, y - 3);
        g1.drawLine(x + 5, y, x + 7, y);
        g1.drawLine(x + 7, y, x + 7, y - 11);
        g1.drawLine(x + 6, y - 12, x + 6, y - 13);
        g1.drawLine(x + 6, y - 12, x + 6, y - 13);
        g1.drawLine(x + 6, y - 13, x + 8, y - 13);
        g1.drawLine(x + 7, y - 13, x + 7, y - 14);
        x += 10;
        y -= 5;
    }

    private void Qs(Graphics g1)
    {
        y += 6;
        x -= 7;
        g1.drawLine(x, y, x, y - 4);
        g1.drawLine(x, y, x, y - 4);
        g1.drawLine(x, y - 4, x + 3, y - 4);
        g1.drawLine(x + 3, y, x + 3, y - 4);
        g1.drawLine(x + 1, y - 1, x + 1, y - 1);
        g1.drawLine(x, y - 4, x + 3, y - 4);
        g1.drawLine(x, y, x + 8, y);
        g1.drawLine(x + 6, y, x + 6, y - 2);
        g1.drawLine(x + 5, y - 2, x + 5, y - 2);
        g1.drawLine(x + 9, y - 1, x + 9, y - 13);
        g1.drawLine(x + 8, y - 14, x + 8, y - 14);
        g1.drawLine(x + 9, y - 15, x + 9, y - 16);
        g1.drawLine(x + 9, y - 15, x + 10, y - 15);
        y -= 6;
        x += 10;
    }

    private void bs(Graphics g1)
    {
        y += 6;
        x -= 5;
        g1.drawLine(x, y, x, y - 3);
        g1.drawLine(x + 1, y - 2, x + 1, y - 3);
        g1.drawLine(x + 1, y, x + 1, y);
        g1.drawLine(x + 2, y - 1, x + 3, y - 1);
        g1.drawLine(x + 3, y, x + 4, y);
        g1.drawLine(x + 5, y, x + 5, y - 13);
        g1.drawLine(x + 4, y - 14, x + 4, y - 14);
        g1.drawLine(x + 5, y - 15, x + 7, y - 15);
        g1.drawLine(x + 5, y - 16, x + 5, y - 16);
        x += 8;
        y -= 6;
    }

    private void ys(Graphics g1)
    {
        y += 5;
        x -= 4;
        g1.drawLine(x, y - 1, x, y - 3);
        g1.drawLine(x + 1, y - 2, x + 1, y - 3);
        g1.drawLine(x + 1, y, x + 4, y);
        g1.drawLine(x + 5, y - 1, x + 5, y - 12);
        g1.drawLine(x + 4, y - 13, x + 4, y - 13);
        g1.drawLine(x + 5, y - 14, x + 7, y - 14);
        g1.drawLine(x + 5, y - 15, x + 5, y - 15);
        y -= 5;
        x += 9;
    }

    private void rs(Graphics g1)
    {
        g1.drawLine(x, y - 8, x, y - 8);
        g1.drawLine(x + 1, y - 9, x + 3, y - 9);
        g1.drawLine(x + 1, y - 10, x + 1, y - 10);
        g1.drawLine(x + 1, y + 7, x + 1, y - 7);
        g1.drawLine(x + 2, y + 8, x + 5, y + 8);
        g1.drawLine(x + 5, y + 8, x + 5, y + 6);
        x += 4;
    }

    private void ss(Graphics g1)
    {
        x -= 5;
        y += 6;
        g1.drawLine(x, y - 2, x, y - 3);
        g1.drawLine(x + 1, y, x + 1, y - 4);
        g1.drawLine(x + 1, y, x + 5, y);
        g1.drawLine(x + 6, y - 1, x + 6, y - 13);
        g1.drawLine(x + 5, y - 14, x + 5, y - 14);
        g1.drawLine(x + 6, y - 16, x + 6, y - 16);
        g1.drawLine(x + 6, y - 15, x + 7, y - 15);
        g1.drawLine(x + 4, y - 5, x + 7, y - 6);
        x += 9;
        y -= 6;
    }

    @SuppressWarnings("unused")
	private void Fs(Graphics g1)
    {
        y += 5;
        x -= 8;
        g1.drawLine(x, y, x, y - 2);
        g1.drawLine(x, y, x + 2, y);
        g1.drawLine(x + 1, y - 3, x + 5, y - 3);
        g1.drawLine(x + 5, y, x + 5, y - 3);
        g1.drawLine(x + 5, y, x + 8, y);
        g1.drawLine(x + 9, y, x + 9, y - 13);
        g1.drawLine(x + 8, y - 14, x + 8, y - 14);
        g1.drawLine(x + 9, y - 15, x + 9, y - 15);
        g1.drawLine(x + 9, y - 15, x + 10, y - 15);
        y -= 6;
        x += 12;
    }

    private void ks(Graphics g1)
    {
        c = x - 9;
        d = y + 5;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 1, d - 4, c + 4, d - 4);
        g1.drawLine(c + 5, d, c + 5, d - 3);
    }

    @SuppressWarnings("unused")
	private void xs(Graphics g1)
    {
        c = x - 8;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c + 1, d, c + 4, d);
        g1.drawLine(c, d - 1, c, d - 4);
        g1.drawLine(c + 1, d - 5, c + 4, d - 5);
        g1.drawLine(c + 5, d - 1, c + 5, d - 4);
        g1.drawLine(c + 1, d - 2, c + 3, d - 2);
        g1.drawLine(c + 4, d - 3, c + 4, d - 3);
    }

    private void Ks(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 1, d - 4, c + 4, d - 4);
        g1.drawLine(c + 5, d, c + 5, d - 3);
        g1.drawLine(c + 1, d, c + 2, d - 1);
        g1.drawLine(c + 2, d - 1, c + 3, d - 1);
    }

    private void gs(Graphics g1)
    {
        c = x - 9;
        d = y + 5;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 1, c, d - 3);
        g1.drawLine(c + 1, d - 2, c + 1, d - 3);
        g1.drawLine(c + 1, d, c + 3, d);
        g1.drawLine(c + 3, d - 1, c + 5, d - 1);
        g1.drawLine(c + 5, d - 2, c + 6, d - 2);
    }

    private void cs(Graphics g1)
    {
        c = x - 8;
        d = y + 5;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 1);
        g1.drawLine(c + 1, d - 2, c + 1, d - 2);
        g1.drawLine(c + 1, d - 5, c + 1, d - 5);
        g1.drawLine(c, d, c + 2, d);
        g1.drawLine(c + 2, d - 3, c + 2, d - 5);
        g1.drawLine(c + 3, d - 1, c + 3, d - 1);
        g1.drawLine(c + 3, d - 1, c + 3, d - 1);
        g1.drawLine(c + 4, d - 2, c + 4, d - 4);
        g1.drawLine(c + 4, d - 2, c + 6, d - 2);
    }

    private void Bs(Graphics g1)
    {
        c = x - 8;
        d = y + 5;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 4, d, c + 4, d - 3);
        g1.drawLine(c + 1, d - 3, c + 1, d - 3);
        g1.drawLine(c + 3, d - 3, c + 3, d - 3);
        g1.drawLine(c + 2, d - 2, c + 2, d - 2);
    }

    private void qs(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 1);
        g1.drawLine(c + 1, d, c + 1, d - 3);
        g1.drawLine(c + 1, d - 1, c + 3, d - 1);
        g1.drawLine(c + 3, d, c + 6, d);
        g1.drawLine(c + 6, d, c + 6, d - 4);
        g1.drawLine(c + 5, d - 4, c + 5, d - 4);
        g1.drawLine(c + 5, d - 2, c + 5, d - 2);
        g1.drawLine(c + 4, d - 3, c + 4, d - 3);
    }

    private void Cs(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 2);
        g1.drawLine(c + 1, d - 3, c + 2, d - 3);
        g1.drawLine(c + 1, d, c + 5, d);
        g1.drawLine(c + 5, d, c + 5, d - 3);
        g1.drawLine(c + 4, d - 3, c + 4, d - 3);
        g1.drawLine(c + 5, d - 1, c + 5, d - 2);
        g1.drawLine(c + 6, d - 1, c + 6, d - 1);
    }

    private void js(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 1, d, c + 1, d);
        g1.drawLine(c + 1, d - 3, c + 1, d - 3);
        g1.drawLine(c + 3, d - 3, c + 4, d - 3);
        g1.drawLine(c + 2, d - 2, c + 2, d - 2);
        g1.drawLine(c + 5, d, c + 5, d - 2);
        g1.drawLine(c + 5, d - 3, c + 7, d - 3);
        g1.drawLine(c + 8, d, c + 8, d - 2);
        g1.drawLine(c + 1, d + 1, c + 1, d + 1);
        g1.drawLine(c + 2, d + 2, c + 4, d + 2);
        g1.drawLine(c + 5, d + 3, c + 7, d + 3);
        g1.drawLine(c + 7, d + 2, c + 7, d + 2);
    }

    private void Js(Graphics g1)
    {
        c = x - 9;
        d = y + 1;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 29;
        }
        g1.drawLine(c + 1, d + 1, c + 1, d + 1);
        g1.drawLine(c + 2, d + 2, c + 4, d + 2);
        g1.drawLine(c + 5, d + 3, c + 7, d + 3);
        g1.drawLine(c + 7, d + 2, c + 7, d + 2);
    }

    private void ds(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 1, d - 4, c + 4, d - 4);
        g1.drawLine(c + 5, d, c + 5, d - 3);
        g1.drawLine(c + 1, d, c + 1, d);
        g1.drawLine(c + 1, d - 2, c + 2, d - 1);
    }

    private void fs(Graphics g1)
    {
        c = x - 9;
        d = y + 5;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 2, c + 1, d - 2);
        g1.drawLine(c, d - 3, c + 4, d - 3);
        g1.drawLine(c + 5, d - 1, c + 7, d - 1);
    }

    private void Ds(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 1, c + 3, d - 4);
        g1.drawLine(c, d - 3, c + 1, d - 4);
        g1.drawLine(c + 1, d, c + 5, d);
        g1.drawLine(c + 5, d, c + 5, d - 3);
        g1.drawLine(c + 1, d, c + 5, d);
        g1.drawLine(c + 4, d - 4, c + 4, d - 4);
        g1.drawLine(c + 2, d - 2, c + 3, d - 2);
        g1.drawLine(c + 5, d + 1, c + 5, d + 1);
    }

    private void Ns(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 1, d, c + 1, d);
        g1.drawLine(c + 1, d - 2, c + 1, d - 2);
        g1.drawLine(c + 2, d - 1, c + 2, d - 1);
        g1.drawLine(c + 1, d - 4, c + 3, d - 4);
        g1.drawLine(c + 4, d, c + 4, d - 3);
        g1.drawLine(c + 4, d, c + 6, d - 2);
        g1.drawLine(c + 6, d - 2, c + 8, d);
        g1.drawLine(c + 8, d, c + 8, d - 3);
        g1.drawLine(c + 9, d - 4, c + 11, d - 4);
        g1.drawLine(c + 12, d, c + 12, d - 3);
    }

    @SuppressWarnings("unused")
	private void ts(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 1, d - 4, c + 4, d - 4);
        g1.drawLine(c + 5, d, c + 5, d - 3);
        g1.drawLine(c + 1, d, c + 1, d);
        g1.drawLine(c + 1, d - 2, c + 2, d - 1);
    }

    private void Ts(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 1, c, d - 2);
        g1.drawLine(c, d - 1, c, d - 2);
        g1.drawLine(c + 1, d - 2, c + 3, d - 2);
        g1.drawLine(c + 3, d - 3, c + 4, d - 3);
        g1.drawLine(c + 5, d - 4, c + 6, d - 4);
        g1.drawLine(c + 6, d + 1, c + 6, d - 2);
        g1.drawLine(c + 5, d - 1, c + 5, d - 2);
        g1.drawLine(c + 4, d - 1, c + 4, d - 1);
        g1.drawLine(c + 6, d, c + 6, d - 2);
        g1.drawLine(c + 1, d, c + 3, d);
    }

    private void Zs(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 1, c + 1, d);
        g1.drawLine(c + 2, d, c + 3, d - 1);
        g1.drawLine(c, d - 2, c + 3, d - 2);
        g1.drawLine(c + 4, d - 3, c + 5, d - 3);
        g1.drawLine(c + 5, d - 1, c + 5, d - 4);
        g1.drawLine(c, d - 2, c + 3, d - 2);
        g1.drawLine(c + 4, d, c + 5, d - 1);
        g1.drawLine(c + 5, d, c + 5, d);
    }

    private void ns(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 1, c, d - 2);
        g1.drawLine(c + 1, d - 3, c + 7, d - 3);
        g1.drawLine(c + 6, d, c + 6, d - 4);
        g1.drawLine(c + 7, d, c + 7, d - 1);
        g1.drawLine(c + 1, d, c + 4, d);
        g1.drawLine(c + 5, d - 1, c + 5, d - 1);
    }

    private void ps(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 3);
        g1.drawLine(c + 1, d, c + 2, d - 1);
        g1.drawLine(c + 3, d - 1, c + 4, d);
        g1.drawLine(c + 5, d, c + 5, d - 4);
        g1.drawLine(c + 4, d - 3, c + 4, d - 4);
    }

    private void ms(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 3, c + 2, d - 3);
        g1.drawLine(c + 2, d - 2, c + 3, d - 2);
        g1.drawLine(c + 3, d - 1, c + 4, d - 1);
        g1.drawLine(c + 5, d - 2, c + 5, d - 2);
        g1.drawLine(c + 6, d, c + 6, d - 3);
        g1.drawLine(c + 7, d, c + 7, d - 2);
    }

    private void ls(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 2);
        g1.drawLine(c + 1, d, c + 1, d);
        g1.drawLine(c + 1, d - 3, c + 1, d - 3);
        g1.drawLine(c + 2, d - 1, c + 2, d - 3);
        g1.drawLine(c + 3, d - 1, c + 5, d - 3);
    }

    private void vs(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d - 1, c, d - 2);
        g1.drawLine(c + 1, d, c + 4, d);
        g1.drawLine(c, d - 2, c + 3, d - 2);
        g1.drawLine(c + 4, d - 3, c + 5, d - 3);
        g1.drawLine(c + 6, d - 2, c + 6, d - 4);
        g1.drawLine(c + 5, d - 1, c + 5, d - 1);
    }

    private void hs(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 4);
        g1.drawLine(c, d, c + 2, d);
        g1.drawLine(c + 3, d, c + 3, d - 4);
        g1.drawLine(c + 3, d - 4, c + 5, d - 4);
        g1.drawLine(c + 5, d, c + 5, d - 4);
    }

    private void gh(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 4);
        g1.drawLine(c + 4, d, c + 4, d - 4);
        g1.drawLine(c, d - 2, c + 4, d - 2);
    }

    private void B1(Graphics g1)
    {
        c = x - 9;
        d = y + 6;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 24;
        }
        g1.drawLine(c, d, c, d - 1);
        g1.drawLine(c + 1, d, c + 1, d - 3);
        g1.drawLine(c + 2, d - 4, c + 5, d - 4);
        g1.drawLine(c + 6, d, c + 6, d - 3);
    }

    private void u(Graphics g1)
    {
        c = x - 10;
        d = y;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 30;
        }
        g1.drawLine(c + 3, d + 2, c + 3, d + 5);
    }

    private void u1(Graphics g1)
    {
        c = x - 10;
        d = y;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 29;
        }
        g1.drawLine(c + 3, d + 8, c + 3, d + 10);
    }

    private void U(Graphics g1)
    {
        c = x - 10;
        d = y;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 30;
        }
        g1.drawLine(c + 3, d + 2, c + 3, d + 4);
        g1.drawLine(c + 5, d + 2, c + 5, d + 4);
        g1.drawLine(c + 4, d + 5, c + 4, d + 5);
    }

    private void U1(Graphics g1)
    {
        c = x - 10;
        d = y;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 29;
        }
        g1.drawLine(c + 3, d + 7, c + 3, d + 9);
        g1.drawLine(c + 5, d + 7, c + 5, d + 9);
        g1.drawLine(c + 4, d + 10, c + 4, d + 10);
    }

    private void Y(Graphics g1)
    {
        c = x - 10;
        d = y;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 30;
        }
        g1.drawLine(c + 3, d + 3, c + 3, d + 7);
        g1.drawLine(c + 7, d + 3, c + 7, d + 7);
        g1.drawLine(c + 4, d + 7, c + 4, d + 7);
        g1.drawLine(c + 6, d + 7, c + 6, d + 7);
        g1.drawLine(c + 5, d + 6, c + 5, d + 6);
    }

    private void Y1(Graphics g1)
    {
        c = x - 10;
        d = y + 1;
        if(x == 5)
        {
            c = Pwidth - 5;
            d = y - 29;
        }
        g1.drawLine(c + 3, d + 7, c + 3, d + 10);
        g1.drawLine(c + 7, d + 7, c + 7, d + 10);
        g1.drawLine(c + 4, d + 10, c + 4, d + 10);
        g1.drawLine(c + 6, d + 10, c + 6, d + 10);
        g1.drawLine(c + 5, d + 9, c + 5, d + 9);
    }

    private void TB1(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a + 2, b, a + 2, b - 3);
    }

    private void TB2(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a + 2, b, a + 2, b - 3);
        g1.drawLine(a + 4, b, a + 4, b - 3);
    }

    private void Ti(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b, a + 6, b);
        g1.drawLine(a, b - 1, a, b - 1);
        g1.drawLine(a + 1, b - 2, a + 4, b - 2);
        g1.drawLine(a + 5, b - 1, a + 5, b - 1);
    }

    private void TI(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b, a + 6, b);
        g1.drawLine(a, b - 1, a, b - 1);
        g1.drawLine(a + 1, b - 2, a + 4, b - 2);
        g1.drawLine(a + 5, b - 1, a + 5, b - 1);
        g1.drawLine(a + 6, b - 1, a + 6, b - 4);
    }

    private void Tw(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b, a + 6, b);
        g1.drawLine(a, b - 1, a, b - 1);
        g1.drawLine(a + 1, b - 2, a + 4, b - 2);
        g1.drawLine(a + 5, b - 1, a + 5, b - 1);
        g1.drawLine(a + 6, b - 1, a + 6, b - 3);
        g1.drawLine(a + 4, b - 2, a + 4, b - 3);
        g1.drawLine(a + 5, b - 3, a + 5, b - 3);
    }

    private void TW(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b, a + 6, b);
        g1.drawLine(a, b - 1, a, b - 1);
        g1.drawLine(a + 1, b - 2, a + 4, b - 2);
        g1.drawLine(a + 5, b - 1, a + 5, b - 1);
        g1.drawLine(a + 6, b - 1, a + 6, b - 4);
        g1.drawLine(a + 4, b - 2, a + 4, b - 5);
    }

    private void TM(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 3;
            b = y - 42;
        }
        g1.drawLine(a, b - 1, a, b - 3);
        g1.drawLine(a + 1, b - 4, a + 2, b - 4);
        g1.drawLine(a + 1, b, a + 2, b);
        g1.drawLine(a + 3, b - 1, a + 3, b - 3);
    }

    @SuppressWarnings("unused")
	private void Tm(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b - 1, a, b - 3);
        g1.drawLine(a + 1, b - 4, a + 2, b - 4);
        g1.drawLine(a + 1, b, a + 2, b);
        g1.drawLine(a + 3, b - 1, a + 3, b - 3);
    }

    private void TSGA(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b, a + 3, b);
        g1.drawLine(a, b - 1, a + 1, b - 1);
        g1.drawLine(a + 3, b - 1, a + 3, b - 1);
        g1.drawLine(a + 4, b - 2, a + 4, b - 4);
        g1.drawLine(a + 3, b - 4, a + 3, b - 4);
    }

    private void TRBA(Graphics g1)
    {
        a = x - 7;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b - 2, a, b - 3);
        g1.drawLine(a + 1, b - 1, a + 1, b - 2);
        g1.drawLine(a + 1, b - 4, a + 3, b - 4);
        g1.drawLine(a + 1, b - 2, a + 3, b - 2);
        g1.drawLine(a + 3, b, a + 3, b - 3);
        g1.drawLine(a + 2, b, a + 2, b);
        g1.drawLine(a + 4, b - 3, a + 4, b - 3);
        g1.drawLine(a + 5, b - 2, a + 6, b - 2);
        g1.drawLine(a + 7, b - 3, a + 7, b - 3);
    }

    private void TSUB(Graphics g1)
    {
        a = x - 9;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b, a, b);
        g1.drawLine(a + 1, b - 1, a + 2, b - 1);
        g1.drawLine(a + 3, b, a + 7, b);
        g1.drawLine(a + 5, b - 1, a + 5, b - 1);
    }

    private void TN8(Graphics g1)
    {
        a = x - 9;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b - 1, a, b - 2);
        g1.drawLine(a + 1, b, a + 1, b - 1);
        g1.drawLine(a + 1, b - 3, a + 4, b - 3);
        g1.drawLine(a + 2, b - 2, a + 2, b - 2);
        g1.drawLine(a + 3, b, a + 3, b - 1);
        g1.drawLine(a + 4, b, a + 4, b);
        g1.drawLine(a + 5, b - 1, a + 5, b - 2);
        g1.drawLine(a + 5, b - 4, a + 5, b - 4);
        g1.drawLine(a + 6, b - 5, a + 6, b - 6);
    }

    private void TI8(Graphics g1)
    {
        a = x - 9;
        b = y - 13;
        if(x == 5)
        {
            a = Pwidth - 5;
            b = y - 42;
        }
        g1.drawLine(a, b, a + 6, b);
        g1.drawLine(a, b - 1, a, b - 1);
        g1.drawLine(a + 1, b - 2, a + 4, b - 2);
        g1.drawLine(a + 5, b - 1, a + 5, b - 1);
        g1.drawLine(a + 6, b - 1, a + 6, b - 3);
        g1.drawLine(a + 4, b - 2, a + 4, b - 3);
        g1.drawLine(a + 5, b - 3, a + 5, b - 3);
        g1.drawLine(a + 6, b - 4, a + 6, b - 4);
        g1.drawLine(a + 7, b - 5, a + 8, b - 5);
    }

    private void ENG01(Graphics g1)
    {
        h = x;
        i = y;
        g1.drawLine(h, i, h + 2, i);
        g1.drawLine(h + 1, i, h + 1, i - 4);
        g1.drawLine(h + 2, i - 5, h + 2, i - 9);
        g1.drawLine(h + 3, i - 10, h + 3, i - 11);
        g1.drawLine(h + 4, i - 11, h + 4, i - 11);
    }

    private void ENG02(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i, h, i - 1);
        g1.drawLine(h, i - 5, h, i - 5);
        g1.drawLine(h + 1, i - 2, h + 1, i - 5);
        g1.drawLine(h + 2, i - 4, h + 2, i - 4);
        g1.drawLine(h + 3, i - 5, h + 5, i - 5);
        g1.drawLine(h + 5, i - 2, h + 5, i - 5);
        g1.drawLine(h + 4, i - 1, h + 4, i - 1);
        g1.drawLine(h + 4, i, h + 6, i);
    }

    private void ENG03(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i, h, i - 1);
        g1.drawLine(h, i, h + 2, i);
        g1.drawLine(h, i - 5, h, i - 5);
        g1.drawLine(h + 1, i - 2, h + 1, i - 5);
        g1.drawLine(h + 2, i - 8, h + 2, i - 8);
    }

    private void ENG04(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i, h, i - 1);
        g1.drawLine(h, i, h + 2, i);
        g1.drawLine(h, i - 5, h + 3, i - 5);
        g1.drawLine(h + 1, i - 2, h + 1, i - 5);
        g1.drawLine(h + 2, i - 8, h + 2, i - 8);
        g1.drawLine(h + 2, i - 5, h + 2, i - 7);
    }

    private void ENG05(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i - 1, h, i - 3);
        g1.drawLine(h + 1, i, h + 3, i);
        g1.drawLine(h + 1, i - 4, h + 1, i - 4);
        g1.drawLine(h + 2, i - 5, h + 4, i - 5);
        g1.drawLine(h + 4, i - 1, h + 4, i - 1);
        g1.drawLine(h + 5, i - 1, h + 5, i - 4);
        g1.drawLine(h + 6, i - 4, h + 6, i - 5);
        g1.drawLine(h + 6, i, h + 6, i);
    }

    private void ENG06(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i - 1, h, i - 3);
        g1.drawLine(h + 1, i, h + 3, i);
        g1.drawLine(h + 1, i - 4, h + 1, i - 4);
        g1.drawLine(h + 2, i - 5, h + 4, i - 5);
        g1.drawLine(h + 4, i - 1, h + 4, i - 1);
        g1.drawLine(h + 5, i - 1, h + 5, i - 4);
        g1.drawLine(h + 6, i - 4, h + 6, i - 8);
        g1.drawLine(h + 6, i, h + 6, i);
        g1.drawLine(h + 5, i - 7, h + 5, i - 7);
        g1.drawLine(h + 7, i - 8, h + 7, i - 8);
    }

    private void ENG07(Graphics g1)
    {
        h = x;
        i = y;
        g1.drawLine(h, i, h + 2, i);
        g1.drawLine(h + 4, i - 1, h + 4, i - 4);
        g1.drawLine(h + 5, i - 5, h + 5, i - 8);
        g1.drawLine(h + 4, i - 8, h + 4, i - 8);
        g1.drawLine(h + 4, i - 8, h + 4, i - 8);
        g1.drawLine(h + 5, i - 11, h + 5, i - 11);
    }

    private void ENG08(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i, h, i - 1);
        g1.drawLine(h, i - 4, h, i - 4);
        g1.drawLine(h, i, h + 2, i);
        g1.drawLine(h + 3, i - 1, h + 5, i - 3);
        g1.drawLine(h + 1, i - 2, h + 1, i - 5);
        g1.drawLine(h + 2, i - 5, h + 2, i - 5);
        g1.drawLine(h + 5, i - 4, h + 5, i - 5);
    }

    private void ENG09(Graphics g1)
    {
        h = x;
        i = y;
        g1.drawLine(h, i, h + 3, i);
        g1.drawLine(h + 2, i, h + 2, i - 4);
        g1.drawLine(h + 2, i, h + 2, i - 4);
        g1.drawLine(h + 2, i - 8, h + 2, i - 8);
        g1.drawLine(h + 3, i - 5, h + 3, i - 8);
        g1.drawLine(h + 3, i - 3, h + 6, i - 3);
        g1.drawLine(h + 7, i - 4, h + 7, i - 4);
        g1.drawLine(h + 8, i - 5, h + 8, i - 7);
        g1.drawLine(h + 5, i - 8, h + 7, i - 8);
        g1.drawLine(h + 4, i - 7, h + 4, i - 7);
    }

    private void ENG10(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i, h, i - 1);
        g1.drawLine(h, i - 5, h, i - 5);
        g1.drawLine(h + 1, i - 2, h + 1, i - 5);
        g1.drawLine(h + 2, i - 4, h + 2, i - 4);
        g1.drawLine(h + 3, i - 5, h + 4, i - 5);
    }

    private void ENG11(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i - 1, h, i - 3);
        g1.drawLine(h + 1, i, h + 3, i);
        g1.drawLine(h + 4, i - 1, h + 4, i - 1);
        g1.drawLine(h + 1, i - 4, h + 1, i - 4);
        g1.drawLine(h + 2, i - 5, h + 5, i - 5);
        g1.drawLine(h + 5, i - 4, h + 5, i - 4);
        g1.drawLine(h, i - 3, h + 5, i - 3);
    }

    private void ENG12(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i - 1, h, i - 3);
        g1.drawLine(h + 1, i, h + 3, i);
        g1.drawLine(h + 4, i - 1, h + 4, i - 1);
        g1.drawLine(h + 1, i - 4, h + 1, i - 4);
        g1.drawLine(h + 2, i - 5, h + 5, i - 5);
        g1.drawLine(h + 5, i - 4, h + 5, i - 4);
    }

    private void ENG13(Graphics g1)
    {
        h = x;
        i = y - 3;
        g1.drawLine(h, i - 1, h, i - 3);
        g1.drawLine(h + 1, i, h + 3, i);
        g1.drawLine(h + 4, i - 1, h + 4, i - 1);
        g1.drawLine(h + 1, i - 4, h + 1, i - 4);
        g1.drawLine(h + 2, i - 5, h + 5, i - 5);
        g1.drawLine(h + 6, i - 4, h + 6, i - 2);
        g1.drawLine(h + 5, i - 1, h + 5, i - 1);
    }

    private void ENG14(Graphics g1)
    {
        h = x;
        i = y;
        g1.drawLine(h, i, h, i);
        g1.drawLine(h + 1, i, h + 1, i - 1);
        g1.drawLine(h + 2, i - 2, h + 2, i - 6);
        g1.drawLine(h + 3, i - 7, h + 3, i - 10);
        g1.drawLine(h + 2, i - 10, h + 4, i - 10);
    }

    protected void paint(Graphics g1)
    {
        int i1 = getWidth();
        int j1 = getHeight();
        Pwidth = i1 - 8;
        Pheight = j1;
        g1.setColor(255, 255, 255);
        g1.fillRect(0, 0, i1, j1);
        g1.drawLine(x, y - 1, x, y - 3);
        g1.drawLine(x + 1, y - 1, x + 1, y - 3);
        g1.drawLine(x, y - 7, x, y - 10);
        g1.drawLine(x + 1, y - 7, x + 1, y - 10);
        x = 5;
        y = 5 + arow;
        g1.setColor(0xff00ff);
        g1.drawString(strWord, x + 5, y, 20);
        g1.setColor(7893);
        y += 30;
        for(int k1 = 0; k1 < strContent.length(); k1++)
        {
            if(x > Pwidth)
            {
                x = 5;
                y += 30;
            }
            switch(strContent.charAt(k1))
            {
            default:
                break;

            case 32: // ' '
                sp(g1);
                break;

            case 35: // '#'
                Fb(g1);
                break;

            case 38: // '&'
                TSGA(g1);
                break;

            case 40: // '('
                TRBA(g1);
                break;

            case 41: // ')'
                if(strContent.charAt(k1 - 2) != '(')
                    TSUB(g1);
                break;

            case 44: // ','
                ks(g1);
                break;

            case 48: // '0'
                TB1(g1);
                break;

            case 50: // '2'
                g1.setColor(52224);
                ENG01(g1);
                x += 4;
                ENG02(g1);
                x += 5;
                ENG14(g1);
                x += 6;
                g1.setColor(7893);
                break;

            case 51: // '3'
                g1.setColor(0xff0000);
                ENG01(g1);
                x += 4;
                ENG03(g1);
                x += 4;
                ENG08(g1);
                x += 5;
                ENG14(g1);
                x += 5;
                g1.setColor(7893);
                break;

            case 52: // '4'
                g1.setColor(0xff00ff);
                ENG01(g1);
                x += 4;
                ENG04(g1);
                x += 4;
                ENG08(g1);
                x += 5;
                ENG14(g1);
                x += 5;
                g1.setColor(7893);
                break;

            case 53: // '5'
                g1.setColor(0);
                ENG01(g1);
                x += 4;
                ENG05(g1);
                x += 8;
                ENG06(g1);
                x += 4;
                ENG07(g1);
                x += 5;
                ENG14(g1);
                x += 5;
                g1.setColor(7893);
                break;

            case 54: // '6'
                g1.setColor(0xff00ff);
                ENG01(g1);
                x += 4;
                ENG05(g1);
                x += 8;
                ENG06(g1);
                x += 7;
                ENG08(g1);
                x += 6;
                ENG14(g1);
                x += 5;
                g1.setColor(7893);
                break;

            case 55: // '7'
                g1.setColor(0);
                ENG01(g1);
                x += 4;
                ENG09(g1);
                x += 10;
                ENG10(g1);
                x += 4;
                ENG11(g1);
                x += 5;
                ENG14(g1);
                x += 5;
                g1.setColor(7893);
                break;

            case 56: // '8'
                g1.setColor(0xff00ff);
                ENG01(g1);
                x += 4;
                ENG12(g1);
                x += 7;
                ENG13(g1);
                x += 8;
                ENG02(g1);
                x += 5;
                ENG14(g1);
                x += 5;
                g1.setColor(7893);
                break;

            case 57: // '9'
                g1.setColor(0);
                ENG01(g1);
                x += 4;
                ENG09(g1);
                x += 10;
                ENG02(g1);
                x += 5;
                ENG14(g1);
                x += 5;
                g1.setColor(7893);
                break;

            case 58: // ':'
                BA(g1);
                break;

            case 59: // ';'
                m3(g1);
                break;

            case 60: // '<'
                Ks(g1);
                break;

            case 61: // '='
                Js(g1);
                break;

            case 63: // '?'
                TM(g1);
                break;

            case 65: // 'A'
                A(g1);
                break;

            case 66: // 'B'
                B(g1);
                break;

            case 67: // 'C'
                C(g1);
                break;

            case 68: // 'D'
                D(g1);
                break;

            case 69: // 'E'
                E(g1);
                break;

            case 70: // 'F'
                F(g1);
                break;

            case 71: // 'G'
                G(g1);
                break;

            case 72: // 'H'
                H(g1);
                break;

            case 73: // 'I'
                TI(g1);
                break;

            case 74: // 'J'
                B(g1);
                a(g1);
                break;

            case 75: // 'K'
                K(g1);
                break;

            case 76: // 'L'
                L(g1);
                break;

            case 77: // 'M'
                TM(g1);
                break;

            case 78: // 'N'
                N(g1);
                break;

            case 79: // 'O'
                FO(g1);
                break;

            case 80: // 'P'
                P(g1);
                break;

            case 81: // 'Q'
                Q(g1);
                break;

            case 82: // 'R'
                rs(g1);
                break;

            case 83: // 'S'
                ss(g1);
                break;

            case 84: // 'T'
                T(g1);
                break;

            case 85: // 'U'
                U(g1);
                break;

            case 86: // 'V'
                vs(g1);
                break;

            case 87: // 'W'
                TW(g1);
                break;

            case 88: // 'X'
                X(g1);
                break;

            case 89: // 'Y'
                Y(g1);
                break;

            case 90: // 'Z'
                Z(g1);
                break;

            case 91: // '['
                m1(g1);
                break;

            case 93: // ']'
                m2(g1);
                break;

            case 97: // 'a'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    a(g1);
                break;

            case 98: // 'b'
                b(g1);
                break;

            case 99: // 'c'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    c(g1);
                break;

            case 100: // 'd'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    d(g1);
                break;

            case 101: // 'e'
                e(g1);
                break;

            case 102: // 'f'
                f(g1);
                break;

            case 103: // 'g'
                g(g1);
                break;

            case 104: // 'h'
                h(g1);
                break;

            case 105: // 'i'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    Ti(g1);
                break;

            case 106: // 'j'
                j(g1);
                break;

            case 107: // 'k'
                k(g1);
                break;

            case 108: // 'l'
                l(g1);
                break;

            case 109: // 'm'
                m(g1);
                break;

            case 110: // 'n'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    n(g1);
                break;

            case 111: // 'o'
                FU(g1);
                break;

            case 112: // 'p'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    p(g1);
                break;

            case 113: // 'q'
                q(g1);
                break;

            case 114: // 'r'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    r(g1);
                break;

            case 115: // 's'
                s(g1);
                break;

            case 116: // 't'
                if(strContent.charAt(k1 - 1) != '(' || strContent.charAt(k1 + 1) != ')')
                    t(g1);
                break;

            case 117: // 'u'
                u(g1);
                break;

            case 118: // 'v'
                v(g1);
                break;

            case 119: // 'w'
                Tw(g1);
                break;

            case 120: // 'x'
                x(g1);
                break;

            case 121: // 'y'
                y(g1);
                break;

            case 122: // 'z'
                z(g1);
                break;

            case 124: // '|'
                bs(g1);
                break;

            case 162: 
                Cs(g1);
                break;

            case 165: 
                TI8(g1);
                break;

            case 168: 
                TB2(g1);
                break;

            case 169: 
                cs(g1);
                break;

            case 170: 
                ks(g1);
                break;

            case 172: 
                Bs(g1);
                break;

            case 173: 
                Ks(g1);
                break;

            case 174: 
                rs(g1);
                break;

            case 180: 
                TB1(g1);
                break;

            case 181: 
                ms(g1);
                break;

            case 184: 
                gs(g1);
                break;

            case 190: 
                TN8(g1);
                break;

            case 192: 
                TN8(g1);
                break;

            case 193: 
                gh(g1);
                break;

            case 195: 
                js(g1);
                break;

            case 196: 
                Qs(g1);
                break;

            case 198: 
                Zs(g1);
                break;

            case 200: 
                vs(g1);
                break;

            case 201: 
                FE(g1);
                break;

            case 202: 
                bs(g1);
                break;

            case 203: 
                Bs(g1);
                break;

            case 207: 
                Xs(g1);
                break;

            case 208: 
                Ds(g1);
                break;

            case 209: 
                Ns(g1);
                break;

            case 211: 
                Fo(g1);
                break;

            case 214: 
                B1(g1);
                break;

            case 216: 
                hs(g1);
                break;

            case 217: 
                v(g1);
                TB2(g1);
                break;

            case 218: 
                U1(g1);
                break;

            case 220: 
                Y1(g1);
                break;

            case 222: 
                Ts(g1);
                break;

            case 223: 
                Fb(g1);
                break;

            case 225: 
                gs(g1);
                break;

            case 228: 
                qs(g1);
                break;

            case 230: 
                fs(g1);
                break;

            case 233: 
                E9(g1);
                break;

            case 240: 
                ps(g1);
                break;

            case 241: 
                ns(g1);
                break;

            case 243: 
                Fu(g1);
                break;

            case 246: 
                ps(g1);
                break;

            case 248: 
                ls(g1);
                break;

            case 250: 
                u1(g1);
                break;

            case 252: 
                ys(g1);
                break;

            case 254: 
                ds(g1);
                break;

            case 8218: 
                Ns(g1);
                break;

            case 8226: 
                gs(g1);
                break;
            }
        }

    }

    public int Pwidth;
    public int Pheight;
    String strContent;
    String strWord;
    int x;
    int y;
    int c;
    int d;
    int a;
    int b;
    int i;
    int h;
    int arow;
}