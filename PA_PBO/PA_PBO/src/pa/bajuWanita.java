package pa;

public class bajuWanita extends Penjualan{
    private String Kategori = "Wanita";
    private String Type;
    private String Ukuran;
    private int Harga;
    
   
    
    public bajuWanita(String Id, String Nama, String Type, String Ukuran, int Harga){
        super(Id, Nama);
        this.Type   = Type;
        this.Ukuran   = Ukuran;
        this.Harga   = Harga; 
    }
    

    public String getType() {
        return Type;
    }

    
    public void setType(String Type) {
        this.Type = Type;
    }

    
    public String getUkuran() {
        return Ukuran;
    }

    
    public void setUkuran(String Ukuran) {
        this.Ukuran = Ukuran;
    }
    
    public int getHarga() {
        return Harga;
    }

    
    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public String getKategori(){
        return Kategori;
    }
    
    @Override
    public void tampil() {
        System.out.println("| Id            : " + getId());
        System.out.println("| Kategori      : " + getKategori());
        System.out.println("| Nama          : " + getNama());
        System.out.println("| Type          : " + getType());
        System.out.println("| Ukuran        : " + getUkuran());
        System.out.println("| Harga         : Rp. " + getHarga());
        System.out.println("=============================================");
    }
    
    // overloading
    public void Add(String Nama, int Harga){
        System.out.println("\n|  Data produk dengan baju " + getNama()+ " Dengan");
        System.out.println("|  Harga Rp." + getHarga() + " Berhasil Ditambahkan");
    }
  
    public static void pengiriman(){
        System.out.println("\nSyarat Pengambilan Barang: ");
        System.out.println("1. Batas Waktu Pengambilan Barang Maks 5 Hari");
        System.out.println("2. Tidak Menerima Pengembalian Barang Berdasarkan Kesalahan Pelanggan");
    }
     
}
