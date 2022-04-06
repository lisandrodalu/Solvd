package com.solvd.enums;

public enum Medicine {
    ANALGESIC("Morphine",5),
    ANESTESIA("Valium",2),
    ANTIBIOTIC("Neosporin",2),
    ANTICOAGULANT("Heparin",5);

        private final String drug;
        private final int miligrans;
     Medicine(String drug,int miligrams){
        this.drug=drug;
        this.miligrans=miligrams;
    }
    public String getDrugdrug(){return this.drug;}
    public int getMiligrans(){return this.miligrans;}
}
