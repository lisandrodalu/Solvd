public class Medicine {
    private String brandName;
    private String drugName;
    private int miligrams;

    public Medicine() {
    }

    public Medicine(String brandName, String drugName, int miligrams) {
        this.brandName = brandName;
        this.drugName = drugName;
        this.miligrams = miligrams;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getMiligrams() {
        return miligrams;
    }

    public void setMiligrams(int miligrams) {
        this.miligrams = miligrams;
    }
}
