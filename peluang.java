
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class peluang {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Banyaknya Kejadian (n(S))  ");
        System.out.println(" *************************************************************");

        double ns = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Kejadian A (n(A))  ");
        System.out.println(" ************************************************************* ");

        double na = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Banyak Percobaan (N)  ");
        System.out.println(" ************************************************************* ");

        double n = sc.nextInt();

        double hasilpa = na / ns;
        double hasilfh = hasilpa * n;

        System.out.println(" *********************************************************** ");
        System.out.println(" Maka Nilai Peluang = " + hasilpa);
        System.out.println(" Maka Nilai Frekuensi harapan  = " + hasilfh);
        System.out.println(" *********************************************************** ");
    }

}
