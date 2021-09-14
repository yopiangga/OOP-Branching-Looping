import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        DecimalFormat df = new DecimalFormat("#.##");
        
        Orang a = new Orang("Ani", 160, 45);
        System.out.println("Nama : " + a.nama);
        System.out.println("Tinggi : " + a.tinggi + " CM");
        System.out.println("Berat : " + a.berat + " KG");
        System.out.println("BMI : " + df.format(a.hitungBMI()));
        System.out.println("Status : " + a.statusBMI());

        System.out.println("\n");

        Orang b = new Orang("Budi", 172, 70);
        System.out.println("Nama : " + b.nama);
        System.out.println("Tinggi : " + b.tinggi + " CM");
        System.out.println("Berat : " + b.berat + " KG");
        System.out.println("BMI : " + df.format(b.hitungBMI()));
        System.out.println("Status : " + b.statusBMI());

        System.out.println("\n");
    }
}
