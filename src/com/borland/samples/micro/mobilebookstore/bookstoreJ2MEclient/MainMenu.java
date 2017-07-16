// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:37:00
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   MainMenu.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;
import javax.microedition.rms.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            Search, Register, khmermart

public class MainMenu extends Form
    implements CommandListener
{

    public MainMenu()
    {
        super("");
        intOpenGate = 0;
        Wsearch = new Search();
        reg = new Register();
        ticker1 = new Ticker("");
        imageItem1 = new ImageItem("", (Image)null, 0, "");
        stringItem1 = new StringItem("", "");
        stringItem2 = new StringItem("", "");
        stringItem3 = new StringItem("", "");
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
        imageItem1 = new ImageItem("", (Image)null, 3, "");
        imageItem1.setImage(Image.createImage("/books.png"));
        imageItem1.setLayout(3);
        setTicker(ticker1);
        ticker1.setString("Eng-Kh Dict V 1.1    Meanings over 40,800 definitions! Updated By Khmer PDA.Best Expert On Phone Development.               ");
        setCommandListener(this);
        addCommand(new Command("Continue", 4, 2));
        addCommand(new Command("Exit", 7, 1));
        append(imageItem1);
        append(stringItem1);
        append(stringItem2);
        RetriDatabase();
        stringItem1.setText("     Updated By: Khmer PDA              ");
        stringItem1.setPreferredSize(200, 30);
        stringItem1.setFont(Font.getFont(0));
        stringItem2.setPreferredSize(200, 30);
        stringItem2.setFont(Font.getFont(0));
    }

    public void RetriDatabase() {
        try {
           database = RecordStore.openRecordStore("KMS", true);
           RecordEnumeration var1 = database.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
           String var2 = new String(var1.nextRecord());
           if(var2.substring(0, 32).equals("@f!&$71ghdfJE*^#$@fjdKH54W$05849")) {
              this.intOpenGate = 10;
           }

           this.stringItem3.setText("Registered to Mobile\'s User number " + this.EncodeURL(var2.substring(32, 41)));
           this.stringItem2.setPreferredSize(200, 30);
           this.append(this.stringItem3);
        } catch (Exception var11) {
           ;
        } finally {
           if(database != null) {
              try {
                 database.closeRecordStore();
              } catch (Exception var10) {
                 ;
              }
           }

        }

     }
    private String replace(String s, char c, String s1)
    {
        String s2 = "";
        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) != c)
                s2 = s2 + s.charAt(i);
            else
                s2 = s2 + s1;

        return s2;
    }

    private String EncodeURL(String s)
    {
        s = replace(s, 'E', "0");
        s = replace(s, '@', "1");
        s = replace(s, 'R', "2");
        s = replace(s, '%', "3");
        s = replace(s, 'Z', "4");
        s = replace(s, 'Y', "5");
        s = replace(s, '@', "6");
        s = replace(s, 'Q', "7");
        s = replace(s, 't', "8");
        s = replace(s, 'A', "9");
        return s;
    }

    public void commandAction(Command command, Displayable displayable)
    {
        switch(command.getCommandType())
        {
        case 4: // '\004'
            if(intOpenGate == 10)
                Display.getDisplay(khmermart.instance).setCurrent(Wsearch);
            if(intOpenGate == 0)
                Display.getDisplay(khmermart.instance).setCurrent(reg);
            break;

        case 7: // '\007'
            khmermart.quitApp();
            break;
        }
    }

    int intOpenGate;
    private static RecordStore database = null;
    private Search Wsearch;
    private Register reg;
    Ticker ticker1;
    ImageItem imageItem1;
    StringItem stringItem1;
    StringItem stringItem2;
    StringItem stringItem3;

}