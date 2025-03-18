
public class Staff extends Karyawan {
    
    String jabatan;

    public Staff(int id, String nama, int gaji, int bonus) {
        super(id, nama, gaji, bonus);
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    @Override
    public void updateJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
    
    @Override
    public void updateGaji(int gaji) {
        super.gaji = gaji;
    }
    
    @Override
    public void updateBonus(int bonus) {
        super.bonus = bonus;
    }
    
}
