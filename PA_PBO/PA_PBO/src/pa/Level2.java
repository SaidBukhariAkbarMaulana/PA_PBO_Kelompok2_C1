package pa;

public class Level2 extends Level1{
    @Override
    public void notif(){
        System.out.println("|\tPembelian Berhasil!");
    }
    
    @Override
     public void CheckOut(){
        System.out.println("\n|\tTerima kasih atas pembelian Anda :)");
    }
     
    public static void pengiriman(){
        System.out.println("\nKetentuan Pengambilan Barang: ");
        System.out.println("1. Ongkos kirim akan ditanggung oleh pembeli dan akan dihitung berdasarkan lokasi pengiriman, ukuran, dan berat barang yang dibeli.");
        System.out.println("2. Tidak bertanggung jawab atas kerusakan atau kehilangan produk yang terjadi selama pengiriman oleh pihak ekspedisi.");
        System.out.println("3. Waktu pengiriman dapat bervariasi tergantung pada lokasi pengiriman dan jenis layanan pengiriman yang dipilih oleh pembeli.");
    }
 
}