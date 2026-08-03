import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int pilihan;
        double totalHarga = 0; 

        do {
            System.out.println("Selamat datang di Restaurant kami");
            System.out.println("Berikut adalah daftar menu kami");
            System.out.println("1. ayam goreng      $3.99");
            System.out.println("2. Mie goreng       $3.00");
            System.out.println("3. Sapi goreng      $5.00");
            System.out.println("4. Selesai dan bayar ");
            System.out.print("Pilihan anda adalah : ");
            pilihan = scanner.nextInt();

            if (pilihan == 1){
                System.out.println("Anda memesan Ayam Goreng sebanyak : ");
                int porsi = scanner.nextInt();
                double harga = 3.99 * porsi;
                totalHarga += harga;
                System.out.println("Pesanan " +porsi+ "anda di tambahkan ke dalam pesanan anda dengan harga $" + harga);
            }
            else if (pilihan == 2){
                System.out.println("Anda memesan Mie goreng sebanyak : ");
                int porsi = scanner.nextInt();
                double harga = 3.00 * porsi;
                totalHarga += harga;
                System.out.println( porsi+ " di tambahkan ke dalam pesanan anda dengan harga $" + harga);
            }
            else if (pilihan == 3){
                System.out.println("Anda memesan sapi goreng sebanyak : ");
                int porsi = scanner.nextInt();
                double harga = 5.00 * porsi;
                totalHarga += harga;
                System.out.println(porsi+ " di tambahkan ke dalam pesanan anda dengan harga $" + harga);
            }
            else if (pilihan == 4){
                System.out.println("Pesanan anda selesai");
            }
            else{
                System.out.println("Pilihan anda tidak valid");
            }
            
            if (pilihan >=1 && pilihan <=3) {
                System.out.println("total pesanan anda adalah $" + totalHarga );
            }

        }
        while(pilihan !=4);
        System.out.println("terimka kasih sudah berbelanja");


        System.out.println("Selamat datang di tempat pembayaran");
        if(totalHarga > 0) {
            System.out.println("Total Bill anda adalah $"+totalHarga+" uang anda adalah : $");
            double uangAnda = scanner.nextDouble();

            if (uangAnda >= totalHarga) {
                double kembalian = uangAnda - totalHarga ;
                System.out.println("kembalian anda adalah $" +kembalian + "terima kasih sudah berkunjung");           }
            else {
                double kurang = totalHarga - uangAnda;
                System.out.println("uang anda tidak cukup sebesar $"+ kurang+" breee!!!!!");
            }
        }
        else {
            System.out.println("Anda tidak memiliki tagihan");
        }
        

        scanner.close();
    }
}