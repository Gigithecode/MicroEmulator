// Decompiled by DJ v3.12.12.98 Copyright 2014 Atanas Neshkov  Date: 24/03/2015 19:36:58
// Home Page: http://www.neshkov.com/dj.html - Check often for new version!
// Decompiler options: packimports(3) 
// Source File Name:   DQ.java

package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient;

import javax.microedition.lcdui.*;

// Referenced classes of package com.borland.samples.micro.mobilebookstore.bookstoreJ2MEclient:
//            font, khmermart

public class DQ
{

    public DQ(String s)
    {
        StrQ = new String("KMSGAMESJDO1QUACK!2sERmkkab> !5EdlEk\370geZIVCaRKUeBT\374 !3ERskkab>1QUADRANGLE!2ctuekaN1QUADRILATERAL!5EdlmanRCug\337muxbYn!2ctur&gS1QUADRUPLE!5ctVaKuN !3eLIgmYyCabYn !4KuNnwgbYn1QUADRUPLED!5EdlmaneCIgbYn !2stVeCIgbYn ctub|aT vt\346\372bYndUcK\361a1QUADRUPLET!2kUneP\370aHbYn kUnbYnnak\264ekItenAeBlCamYyK\361a1QUAGMIRE!2Pk\264eRCA1QUAIL!3Gs\264km\370aMgcit\376 !2RkYc 0stV01QUAINT!5cas\264hYssm&yehIyEb\370k1QUAKE!2rJ\242\334y !3jab\264j&r!2rJ\242\334ydI EpndI karj&r1QUALIFICATION!2PaBmanlk\241N;CacaM:c\264 PaBmansiTi\306TTYl1QUALIFIED!5EdlmanKuNviD\277iRKb\264RKan\2641QUALIFY!2manlk\241N;CacM:c\264 !4eZIVomanKuNsm|ti\376RKb\264RKan\264 kMNt\264RBMEdn1QUALITATIVE!5\351nKuNPaB\337lk\241N;1QUALITY!5Zunl\301 !2KuNPaB1QUALM!2karrkcg\264k\301\334t1QUANDARY!2PaBGl\264EGk1QUANTITATIVE!50\351n0brimaN1QUANTITY!2cMnYn brimaN1QUARANTINE!2kardak\264oenAdac\264BIeK !4dak\264oenAdac\264BIeK1QUARREL!3eQ\370aH yl\264Tas\264!2K\265anyl\264Tas\264 Cem\370aH PN\320n;1QUARRELSOME!5\351hRbeQ\370aH1QUARRY!2GIV>EdleKtamrk stVEdleKbr:j\264 !4Kas\264ykz\2651QUART!2kVat CargVal\2641QUARTER!4BuHCabYn !2sg,at\264 mYyPaKbYn mYynaTI1QUARTERLY!5ecjral\264bIEx !6ral\264bIEx1QUARTET!3GIV>EdlmanbYn !2GIV>EdlmanbYn1QUARTZ!2kVatS\276 silam\374\250agrwg1QUASH!4kMeTc bMp\370aj bdiesZ1QUATRAIN!2bTkaB\374EdlmanbYn:T1QUAVER!3j&r!2sUrj&r!4eZIVoj&r1QUAY!2Epk:\250l\2641QUEASY!5Edlrkcg\264Etk\301\334t1QUEEN!2RBHmhakSRtiyanI1QUEER!4eZIVoxUc !5q,\334t Eb\370k!2mnusSRbtiB&T\306nwgmnusSePTdUcK\361a1QUELL!4bRg,ab BRgab bM:t\2641QUENCH!4Bn\370t\264 eZIVo:t\2641QUERULOUS!5rG)UrTaM1QUERY!3sYrsMNYr !2sMNYr !4sYrsMNYr1QUEST!2karEsVgrk !4EsVgrk1QUESTION!2sMNYr !4sYr saksYr minyl\264Rsbnwg CMTas\2641QUESTIONABLE!5KYrosgS&y1QUESTIONAIRE!2bJ\242IsMNYr1QUEUE!2CYrmnusSQrbn\376>K\361a !3Qrbn\376bn\336\372yK\361a1QUIBBLE!3CYjer]g !2karCYjer]g1QUICK!5rh&s qab\264xwg1QUICKEN!3maneLIgvij jab\264eLIg!4eZIVojab\264eLIg1QUICKSAND!2xSac\264pug1QUIET!5es\341{ms\341at\264 EdlminsUvmat\264k!4eZIVoes\341{m1QUIETUDE!2esckI\376s\341b\2641QUIETUS!2karbJ\251b\264Elgoman1QUILL!2kaM \351nstVkaMRbma dg:\250kaeZIVBIs\370abstV s\370ab1QUILT!4jat\264sMLI1QUININE!2KInIn1QUINTESSENCE!2x\370wmsar PaKRbesIrbMput GK<sar1QUINTUPLET!2vt\346\372R:MdUcK\361a !2kUneP\370aHR:M kUnR:Mnak\264ekItenAeBlCamYyK\361a1QUIP!3niyaykMEb\370gy\250agmut !2Bak\374kMEb\370gy\250agmut1QUIRK!2GniytPaB lk\241N;cEm\370k1QUIT!5bM:t\264ecal!3lHbg\264 e:Hbg\264 !4ecjBI1QUITCLAIM!2karep\336rsiTi\306 sMbuRtep\336rsiTi\306 !4ep\336rsiTi\3061QUITE!6x\370aMg Z\341n Nas\2641QUITTANCE!2bg,an\264\351dseRmc karrYc sMNg1QUIVER!2karj&r !4jak\264 !3j&r1QUIXOTIC!5EdlmanKMnitrevIrvay1QUIZ!2cMeNaTsYr !4ecaTsYr1QUIZZICAL!5dUceKq\341l\2641QUORUM!2cMnYncaM:c\264edIm|IebIkGg<RbCMu1QUOTA!2cMnYnkRmit\307 bmaNPaK1QUOTE!2sRmag\264ecjBIRbPBNamYy !4Rsg\264Bak\374BIRbPBNamYy1QUOTIENT!2plEck1");
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
        int i = StrQ.indexOf("1" + strWord + "!") + strWord.length() + 1;
        String s1 = StrQ.substring(i, StrQ.indexOf("1", i));
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
    String StrQ;
}