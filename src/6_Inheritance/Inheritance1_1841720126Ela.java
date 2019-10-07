/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet6_1841720126Ela;

/**
 *
 * @author User
 */
public class Inheritance1_1841720126Ela {
    public static void main(String[] args) {
       Manager1841720126Ela M = new Manager1841720126Ela();
       M.nama="Vivin";
       M.alamat="Jl. Vinolia";
       M.umur=25;
       M.jk="Perempuan";
       M.gaji=30000000;
       M.tunjangan=10000000;
       M.tampilDataManagerEla();

       Staff1841720126Ela S = new Staff1841720126Ela();
       S.nama="Lestari";
       S.alamat="Malang";
       S.umur=25;
       S.jk="Perempuan";
       S.gaji=20000000;
       S.lembur=500000;
       S.potongan=250000;
       S.tampilDataStaffEla();
    }

}
