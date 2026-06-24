import model.Person;
import model.Mahasiswa;
import generic.Data;

import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {

    public static void main(String[] args) {

        Person m1 = new Mahasiswa("1102020","Ferdi");
        Person m2 = new Mahasiswa("1102021","Ananda");

        ArrayList<Person> daftar = new ArrayList<>();
        daftar.add(m1);
        daftar.add(m2);

        System.out.println("=== ARRAYLIST ===");
        for(Person m : daftar){
            m.tampilData();
            System.out.println();
        }

        ArrayDeque<String> antrian = new ArrayDeque<>();
        antrian.add("Mahasiswa 1");
        antrian.add("Mahasiswa 2");
        antrian.add("Mahasiswa 3");

        System.out.println("=== ARRAYDEQUE ===");
        while(!antrian.isEmpty()){
            System.out.println(antrian.poll());
        }

        Data<String> jurusan = new Data<>();
        jurusan.setData("Teknik Informatika");

        System.out.println("\nJurusan : " + jurusan.getData());
    }
}
