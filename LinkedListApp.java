package LatihanLinkList;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        //menambahkan data
        ll.insert("PF","Pemograman Fundamental");
        ll.insert("PL","Pemograman Lanjut");
        ll.insert("PM","Pemograman Mahir");
        System.out.println("Keadaan Awal :");
        ll.display();

        //menghapus data
        ll.remove("PL");

        System.out.println();
        System.out.println("Setelah PL dihapus");
        ll.display();

        //mencari PL (data yang sudah dihapus)
        System.out.println();
        String dicari = "PL";
        System.out.println("Pencarian" + dicari);
        Simpul posisidata = ll.find(dicari);
        if(posisidata == null){
            System.out.println(dicari + "Tidak Ditemukan");
        } else {
            System.out.println("Hasil Pencarian : ");
            posisidata.display();
        }
    }
}
