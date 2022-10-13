public class KendaraanBermotor extends Kendaraan {    
    int cc;

    public KendaraanBermotor(String merk, int tahun){
        super(merk, tahun);
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    
    public void infoKendaraan(){
        super.infoKendaraan();
        System.out.println("CC:" + getCc());
    }
    
    public static void main(String[] args) {
        KendaraanBermotor motorku = new KendaraanBermotor("Vario",2022);
        motorku.setCc(150);
        motorku.infoKendaraan();
    }
}
