
package pa;

// abstract class
public abstract class Penjualan {
    protected String Id;
    protected String Nama;
    
// contruktor
public Penjualan(String Id, String Nama) {
        this.Id = Id;
        this.Nama = Nama; 
    }

    
    public String getId() {
        return Id;
    }

    
    public void setId(String Id) {
        this.Id = Id;
    }

    
    public String getNama() {
        return Nama;
    }

    
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    // method absract
    public abstract void tampil();
    
   } 