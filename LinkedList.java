package LatihanLinkList;

public class LinkedList {
    private Simpul Pertama;

    Simpul pendahulu;
    Simpul posisidata;

    //konstruktor

    public LinkedList(){
        Pertama = null;
    }
    //operasi memasukkan data kedalam LinkedList
    public void insert(String kode , String nama){
        Simpul ptrBaru = new Simpul(kode, nama);
        ptrBaru berikut = Pertama;
        Pertama = ptrBaru;
    }

    // operasi mencari data pada LinkedList
    public boolean findx(String x){
        posisidata = Pertama;
        pendahulu = null;
        boolean ditemukan = false;

        while(posisidata != null){
            String kode = posisidata.kode;

            if(kode.compareTo(x) == 0){
                ditemukan = true;
                break;
            }
            pendahulu = posisidata;
            posisidata = pendahulu;
        }
        return ditemukan;
    }
    //operasi mencari data dan akan memberikan nilai null jika data tidak ditemukan
    public Simpul find(String x){
        pendahulu = null;
        posisidata = null;
        boolean ditemukan = false;

        if(!ditemukan){
            return null;
        } else {
            return posisidata;
        }
    }
    // operasi menghapus data yang berisi nilai tertentu
    public boolean remove (String x) {
        pendahulu = null;
        posisidata = null;
        boolean ditemukan = findx(x);

        if (!ditemukan) {
            System.out.println("Data yang akan dihapus tidak ditemukan");
            return false;
        }
        if (pendahulu == null) {
            Pertama = Pertama.berikut;
        } else {
            pendahulu.berikut = posisidata.berikut;
            posisidata = null;
        }
        // operasi menampilkan data
        public void display {
            System.out.println("Isi Linked List : ");
            Simpul penunjuk = Pertama;

            while (penunjuk != null) {
                penunjuk.display();
                penunjuk = penunjuk.berikut;
            }
        }
    }
}




