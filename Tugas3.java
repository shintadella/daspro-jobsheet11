import java.util.Scanner;

public class Tugas3 {

    static String[] namaMahasiswa;
    static int[][] nilaiMahasiswa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        System.out.print("Masukkan jumlah tugas (minggu): ");
        int jumlahTugas = scanner.nextInt();

        namaMahasiswa = new String[jumlahMahasiswa];
        nilaiMahasiswa = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa ke-" + (i + 1) + ": ");
            namaMahasiswa[i] = scanner.next();
        }

        inputNilai(scanner, jumlahMahasiswa, jumlahTugas);

        tampilkanNilai(jumlahMahasiswa, jumlahTugas);

        nilaiTertinggiPerMinggu(jumlahMahasiswa, jumlahTugas);

        mahasiswaNilaiTertinggi(jumlahMahasiswa, jumlahTugas);
    }

    public static void inputNilai(Scanner scanner, int jumlahMahasiswa, int jumlahTugas) {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai untuk " + namaMahasiswa[i] + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                while (true) {
                    System.out.print("Minggu ke-" + (j + 1) + ": ");
                    try {
                        int nilai = scanner.nextInt();
                        if (nilai < 0 || nilai > 100) {
                            System.out.println("Nilai harus antara 0 dan 100. Silakan coba lagi.");
                        } else {
                            nilaiMahasiswa[i][j] = nilai;
                            break;
                        }
                    } catch (Exception e) {
                        System.out.println("Input tidak valid. Silakan masukkan angka.");
                        scanner.next(); 
                    }
                }
            }
        }
    }

    public static void tampilkanNilai(int jumlahMahasiswa, int jumlahTugas) {
        System.out.println("\nData Nilai Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print(namaMahasiswa[i] + " : ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiMahasiswa[i][j] + (j < jumlahTugas - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }

    public static void nilaiTertinggiPerMinggu(int jumlahMahasiswa, int jumlahTugas) {
        System.out.println("\nNilai tertinggi di setiap minggu:");
        for (int minggu = 0; minggu < jumlahTugas; minggu++) {
            int nilaiTertinggi = 0;
            for (int mahasiswa = 0; mahasiswa < jumlahMahasiswa; mahasiswa++) {
                if (nilaiMahasiswa[mahasiswa][minggu] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[mahasiswa][minggu];
                }
            }
            System.out.println("Minggu ke-" + (minggu + 1) + ": " + nilaiTertinggi);
        }
    }

    public static void mahasiswaNilaiTertinggi(int jumlahMahasiswa, int jumlahTugas) {
        int nilaiTertinggi = 0;
        String namaMahasiswaTertinggi = "";
        int mingguTertinggi = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahTugas; j++) {
                if (nilaiMahasiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMahasiswa[i][j];
                    namaMahasiswaTertinggi = namaMahasiswa[i];
                    mingguTertinggi = j + 1;
                }
            }
        }

        System.out.println("\nMahasiswa dengan nilai tertinggi:");
        System.out.println("Nama: " + namaMahasiswaTertinggi);
        System.out.println("Nilai");
    }
}