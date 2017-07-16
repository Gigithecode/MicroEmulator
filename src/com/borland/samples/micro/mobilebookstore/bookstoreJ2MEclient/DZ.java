// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:36:59
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DZ.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            font, khmermart

public class DZ
{

    public DZ(String s)
    {
        StrZ = new String("KMSGAMESJDO,\334t kMEb\370g1ZEAL!2ytiPaB1ZEALOT!2mnusSEdls)b\264\337s\370\372gnwgGIVmYy1ZEALOUS!5Edls)b\264\337s\370\372gnwgGIVmYy1ZEBRA!2esHbg,g\2641ZENITH!2kMBUl1ZEPHYR!2x\374l\264lMehIy1ZERO!3tRmg\264eTA\307 dak\264ocM !2sUn\374 TeT1ZEST!2esckI\376saTr\337eRtkRtGal1ZIGZAG!4eZIVokac\264cuHkac\264eLIg\307 eZIVok\341ikk\341k\264 !5kac\264cuHkac\264eLIg \337k\341ikk\341k\264 !3kac\264cuHkac\264eLIg !2GIV> Edlkac\264cuHkac\264eLIg\337k\341ikk\341k\2641ZINC!2s&g,sI1ZIP!2elxRbcaMtMbn\264 !3eTAEP\370t\307 eTAv\345g1ZIPPER!2ExSrUt1ZIRCON!2eBRC\351z1ZODIAC!2rasIcRk1ZONE!2tMbn\264 sg,at\264!4EckCasg,at\2641ZOO!2sYnstV1ZOOLOGY!2st\376v\355T\374a1ZOOM!3e:HBYy !2sUrqabBIelI EkvBRgIkbRgYm!4qabBIelIRbpit>1");
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
        int i = StrZ.indexOf("1" + strWord + "!") + strWord.length() + 1;
        String s1 = StrZ.substring(i, StrZ.indexOf("1", i));
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
    String StrZ;
}