import java.util.HashMap;
import java.util.Scanner;

public class latihan4 {
    String nama, kelas, matkul;
    int nim;

    public latihan4(String n, String k, String mat, int ni){
        nama = n;
        kelas = k;
        matkul = mat;
        nim = ni;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, latihan4> lat = new HashMap<>();
        String input;
        latihan4 data;

        lat.put("1", new latihan4("putri", "3h", "strukdat", 2021404));
        lat.put("2", new latihan4("agus", "3a", "ipa", 2021103));
        lat.put("3", new latihan4("ara", "3d", "proglan", 2021703));

        System.out.println("masukkan ID: ");
        input = in.nextLine();
        data = lat.get(input);
        if (data != null){
            System.out.println("data mahasiswa: "  + data.nama +  " kelas: " + data.kelas + " matkul: "
                    + data.matkul + " nim: " + data.nim);
        }
    }
}