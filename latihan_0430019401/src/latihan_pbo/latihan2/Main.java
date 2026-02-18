package latihan_pbo.latihan2;

class Cafe{
    private String nama;

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

}


public class Main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe();
        cafe1.setNama("Coba");
        System.out.println(cafe1.getNama());
    }
}
