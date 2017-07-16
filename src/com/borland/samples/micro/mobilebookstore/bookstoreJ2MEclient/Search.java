// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:37:01
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   Search.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            DA, DB, DC, DD, 
//            DE, DF, DG, DH, 
//            DI, DJ, DK, DL, 
//            DM, DN, DO, DP, 
//            DQ, DR, DS, DT, 
//            DU, DV, DW, DX, 
//            DY, DZ

public class Search extends Form
    implements CommandListener
{

    public Search()
    {
        super("KHMER PDA ");
        bookInfo = new StringBuffer();
        txtWord = new TextField("", "", 1, 1);
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
        txtWord.setLabel("Search:");
        txtWord.setConstraints(0x100000);
        txtWord.setMaxSize(20);
        txtWord.setPreferredSize(200, 38);
        setCommandListener(this);
        addCommand(new Command("OK", 1, 1));
        append(txtWord);
    }

    public void commandAction(Command command, Displayable displayable)
    {
        if(command.getCommandType() == 1)
        {
            String s = txtWord.getString();
            s = s.toUpperCase();
            switch(s.charAt(0))
            {
            case 65: // 'A'
                new DA(s);
                s = DA.strWResults;
                break;

            case 66: // 'B'
                new DB(s);
                s = DB.strWResults;
                break;

            case 67: // 'C'
                new DC(s);
                s = DC.strWResults;
                break;

            case 68: // 'D'
                new DD(s);
                s = DD.strWResults;
                break;

            case 69: // 'E'
                new DE(s);
                s = DE.strWResults;
                break;

            case 70: // 'F'
                new DF(s);
                s = DF.strWResults;
                break;

            case 71: // 'G'
                new DG(s);
                s = DG.strWResults;
                break;

            case 72: // 'H'
                new DH(s);
                s = DH.strWResults;
                break;

            case 73: // 'I'
                new DI(s);
                s = DI.strWResults;
                break;

            case 74: // 'J'
                new DJ(s);
                s = DJ.strWResults;
                break;

            case 75: // 'K'
                new DK(s);
                s = DK.strWResults;
                break;

            case 76: // 'L'
                new DL(s);
                s = DL.strWResults;
                break;

            case 77: // 'M'
                new DM(s);
                s = DM.strWResults;
                break;

            case 78: // 'N'
                new DN(s);
                s = DN.strWResults;
                break;

            case 79: // 'O'
                new DO(s);
                s = DO.strWResults;
                break;

            case 80: // 'P'
                new DP(s);
                s = DP.strWResults;
                break;

            case 81: // 'Q'
                new DQ(s);
                s = DQ.strWResults;
                break;

            case 82: // 'R'
                new DR(s);
                s = DR.strWResults;
                break;

            case 83: // 'S'
                new DS(s);
                s = DS.strWResults;
                break;

            case 84: // 'T'
                new DT(s);
                s = DT.strWResults;
                break;

            case 85: // 'U'
                new DU(s);
                s = DU.strWResults;
                break;

            case 86: // 'V'
                new DV(s);
                s = DV.strWResults;
                break;

            case 87: // 'W'
                new DW(s);
                s = DW.strWResults;
                break;

            case 88: // 'X'
                new DX(s);
                s = DX.strWResults;
                break;

            case 89: // 'Y'
                new DY(s);
                s = DY.strWResults;
                break;

            case 90: // 'Z'
                new DZ(s);
                s = DZ.strWResults;
                break;
            }
        }
    }

    StringBuffer bookInfo;
    TextField txtWord;
}