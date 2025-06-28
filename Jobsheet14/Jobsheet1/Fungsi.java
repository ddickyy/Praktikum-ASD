<<<<<<< HEAD
public class Fungsi {
    public static void main(String[] args) {
        System.out.println("Pendapatan jika semua bunga terjual:");
        hitungPendapatan();
        
        System.out.println("\nStok sebelum dikurangi bunga mati:");
        tampilkanStock();
        
        kurangiStock();
        
        System.out.println("Stok setelah dikurangi bunga mati:");
        tampilkanStock();
    }

    static int[][] stockBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    
    public static void hitungPendapatan() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println(cabang[i] + " menghasilkan pendapatan: Rp" + pendapatan);
        }
    }
    
    public static void tampilkanStock() {
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Stok di " + cabang[i] + ":");
            for (int j = 0; j < jenisBunga.length; j++) {
                System.out.println(jenisBunga[j] + ": " + stockBunga[i][j]);
            }
            System.out.println();
        }
    }

    public static void kurangiStock() {
        int[] bungaMati = {-1, -2, 0, -5};
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += bungaMati[j];
            }
        }
    }
    
 
}
=======
public class Fungsi {
    public static void main(String[] args) {
        System.out.println("Pendapatan jika semua bunga terjual:");
        hitungPendapatan();
        
        System.out.println("\nStok sebelum dikurangi bunga mati:");
        tampilkanStock();
        
        kurangiStock();
        
        System.out.println("Stok setelah dikurangi bunga mati:");
        tampilkanStock();
    }

    static int[][] stockBunga = {
        {10, 5, 15, 7},  
        {6, 11, 9, 12},  
        {2, 10, 10, 5},  
        {5, 7, 12, 9}
    };

    static int[] hargaBunga = {75000, 50000, 60000, 10000};
    static String[] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    
    public static void hitungPendapatan() {
        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println(cabang[i] + " menghasilkan pendapatan: Rp" + pendapatan);
        }
    }
    
    public static void tampilkanStock() {
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Stok di " + cabang[i] + ":");
            for (int j = 0; j < jenisBunga.length; j++) {
                System.out.println(jenisBunga[j] + ": " + stockBunga[i][j]);
            }
            System.out.println();
        }
    }

    public static void kurangiStock() {
        int[] bungaMati = {-1, -2, 0, -5};
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                stockBunga[i][j] += bungaMati[j];
            }
        }
    }
    
 
}
>>>>>>> f1bff2d93fffc4e5c57279c73aa746dc9c9fe129
