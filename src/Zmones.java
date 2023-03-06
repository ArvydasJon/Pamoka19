
import com.paveldejimas.bazine.ZmogusImpl;
import com.paveldejimas.isvestine.StatybininkasImpl;
import java.io.*;
import java.util.*;
public class Zmones {
    public static void main(String[] args) {
        System.out.println("Statybininko objektas:");
//        konstruojamsa vaiko klasės objektas turime perduoti tiek tėvo tiek vaiko klasės parametrus
        StatybininkasImpl statyb1 = new StatybininkasImpl("Vyr",398122301234L,"Antanas","Antanaitis",25,78,1.74,"Žalia", 15,"VGTU","Betuonuotojas",2500);
        StatybininkasImpl statyb2 = new StatybininkasImpl("Vyr",398122301234L,"Antanas","Antanaitis",25,78,1.74,"Žalia", 15,"VGTU","Betuonuotojas",3500);
        StatybininkasImpl statyb3 = new StatybininkasImpl("Vyr",398122301234L,"Antanas","Antanaitis",25,78,1.74,"Žalia", 15,"VGTU","Betuonuotojas",4500);
        
      //  System.out.println(statyb1);
        ZmogusImpl zmogusImpl = new ZmogusImpl("Vyr", 398122301234L, "Antanas", "Antanaitis", 25, 78, 1.74, "Žalia");
        ZmogusImpl zmogusImpl1 = new ZmogusImpl("Mot", 49902038967L, "Lapė", "Snapė", 24, 56, 1.60, "Ruda");
        ZmogusImpl zmogusImpl2 = new ZmogusImpl("Vyr", 393122301234L, "Petras", "Petraitis", 30, 78, 1.74, "Geltona");
        //System.out.println("\n");

       /* System.out.println(zmogusImpl.isVyr() + "   " + zmogusImpl.getAsmensKodas() + "   " + zmogusImpl.getVardas() + " " + zmogusImpl.getPavarde() + "  " + zmogusImpl.getAmzius() + "  " +
                zmogusImpl.getSvoris() + "  " + zmogusImpl.getUgis() + "  " + zmogusImpl.getPlaukuSpalva());
        zmogusImpl.setPlaukuSpalva("Mėlina");
        System.out.println(zmogusImpl.isVyr() + "   " + zmogusImpl.getAsmensKodas() + "   " + zmogusImpl.getVardas() + " " + zmogusImpl.getPavarde() + "  " + zmogusImpl.getAmzius() + "  " +
                zmogusImpl.getSvoris() + "  " + zmogusImpl.getUgis() + "  " + zmogusImpl.getPlaukuSpalva());
        System.out.println("\n");  */

        ZmogusImpl[] zmones = {zmogusImpl,zmogusImpl1,zmogusImpl2,statyb1,statyb2,statyb3};
        for (ZmogusImpl zmogus: zmones) {
        //    System.out.println(zmogus);
        }

        System.out.println(Arrays.toString(zmones)+"\n");  // varo  į vieną liniją
       Arrays.stream(zmones).forEach(System.out::println);
       // System.out.println(Arrays.deepToString(zmones));

        double alga=0;
        for(ZmogusImpl zmogus: zmones){
            if(zmogus instanceof StatybininkasImpl){
                StatybininkasImpl statybininkas = (StatybininkasImpl) zmogus;
                alga= alga +statybininkas.getAtlyginimas();
            }
        }
        System.out.println("\n"+alga);
    /*    System.out.println("\n");
        System.out.println(zmogusImpl1);
        zmogusImpl1.setLytis("Vyr");
        System.out.println(zmogusImpl1); */

    }
    }

