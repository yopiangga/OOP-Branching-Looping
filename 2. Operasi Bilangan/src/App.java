public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        
        Bilangan a = new Bilangan(1935);
        System.out.println("Bilangan : " + a.x);
        System.out.println("Penjumlahan : " + a.penjumlahan());
        System.out.println("Perkalian : " + a.perkalian());
        System.out.println("Pembalik : " + a.pembalik());
        
        System.out.println("\n");
    }
}
