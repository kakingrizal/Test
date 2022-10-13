public class Kendaraan {
    protected String merk;
    protected int tahun_pembuatan;    

    public Kendaraan(String merk, int tahun_pembuatan) {
        this.merk = merk;
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getTahun_pembuatan() {
        return tahun_pembuatan;
    }

    public void setTahun_pembuatan(int tahun_pembuatan) {
        this.tahun_pembuatan = tahun_pembuatan;
    }
    
    void infoKendaraan(){
        System.out.println("Merk:" + getMerk());
        System.out.println("Tahun:" + getTahun_pembuatan());
    }
}
