// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:36:59
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DY.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            font, khmermart

public class DY
{

    public DY(String s)
    {
        StrY = new String("KMSGAMESJDO\264C\355HelgkMsan\3761YAM!2dML\332gCVa1YANK!2karkRn\376ak\264mYyv\345b !4kRn\376ak\2641YANKEE!9GaemrIkaMg1YAP!3RBus edaykUnEq,1YARD!2Z\370a s\361ab\264es\265A\307 z\370aes\265A1YARDSTICK!2Em\250RtGg\264eK\370sRbEvg1YARN!2ecs ExS Gem|aH \337ELnr\351vehIy er]gRbDiteLIg1YAWN!2kars\341ab !3s\341ab1YEAR!2v&y Gayu1YEARLING!2kUnstVEdlmanGayumYyq\361aMehIy1YEARLY!5RbcaMqaM !6mYyq\361aMm\376g1YEARN!3cg\264:nx\370aMg1YEAST!2em\307 dMEb\307 pSitdMEb1YELL!3ERsk !2sERmk sUrERsk1YELLOW!5kMsak RKunel]g el]g !2BN(el]g1YELP!2sUrdUcEq,RBus rUbiyvt\346\372CBun!3bnW\370sUrdUcEq,RBus1YEOMAN!2TahaneCIgTwks&ki\376tUc1YES!2Bak\374sRmab\264Ez\370gnUvkaryl\264Rsb k\361\372gkaresI\361mmtiGIVmYy1YESTERDAY!6BImSilmij !2mSil\351m\3411YET!6kMuGaleTA mYy\351z\341eT[t !8enAEt1YIELD!3bn\336n\264eTAtam opl!2pl Tin\361pl !4o RbKl\264o1YOGA!2eyaK1YOGI!2eyaKI1YOKE!2mYynwm !4TwmeKa RkbI1YOLK!2bItCati 0Catiel]g\351ns)ut01YONDER!5enA\311nay1YOU!9\311g G\361k1YOUNG!5ek\265g zI\265 !2kUn1YOUNGSTER!2mnusSek\265g1YOUR!9rbs\264elak G\361k1YOURS!9rbs\264elak G\361k1YOURSELF!9x\370\334n\311g edayx\370\334n\311g1YOUTH!2ek\265gRbus yuvCn yuvnarI yuvPaB1YOUTHFUL!5dUcek\265g \351nyuvPaB1");
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
        int i = StrY.indexOf("1" + strWord + "!") + strWord.length() + 1;
        String s1 = StrY.substring(i, StrY.indexOf("1", i));
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
    String StrY;
}