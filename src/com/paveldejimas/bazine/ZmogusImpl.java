package com.paveldejimas.bazine;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ZmogusImpl implements Zmogus {

    NumberFormat numberFormat = new DecimalFormat("0.00");

    private String lytis;
    private String asmensKodas;
    private String vardas;
    private String pavarde;
    private String plaukuSpalva;
    private int amzius;
    private double svoris;
    private double ugis;
    private double kmi;

    /**
     * Sukuriamas objekto masyvas
     *
     * @return Grąžinami masyvo objektai
     */
    public ZmogusImpl[] sarasasZmones() {
        ZmogusImpl zm1 = new ZmogusImpl("vyras", "3863251254", "Tomas", "Katinas", "juoda", 36, 75, 1.85);
        ZmogusImpl zm2 = new ZmogusImpl("moteris", "3863251254", "Laima", "Andrikiene", "ruda", 66, 75, 1.65);
        ZmogusImpl zm3 = new ZmogusImpl("vyras", "3863251254", "Jurgis", "Jurgelis", "juoda", 53, 95, 1.83);
        ZmogusImpl zm4 = new ZmogusImpl("vyras", "3863251254", "Antanas", "Prusas", "pilka", 15, 50, 1.55);
        ZmogusImpl zm5 = new ZmogusImpl("moteris", "3863251254", "Ieva", "Kalina", "juoda", 36, 45, 1.65);
        ZmogusImpl zm6 = new ZmogusImpl("vyras", "3863251254", "Rimas", "Vasiliauskas", "ruda", 42, 100, 1.85);
        ZmogusImpl[] zmones = {zm1, zm2, zm3, zm4, zm5, zm6};

        return zmones;
    }

    public void setLytis(String lytis) {
        this.lytis = lytis;
    }

    public String getLytis() {
        return lytis;
    }

    public String getAsmensKodas() {
        return asmensKodas;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public String getPlaukuSpalva() {
        return plaukuSpalva;
    }

    public void setPlaukuSpalva(String plaukuSpalva) {
        this.plaukuSpalva = plaukuSpalva;
    }

    public int getAmzius() {
        return amzius;
    }

    public double getSvoris() {
        return svoris;
    }

    public void setSvoris(double svoris) {
        this.svoris = svoris;
    }

    public double getUgis() {
        return ugis;
    }

    public void setUgis(double ugis) {
        this.ugis = ugis;
    }

    @Override
    public double getKmi() {
        return kmi;
    }

    @Override
    public void setKmi(double kmi) {
        this.kmi = kmi;
    }

    @Override
    public String toString() {
        return "Zmogus{" +
                "lytis='" + lytis + '\'' +
                ", asmensKodas='" + asmensKodas + '\'' +
                ", vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", plaukuSpalva='" + plaukuSpalva + '\'' +
                ", amzius=" + amzius +
                ", svoris=" + svoris +
                ", ugis=" + ugis +
                ", KMI=" + numberFormat.format(svoris / (ugis * ugis)) +
                ", KMI2=" + numberFormat.format(skaiciuotiKmi()) +
                '}';
    }

    /**
     * Sukuriamas konstruktorius su parametrais
     *
     * @param lytis
     * @param asmensKodas
     * @param vardas
     * @param pavarde
     * @param plaukuSpalva
     * @param amzius
     * @param svoris
     * @param ugis
     */
    public ZmogusImpl(String lytis, String asmensKodas, String vardas, String pavarde, String plaukuSpalva, int amzius, double svoris, double ugis) {
        this.lytis = lytis;
        this.asmensKodas = asmensKodas;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.plaukuSpalva = plaukuSpalva;
        this.amzius = amzius;
        this.svoris = svoris;
        this.ugis = ugis;
    }

    /**
     * Sukuriamas konstruktorius be parametrų
     */
    public ZmogusImpl() {

    }

    /**
     * Metodas skaiciuoja KMI
     *
     * @return Grąžinamas rezultatas
     */
    public double skaiciuotiKmi() {
        kmi = getSvoris() / (getUgis() * getUgis());

        return kmi;
    }

    /**
     * Metodas išrenka žmones, kurių plaukų spalva juoda.
     */
    public void gautiPlanukuSpalva() {
        for (ZmogusImpl zm : sarasasZmones()) {
            if (zm.getPlaukuSpalva().equals("juoda")) {
                System.out.println("Juodus plaukus turi: " + zm.getVardas());
            }
        }
    }

    /**
     * Metodas randa dižiausio svorio indeksą
     *
     * @return Grąžinamas indekso numeris masyve
     */
    public int rastiDiziausioSvorioIndeksa() {
        double maxSvoris = -9999;
        int pozicija = 0;

        for (int i = 0; i < sarasasZmones().length; i++) {
            if (sarasasZmones()[i].getSvoris() > maxSvoris) {
                maxSvoris = sarasasZmones()[i].getSvoris();
                pozicija = i;
            }
        }

        return pozicija;
    }

    /**
     * Metodas randa mažiausio svorio indeksą
     *
     * @return Grąžinamas indekso numeris masyve
     */
    public int rastiMaziausioSvorioIndeksa() {
        double minSvoris = 999;
        int pozicija = 0;

        for (int i = 0; i < sarasasZmones().length; i++) {
            if (sarasasZmones()[i].getSvoris() < minSvoris) {
                minSvoris = sarasasZmones()[i].getSvoris();
                pozicija = i;
            }
        }

        return pozicija;
    }

    /**
     * Metodas randa dižiausią svorį
     *
     * @return Grąžinamas didžiausias svoris masyve
     */
    public double rastiDidziausiSvori() {
        double maxSvoris = -9999;

        for (int i = 0; i < sarasasZmones().length; i++) {
            if (sarasasZmones()[i].getSvoris() > maxSvoris) {
                maxSvoris = sarasasZmones()[i].getSvoris();
            }
        }

        return maxSvoris;
    }

    /**
     * Metodas randa mažiausią svorį
     *
     * @return Grąžinamas mažiausias svoris masyve
     */
    public double rastiMaziausiaSvori() {
        double minSvoris = 999;

        for (int i = 0; i < sarasasZmones().length; i++) {
            if (sarasasZmones()[i].getSvoris() < minSvoris) {
                minSvoris = sarasasZmones()[i].getSvoris();
            }
        }

        return minSvoris;
    }

    /**
     * Metodas atvaizduoja visus svorius
     */
    public void svorioSarasas() {

        for (ZmogusImpl zm : sarasasZmones()) {
            System.out.print(zm.getSvoris() + ", ");
        }
    }

    /**
     * Metodas spausdina masyvą
     *
     * @param masyvas nurodomas masyvas
     */
    public void spausdintiMasyva(ZmogusImpl masyvas[]) {
        for (int i = 0; i < masyvas.length; i++) {
            System.out.println(masyvas[i] + ",");
        }
    }

    /**
     * Metodas sukuria naują masyvą su sukeistais svoriais: dižiausias su mažiausiu
     *
     * @param array Nurodomas masyvas
     * @param max   Nurodomas didžiausio svorio indesas masyve
     * @param min   Nurodomas mažiausio svorio indesas masyve
     * @return Grąžinamas naujas masyvas su sukeistais svoriais
     */
    public ZmogusImpl[] sukeistiMaxMin(ZmogusImpl[] array, int max, int min) {
        ZmogusImpl masyvas[] = new ZmogusImpl[sarasasZmones().length];

        for (int i = 0; i < sarasasZmones().length; i++) {
            masyvas[i] = array[i];
        }

        ZmogusImpl temp = masyvas[max];
        masyvas[max] = masyvas[min];
        masyvas[min] = temp;

        return masyvas;
    }
}