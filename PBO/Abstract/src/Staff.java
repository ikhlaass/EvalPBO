public class Staff extends Karyawan {
    private String jabatan;

    public Staff(int id, String nama, int gaji, int bonus) {
        super(id, nama, gaji, bonus);
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    @Override
    public void updateJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public void updateGaji(int gaji) {
        this.gaji = gaji;
    }

    @Override
    public void updateBonus(int bonus) {
        this.bonus = bonus;
    }
    
}
