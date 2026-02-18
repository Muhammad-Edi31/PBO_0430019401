package latihan_pbo.latihan3;

import java.util.Scanner;

// ENCAPUSLATION
// ACCESS MODIFIER (PUBLIC, PRIVATE, PROTECTED)


class PersegiPanjang{
    public int panjang;
    private int lebar;


    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        


        System.out.println("Masukkan nama :");
        

        PersegiPanjang p = new PersegiPanjang();
        System.out.println("masukkan panjang : ");
        p.panjang = inp.nextInt();


        p.setPanjang(9);
        p.setLebar(10);
        System.out.println(p.getPanjang());
        System.out.println(p.getLebar());
    }
}


