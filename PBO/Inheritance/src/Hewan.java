public class Hewan {
    String nama;
    String suara;

    public Hewan(String nama, String suara) {
        this.nama = nama;
        this.suara = suara;
    }

    public void display() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Suara Hewan : " + suara);
    }
}

