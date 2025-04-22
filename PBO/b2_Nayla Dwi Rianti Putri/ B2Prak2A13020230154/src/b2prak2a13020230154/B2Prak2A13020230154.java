package b2prak2a13020230154;

/**
 
 
 */
public class B2Prak2A13020230154 {
        int[][] dataPenjualan = {
            {10,20,30},
            {15,25,35},
            {20,30,40},
            {25,35,45},
            {30,40,50},
            {35,45,55},
            {40,50,60}, 
        };
        
        public int [] hitungTotalPenjualanPerJenisBaju() {
            int [] totalPenjualanPerJenisBaju = new int[dataPenjualan[0].length];
            for(int i = 0; i <  dataPenjualan.length; i++) {
                    for (int j = 0; j < dataPenjualan[i].length; j++) {
                        totalPenjualanPerJenisBaju[j] += dataPenjualan[i][j];
                    }  
            }
            return totalPenjualanPerJenisBaju;
        }
        public int hitungTotalPenjualanSelamaSatuMinggu(){
            int[] totalPenjualanPerjenisBaju = hitungTotalPenjualanPerJenisBaju();
            int totalPenjualan = 0;
            for (int i = 0; i < totalPenjualanPerjenisBaju.length; i++) {
                totalPenjualan += totalPenjualanPerjenisBaju[i];
            }
            return totalPenjualan;
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        B2Prak2A13020230154 penjualanBaju = new B2Prak2A13020230154();
        int[] totalPenjualanPerjenisBaju = penjualanBaju.hitungTotalPenjualanPerJenisBaju();
        int totalPenjualan = penjualanBaju.hitungTotalPenjualanSelamaSatuMinggu();
        
        System.out.println("Total Penjualan baju jenis A:" + totalPenjualanPerjenisBaju[0]);
        System.out.println("Total Penjualan baju jenis B:" + totalPenjualanPerjenisBaju[1]);
        System.out.println("Total Penjualan baju jenis C:" + totalPenjualanPerjenisBaju[2]);
        System.out.println("Total Penjualan selama satu minggu:" + penjualanBaju.hitungTotalPenjualanSelamaSatuMinggu());
             // TODO code application logic here
    }
    
}
