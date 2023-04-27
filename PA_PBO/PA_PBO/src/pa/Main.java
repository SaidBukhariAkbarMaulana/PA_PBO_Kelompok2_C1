package pa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    static ArrayList<bajuPria> dataPria     = new ArrayList<>();
    static ArrayList<bajuWanita> dataWanita = new ArrayList<>();
    static ArrayList<String> riwayatTransaksi = new ArrayList<>();
    static Level2 notif = new Level2();
    static Implementasi impl = new Implementasi();
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
   
    public static void main(String[] args) throws NumberFormatException, IOException{
        while(true){
            System.out.println("\n=============================================");
            System.out.println("|                   Menu                    |");
            System.out.println("=============================================");
            System.out.println("| 1. Admin                                  |");
            System.out.println("| 2. Login                                  |");
            System.out.println("| 3. Registrasi                             |");
            System.out.println("| 0. Exit                                   |");
            System.out.println("=============================================");
            System.out.print("| Masukkan pilihan (0-3): ");
            try{
                int pill = Integer.parseInt(input.readLine());
                switch (pill) {
                    case 1:
                        MenuAdmin();
                        break;
                    case 2:
                        login();
                        break;
                    case 3 :
                        register();
                        froze();
                        break;
                    case 0:
                        System.exit(0);
                    default:
                        System.out.println("Pilihan 0-3, silakan coba lagi.");
                        break;
                    }
                }catch(NumberFormatException  e){
                System.out.println("\nInput yang Anda masukkan Harus Angka! Silahkan coba lagi.");
                froze();
                }
            System.out.println("=============================================\n");
            } 
        }
    
    public static void froze() throws IOException {
        System.out.print("Tekan enter untuk melanjutkan... ");
        input.readLine();
        System.out.println("");
    }
    
    public static void MenuUsers() throws IOException{
        while (true){
            System.out.println("\n=============================================");
            System.out.println("|        Welcome to Acil Thrift Store       |");
            System.out.println("=============================================");
            System.out.println("| 1. Daftar Produk                          |");
            System.out.println("| 2. Beli Produk                            |");
            System.out.println("| 0. Exit                                   |");
            System.out.println("=============================================");
            System.out.print("| Masukkan pilihan (0-2): ");
            int pilihan = Integer.parseInt(input.readLine());
            System.out.println("=============================================\n");

            switch(pilihan){
                    case 1:
                        System.out.println("=============================================");
                        System.out.println("|                Semua Jenis                 |");
                        System.out.println("=============================================");
                        System.out.println("| 1. Baju Pria                              |");
                        System.out.println("| 2. Baju Wanita                            |");
                        System.out.println("=============================================");
                        System.out.print("Masukan pilihan (1-2) : ");
                        pilihan = Integer.parseInt(input.readLine());
                        System.out.println("=============================================");

                        if (pilihan == 1) {
                            TampilPria();
                            froze();
                            break;
                            } 
                         if (pilihan == 2) {
                            TampilWanita();
                            froze();
                            break;
                            } 
                        else {
                            System.out.println(" Pilihan 1-2 !!!");
                            }
                         break;
                    case 2:
                        System.out.println("=============================================");
                        System.out.println("|                Semua Menu                 |");
                        System.out.println("=============================================");
                        System.out.println("| 1. Baju Pria                              |");
                        System.out.println("| 2. Baju Wanita                            |");
                        System.out.println("=============================================");
                        System.out.print("Masukan pilihan (1-2) : ");
                        pilihan = Integer.parseInt(input.readLine());
                        System.out.println("=============================================");
                        if (pilihan == 1) {
                            beliBajuPria();
                            froze();
                            break;
                        }
                        if (pilihan == 2) {
                             beliBajuWanita();
                             froze();
                             break;
                         } 
                         else {
                             System.out.println(" Pilihan 1-2 !!!");
                        }
                        break;
                    case 0 :
                        System.out.println("\t\tBerhasil Logout!");
                        froze();
                        return;
                    default:
                        System.out.println(" Pilihan 0-2 !!!");
                        break;
                        }
                    }
                }
            
    
    public static void MenuAdmin()throws IOException{
                    
                        System.out.println("=============================================");
                        System.out.println("|                Login as Admin             |");
                        System.out.println("=============================================");
                        System.out.print("| Masukkan username : ");
                        String username = input.readLine();
                        System.out.print("| Masukkan password : ");
                        String password = input.readLine();
                        System.out.println("=============================================\n");
                        if ((username.equals("admin") && password.equals("123"))){
                            System.out.println("Berhasil Login !");
                            while(true){
                            System.out.println("\n=============================================");
                            System.out.println("|                   Admin                   |");
                            System.out.println("=============================================");
                            System.out.println("| 1. Input data                             |");
                            System.out.println("| 2. Tampilkan data                         |");
                            System.out.println("| 3. Edit data                              |");
                            System.out.println("| 4. Hapus data                             |");
                            System.out.println("| 5. Laporan Pembeli                        |");
                            System.out.println("| 0. Exit                                   |");
                            System.out.println("=============================================");
                            System.out.print("| Masukkan pilihan (0-5): ");
                            int pil = Integer.parseInt(input.readLine());
                            System.out.println("=============================================\n");
                            switch (pil) {
                                case 1:
                                    System.out.println("=============================================");
                                    System.out.println("|                Input Data                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. Baju Pria                              |");
                                    System.out.println("| 2. Baju Wanita                            |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-2) : ");
                                    int pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");
                                    if (pilihan == 1) {
                                        CreatePria();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        CreateWanita();
                                        froze();
                                        break;
                                    } 
     
                                    else {
                                        System.out.println(" Pilihan 0-2 !!!");
                                        froze();
                                    }
                                    break;
                                case 2:
                                    System.out.println("=============================================");
                                    System.out.println("|                Semua Jenis                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. Baju Pria                              |");
                                    System.out.println("| 2. Baju Wanita                            |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-2) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");

                                    if (pilihan == 1) {
                                        TampilPria();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        TampilWanita();
                                        froze();
                                        break;
                                    } 
                                    else {
                                        System.out.println(" Pilihan 1-2 !!!");
                                        froze();
                                    }
                                    break;
                                case 3:
                                    System.out.println("=============================================");
                                    System.out.println("|                 Edit Data                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. Baju Pria                              |");
                                    System.out.println("| 2. Baju Wanita                            |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-2) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");

                                    if (pilihan == 1) {
                                        TampilPria();
                                        EditPria();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        TampilWanita();
                                        EditWanita();
                                        froze();
                                        break;
                                    } 
                                    else {
                                        System.out.println(" Pilihan 1-2 !!!");
                                        froze();
                                    }
                                    break;
                                case 4:
                                    System.out.println("=============================================");
                                    System.out.println("|                Hapus Data                 |");
                                    System.out.println("=============================================");
                                    System.out.println("| 1. Baju Pria                              |");
                                    System.out.println("| 2. Baju Wanita                            |");
                                    System.out.println("=============================================");
                                    System.out.print("Masukan pilihan (1-4) : ");
                                    pilihan = Integer.parseInt(input.readLine());
                                    System.out.println("=============================================");

                                    if (pilihan == 1) {
                                        TampilPria();
                                        HapusPria();
                                        froze();
                                        break;
                                    } 
                                    if (pilihan == 2) {
                                        TampilWanita();
                                        HapusWanita();
                                        froze();
                                        break;
                                    }
                                    else {
                                        System.out.println(" Pilihan 1-2 !!!");
                                        froze();
                                    }
                                    break;
                                case 5 :
                                    riwayatTransaksi();
                                    froze();
                                    break;
                                case 0:
                                    System.out.println("\t\tBerhasil Logout!");
                                    froze();
                                    return;
                                default:
                                    System.out.println(" Pilihan -5 !!!");
                                    break;
                                }
                            }                     
                        }else {
                            System.out.println(" Username / Password yang Anda Masukkan Salah !!!");
                            froze();
                        }
                   }

    
    public static void CreatePria()throws IOException{
            System.out.println("=============================================");
            System.out.println("|              Tambah Baju Pria             |");
            System.out.println("=============================================");
            System.out.print("| Id          : ");
            String Id    = input.readLine();
            System.out.print("| Nama        : ");
            String Nama   = input.readLine();
            System.out.print("| Type        : ");
            String Type   = input.readLine();
            System.out.print("| Ukuran      : ");
            String  Ukuran      = input.readLine();
            System.out.print("| Harga       : ");
            int Harga      = Integer.parseInt(input.readLine());
            System.out.println("=============================================");
            bajuPria p = new bajuPria(Id, Nama, Type, Ukuran, Harga);
            dataPria.add(p);
            p.Add(Nama, Harga);
    }
    
    public static void CreateWanita()throws IOException{
            System.out.println("=============================================");
            System.out.println("|              Tambah Baju Wanita           |");
            System.out.println("=============================================");
            System.out.print("| Id          : ");
            String Id    = input.readLine();
            System.out.print("| Nama        : ");
            String Nama   = input.readLine();
            System.out.print("| Type        : ");
            String Type   = input.readLine();
            System.out.print("| Ukuran      : ");
            String  Ukuran      = input.readLine();
            System.out.print("| Harga       : ");
            int Harga      = Integer.parseInt(input.readLine());
            System.out.println("=============================================");
            bajuWanita w = new bajuWanita(Id, Nama, Type, Ukuran, Harga);
            dataWanita.add(w);
            w.Add(Nama, Harga);
    }
    
    public static void TampilPria()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|            Semua Menu Baju Pria           |");
        System.out.println("=============================================");
        if (dataPria.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
                for (int i = 0; i < dataPria.size(); i++) {
                    System.out.println("Menu ke - " + (i + 1));
                    System.out.println("---------------------------------------------");
                    dataPria.get(i).tampil();
                }
            }
        }
    
    public static void TampilWanita()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|          Semua Menu Baju Wanita           |");
        System.out.println("=============================================");
        if (dataWanita.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
                for (int i = 0; i < dataWanita.size(); i++) {
                    System.out.println("Menu ke - " + (i + 1));
                    System.out.println("---------------------------------------------");
                    dataWanita.get(i).tampil();
                }
            }
        }
    
    public static void EditPria()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|               Edit Baju Pria              |");
        System.out.println("=============================================");
        System.out.println("=============================================");  
        if (dataPria.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
                System.out.print("Masukan Id Baju : ");
                String Id = input.readLine();
                for (bajuPria bp : dataPria) {
                    if (bp.getId().equals(Id)) {
                        System.out.print("| Id      : ");
                        bp.setId(input.readLine());
                        System.out.print("| Nama    : ");
                        bp.setNama(input.readLine());
                        System.out.print("| Type    : ");
                        bp.setType(input.readLine());
                        System.out.print("| Ukuran  : ");
                        bp.setUkuran(input.readLine());
                        System.out.print("| Harga   : ");
                        bp.setHarga(Integer.parseInt(input.readLine()));
                        System.out.println("=============================================");
                        impl.update();
                    }
                }
            }
        }
    public static void EditWanita()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Edit Baju Wanita             |");
        System.out.println("=============================================");
        System.out.println("=============================================");
        if (dataWanita.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
                System.out.print("Masukan Id Baju : ");
                String Id = input.readLine();
                for (bajuWanita bw : dataWanita) {
                    if (bw.getId().equals(Id)) {
                        System.out.print("| Barcode : ");
                        bw.setId(input.readLine());
                        System.out.print("| Nama    : ");
                        bw.setNama(input.readLine());
                        System.out.print("| Type    : ");
                        bw.setType(input.readLine());
                        System.out.print("| Ukuran  : ");
                        bw.setUkuran(input.readLine());
                        System.out.print("| Harga   : ");
                        bw.setHarga(Integer.parseInt(input.readLine()));
                        System.out.println("=============================================");
                        impl.update();
                    }
                }
            }
        }
    
    public static void HapusPria()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Delete Baju Pria             |");
        System.out.println("=============================================");
        System.out.println("=============================================");
        if (dataPria.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
            System.out.print("| Masukan Id Baju : ");
            String Id = input.readLine();
                for (int i = 0; i < dataPria.size(); i++) {
                    if (dataPria.get(i).getId().equals(Id)){
                    dataPria.remove(i);
                    impl.delete();
                    }
                }
            }
        }
    
    public static void HapusWanita()throws IOException{
        System.out.println("\n=============================================");
        System.out.println("|              Delete Baju Wanita           |");
        System.out.println("=============================================");
        System.out.println("=============================================");
        if (dataWanita.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
            System.out.print("| Masukan Id Baju : ");
            String Id = input.readLine();
                for (int i = 0; i < dataWanita.size(); i++) {
                    if (dataWanita.get(i).getId().equals(Id)){
                    dataWanita.remove(i);
                    impl.delete();
                    }
                }
            }
        }

    public static void beliBajuPria()throws IOException{
            System.out.println("\n=========== PEMBELIAN PAKAIAN PRIA ==========");
            System.out.println("Pakaian pria");
            for (int i = 0; i < dataPria.size(); i++) {
                    System.out.println("Menu ke - " + (i + 1));
                    dataPria.get(i).tampil();
                }
            if(dataPria.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
                System.out.print("\nMasukkan Menu ke-berapa yang ingin dibeli: ");
                int nomor  = Integer.parseInt(input.readLine());
                if(nomor > dataPria.size()) {
                    System.out.println("Nomor data tidak tersedia");
                }
                else{
                    System.out.print("Masukkan jumlah pembelian: ");
                    int jumlahPembelian = Integer.parseInt(input.readLine());

                    if (nomor > 0 && nomor <= dataPria.size()) {
                        int totalHarga = jumlahPembelian * dataPria.get(nomor-1).getHarga();
                        System.out.println("---------------------------------------------");
                        System.out.println("Berikut adalah detail pembelian anda : ");
                        dataPria.get(nomor-1).tampil();
                        System.out.println("Total                      : Rp. " + totalHarga );
                        System.out.print("Masukkan Pembayaran        : Rp. ");
                        int Uang = Integer.parseInt(input.readLine());
                        if (Uang >= totalHarga){
                            int kembalian = Uang - totalHarga;
                            System.out.println("Kembalian yang anda terima : Rp. "+ kembalian);
                            riwayatTransaksi.add( "id            : " + dataPria.get(nomor-1).getId() + "\n" + 
                                                  "Kategori      : " + dataPria.get(nomor-1).getKategori() + "\n" + 
                                                  "Nama          : " + dataPria.get(nomor-1).getNama() + "\n"+ 
                                                  "Type          : " + dataPria.get(nomor-1).getType() + "\n"+ 
                                                  "Ukuran        : " + dataPria.get(nomor-1).getUkuran() + "\n"+ 
                                                  "Harga Barang  : Rp. " + dataPria.get(nomor-1).getHarga() + "\n"+
                                                  "Jumlah Barang : " + jumlahPembelian + "\n"+ 
                                                  "Total         : Rp. " + totalHarga + "\n"+ 
                                                  "Uang          : Rp. " + Uang + "\n"+ 
                                                  "Kembalian     : Rp. " + kembalian );   
                            System.out.println("---------------------------------------------");
                            notif.notif();
                            notif.pengiriman();
                            notif.CheckOut();
                        }else {
                            System.out.println("Maaf ngab, Uang anda tidak mencukupi");
                        }
                        
                        }
                    } 
                }
            }
    
    public static void beliBajuWanita()throws IOException{
            System.out.println("\n=========== PEMBELIAN PAKAIAN WANITA ==========");
            System.out.println("Pakaian wanita");
            for (int i = 0; i < dataWanita.size(); i++) {
                    System.out.println("Menu ke - " + (i + 1));
                    dataWanita.get(i).tampil();
                }
            
            if(dataWanita.isEmpty()){
                System.out.println("\n=============================================");
                System.out.println("         Belum ada data yang tersimpan!      ");
                System.out.println("=============================================");
            }else{
                System.out.print("\nMasukkan Menu ke-berapa  yang ingin dibeli: ");
                int nomor  = Integer.parseInt(input.readLine());
                if(nomor > dataWanita.size()) {
                    System.out.println("Nomor data tidak tersedia");
                }else{
                    System.out.print("Masukkan jumlah pembelian: ");
                    int jumlahPembelian = Integer.parseInt(input.readLine());

                    if (nomor > 0 && nomor <= dataWanita.size()) {
                        int totalHarga = jumlahPembelian * dataWanita.get(nomor-1).getHarga();
                        System.out.println("---------------------------------------------");
                        System.out.println("Berikut adalah detail pembelian anda : ");
                        dataWanita.get(nomor-1).tampil();
                        System.out.println("Total                      : Rp. " + totalHarga );
                        System.out.print("Masukkan Pembayaran        : Rp. ");
                        int Uang = Integer.parseInt(input.readLine());
                        if (Uang >= totalHarga){
                            int kembalian = Uang - totalHarga;
                            System.out.println("Kembalian yang anda terima : Rp. "+ kembalian);
                            riwayatTransaksi.add( "id            : " + dataWanita.get(nomor-1).getId() + "\n" + 
                                                  "Kategori      : " + dataWanita.get(nomor-1).getKategori() + "\n" +
                                                  "Nama          : " + dataWanita.get(nomor-1).getNama() + "\n"+ 
                                                  "Type          : " + dataWanita.get(nomor-1).getType() + "\n"+ 
                                                  "Ukuran        : " + dataWanita.get(nomor-1).getUkuran() + "\n"+ 
                                                  "Harga Barang  : Rp. " + dataWanita.get(nomor-1).getHarga() + "\n"+
                                                  "Jumlah Barang : " + jumlahPembelian + "\n"+ 
                                                  "Total         : Rp. " + totalHarga + "\n"+ 
                                                  "Uang          : Rp. " + Uang + "\n"+ 
                                                  "Kembalian     : Rp. " + kembalian );
                            System.out.println("---------------------------------------------");
                            notif.notif();
                            notif.pengiriman();
                            notif.CheckOut();
                            }else {
                            System.out.println("Maaf ngab, Uang anda tidak mencukupi");
                            }
                        }
                    }   
                }
            }
    
    
      public static void riwayatTransaksi() {
            System.out.println("=============================================");
            System.out.println("|              Riwayat Transaksi            |");
            System.out.println("=============================================");
            
                if(riwayatTransaksi.isEmpty()){
                    System.out.println("\n=============================================");
                    System.out.println("               Belum ada pembeli!            ");
                    System.out.println("=============================================");
                    }else{
                        for (String transaksi : riwayatTransaksi) {
                        System.out.println(transaksi);
                        System.out.println("---------------------------------------------");
                        } 
                    }
                }
        
    
    public static void login() throws IOException{
        System.out.println("\n\n=============================================");
        System.out.println("|                Login as Users             |");
        System.out.println("=============================================");
        System.out.print("| Masukkan username : ");
        String username = input.readLine();
        System.out.print("| Masukkan password : ");
        String password = input.readLine();
        
        try {
            BufferedReader input = new BufferedReader(new FileReader("users.txt"));
            String line;
            while ((line = input.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(username) && parts[1].equals(password)) {
                    System.out.println("\n\tBerhasil Login");
                    froze();
                    MenuUsers();
                }
            }
            input.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
            
    }

    public static void register() throws IOException{
        System.out.println("\n\n=============================================");
        System.out.println("|                 Registrasi                |");
        System.out.println("=============================================");
        System.out.print("| Masukkan username : ");
        String username = input.readLine();
        System.out.print("| Masukkan password : ");
        String password = input.readLine();

        try {
            FileWriter writer = new FileWriter("users.txt", true);
            writer.write(username + "," + password + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}



