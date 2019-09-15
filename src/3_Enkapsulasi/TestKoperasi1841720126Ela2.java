/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1841720126Ela;
import java.util.Scanner;
/**
 *
 * @author Windows 10
 */
public class TestKoperasi1841720126Ela2 {
    static Scanner sc = new Scanner(System.in);
    static String mNomorKtp, mNama;
    static int mLimitPinjaman;
    static AnggotaTugas1841720126Ela member;
    
    public static void main(String[] args){
        System.out.print("Input nomor KTP : ");
        mNomorKtp = sc.next();
        System.out.print("Input Nama : ");
        mNama = sc.next();
        System.out.print("Limit Pinjaman : ");
        mLimitPinjaman = sc.nextInt();
        member = new AnggotaTugas1841720126Ela(mNomorKtp, mNama, mLimitPinjaman);
        while(true){
            menu();
        }
    }
    private static void menu(){
        int input = 0;
        System.out.println("MENU");
        System.out.println("============");
        System.out.println("1. Pinjam ");
        System.out.println("2. Angsur ");
        System.out.println("3. Profil ");
        System.out.println("4. Exit ");
        System.out.println("============");
        System.out.println("Input : ");
        input = sc.nextInt();
        int uang = 0;
        
        switch(input){
            case 1:
                System.out.println("Input Nominal Pinjam ; ");
                uang = sc.nextInt();
                member.pinjamEla(uang);
                System.out.println("Jumlah Pinjaman : "+member.getJumlahPinjamanEla());
                break;
            case 2:
                System.out.println("Input Nominal Angsur : ");
                uang = sc.nextInt();
                member.angsurEla(uang);
                System.out.println("JUmlah Pinjaman : "+member.getJumlahPinjamanEla());
                break;
            case 3:
                System.out.println("Nomor KTP : "+mNomorKtp);
                System.out.println("Nama : "+member.getNamaEla());
                System.out.println("Limit Pinjaman : "+member.getLimitPinjamanEla());
                System.out.println("Jumlah Pinjaman : "+member.getJumlahPinjamanEla());
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Input Salah!");
        }
    }
}
