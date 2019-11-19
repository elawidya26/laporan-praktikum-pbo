/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan4;
import java.util.ArrayList;
/**
 *
 * @author Ela Widya
 */
public class InputData1841720126Ela {
     ArrayList<Mahasiswa1841720126Ela> ListMahasiswa;

    public InputData1841720126Ela() {
        ListMahasiswa = new ArrayList();
    }
    
    public void isiDataEla(String Nim, String Nama, String Alamat) {
        Mahasiswa1841720126Ela mhs = new Mahasiswa1841720126Ela(Nim, Nama, Alamat);
        ListMahasiswa.add(mhs);
    }
    
    public ArrayList<Mahasiswa1841720126Ela> getData() {
        return ListMahasiswa;
    }
}
