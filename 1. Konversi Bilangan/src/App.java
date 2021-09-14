public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        
        Desimal a = new Desimal(9);
        System.out.println("Desimal : " + a.x);
        System.out.println("Desimal to Biner : " + a.toBiner());
        System.out.println("Desimal to Octal : " + a.toOctal());
        System.out.println("Desimal to Hexadesimal : " + a.toHexadecimal());
        
        System.out.println("\n");

        DesimalManual b = new DesimalManual(11);
        System.out.println("Desimal : " + b.x);
        System.out.println("Desimal to Biner : " + b.toBiner());
        System.out.println("Desimal to Octal : " + b.toOctal());
        System.out.println("Desimal to Hexadesimal : " + b.toHexadecimal());
        
        System.out.println("\n");
    }
}
