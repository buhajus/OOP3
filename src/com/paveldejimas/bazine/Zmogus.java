package com.paveldejimas.bazine;

interface Zmogus {
    void  setLytis(String lytis);

    String getLytis();

    String getAsmensKodas();

    String getVardas();
    void setVardas(String vardas);

    String getPavarde();

    void setPavarde(String pavarde);

    String getPlaukuSpalva();

    void setPlaukuSpalva(String plaukuSpalva);

    int getAmzius();

    double getSvoris();

    void setSvoris(double svoris);

    void setKmi(double kmi);
    double getKmi();


    double getUgis();
    void setUgis(double ugis);
}