package LatihanLinkList;

public class Simpul {
    public String kode;
    public String nama;
    Simpul berikut;

    public Simpul(String xkode , String xnama){
        kode = xkode;
        nama = xnama;
        berikut = null;

    }
    public void display (){
        System.out.println(kode + " + " +nama);
    }
}