import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] daftarHuruf = {"A", "B+", "B", "C+", "C", "D", "E"};
        double[] daftarNilai = {4.0, 3.5, 3.0, 2.5, 2.0, 1.0, 0.0};
        
        double totalBobot = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < 8; i++) {
            input.nextLine(); 
            
            System.out.print("Masukkan nama mata kuliah: ");
            String mataKuliah = input.nextLine();
            
            System.out.print("Masukkan bobot SKS: ");
            int sks = input.nextInt();
            
            System.out.print("Masukkan nilai huruf: ");
            String nilaiHuruf = input.next().toUpperCase();
            
            double nilaiSetara = -1;
            for (int j = 0; j < daftarHuruf.length; j++) {
                if (nilaiHuruf.equals(daftarHuruf[j])) {
                    nilaiSetara = daftarNilai[j];
                    break;
                }
            }
            
            if (nilaiSetara != -1) {
                totalBobot += nilaiSetara * sks;
                totalSKS += sks;
            } else {
                System.out.println("Nilai huruf tidak valid.");
                i--;
            }
        }
        
        double ipSemester = totalBobot / totalSKS;
        System.out.printf("IP Semester Anda: %.2f\n", ipSemester);

    }
}
