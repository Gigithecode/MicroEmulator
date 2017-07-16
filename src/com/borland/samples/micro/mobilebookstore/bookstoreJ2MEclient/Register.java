// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:37:01
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Register.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;
import javax.microedition.rms.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            khmermart

public class Register extends Form
{

    public Register()
    {
        super("Register");
        stringItem1 = new StringItem("", "");
        textField1 = new TextField("", "", 10, 0);
        textField2 = new TextField("", "", 6, 0);
        textField3 = new TextField("", "", 6, 0);
        stringItem2 = new StringItem("", "");
        setCommandListener(new CommandListener() {

            public void commandAction(Command command, Displayable displayable)
            {
                this_commandPerformed(command, displayable);
            }

        }
);
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
        long l = System.currentTimeMillis() / 8640L;
        long l1 = System.currentTimeMillis() / 5030L;
        String s = "";
        String s1 = "";
        String s2 = "";
        s = "" + l;
        s = s.substring(5, 8);
        s1 = "" + l1;
        s1 = s1.substring(6, 8);
        s2 = s + s1 + s.substring(1, 2);
        append(stringItem2);
        append(textField1);
        append(textField2);
        append(textField3);
        append(stringItem1);
        addCommand(new Command("OK ", 4, 0));
        addCommand(new Command("Show", 3, 1));
        addCommand(new Command("Exit", 7, 2));
        stringItem1.setFont(Font.getFont(32, 1, 0));
        textField1.setLabel("User : ");
        textField2.setLabel("SN : ");
        textField2.setLabel("CLE : ");
        l = (Long.parseLong(s2) * 13L) / 50L + 121L;
        s2 = "" + l;
        IMEIcode = "" + l;
        if(s2.length() <= 5)
            IMEIcode = "0" + l;
        stringItem2.setText(IMEIcode);
        l *= 20L;
        l /= 40L;
        l += 199L;
        IMEIcode = "" + l;
        if(IMEIcode.length() == 6)
            IMEIcode = "" + l;
        if(IMEIcode.length() == 5)
            IMEIcode = "0" + l;
        if(IMEIcode.length() == 4)
            IMEIcode = "00" + l;
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
        s = replace(s, '0', "E");
        s = replace(s, '1', "@");
        s = replace(s, '2', "R");
        s = replace(s, '3', "%");
        s = replace(s, '4', "Z");
        s = replace(s, '5', "Y");
        s = replace(s, '6', "@");
        s = replace(s, '7', "Q");
        s = replace(s, '8', "t");
        s = replace(s, '9', "A");
        return s;
    }

    public void where() {
        RecordStore var1 = null;
        String var2 = "@f!&$71ghdfJE*^#$@fjdKH54W$05849" + this.EncodeURL(this.textField1.getString()) + "@w#d@t#%d@09";
        String var3 = this.textField2.getString().substring(0, 4);

        try {
           this.textField3.setString(this.IMEIcode.substring(0, 4));
           this.stringItem2.setText("Wrong key");
           if(var3.equals(this.IMEIcode.substring(0, 4))) {
              RecordStore.deleteRecordStore("KMS");
              var1 = RecordStore.openRecordStore("KMS", true);
              var1.addRecord(var2.getBytes(), 0, var2.getBytes().length);
              this.stringItem1.setText("Account is added");
              this.append(this.stringItem1);
           }
        } catch (Exception var13) {
           ;
        } finally {
           if(var1 != null) {
              try {
                 var1.closeRecordStore();
              } catch (Exception var12) {
                 ;
              }
           }

        }

     }

    public void this_commandPerformed(Command var1, Displayable var2) {
        RecordStore var3 = null;
        switch(var1.getCommandType()) {
        case 3:
           try {
              var3 = RecordStore.openRecordStore("KMS", true);
              RecordEnumeration var4 = var3.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
              new String(var4.nextRecord());
              this.stringItem1.setText("****************");
              this.append(this.stringItem1);
           } catch (Exception var5) {
              ;
           }
           break;
        case 4:
           this.where();
        case 5:
        case 6:
        default:
           break;
        case 7:
           khmermart.quitApp();
        }

     }
  
    StringItem stringItem1;
    String IMEIcode;
    public String Rstring;
    TextField textField1;
    TextField textField2;
    TextField textField3;
    StringItem stringItem2;
}