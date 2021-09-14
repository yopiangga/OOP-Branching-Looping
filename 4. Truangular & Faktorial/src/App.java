public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        
        Bilangan a = new Bilangan(5);
        System.out.println("Bilangan Asli : " + a.x);
        System.out.println("Triangular : " + a.hitungTriangular());
        System.out.println("Faktorial : " + a.hitungFaktorial());

        System.out.println("\n");
        
        Bilangan b = new Bilangan(7);
        System.out.println("Bilangan Asli : " + b.x);
        System.out.println("Triangular : " + b.hitungTriangular());
        System.out.println("Faktorial : " + b.hitungFaktorial());

        System.out.println("\n");
    }
}
