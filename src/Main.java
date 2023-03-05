import com.paveldejimas.bazine.ZmogusImpl;

public class Main {
    public static void main(String[] args) {

        ZmogusImpl zm = new ZmogusImpl();

        zm.spausdintiMasyva(zm.sarasasZmones());

        System.out.println();

        zm.gautiPlanukuSpalva();

        System.out.println();

        System.out.println("Sukeičiame sunkiausio žmogaus svorį : " + zm.rastiDidziausiSvori()+ " ir lengviausio žmogaus svorį : "+ zm.rastiMaziausiaSvori()+" vietomis \n");

        zm.spausdintiMasyva(zm.sukeistiMaxMin(zm.sarasasZmones(),  zm.rastiDiziausioSvorioIndeksa(),  zm.rastiMaziausioSvorioIndeksa()));

    }
}
