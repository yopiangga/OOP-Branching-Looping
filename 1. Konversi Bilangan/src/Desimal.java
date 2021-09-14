public class Desimal {
    public int x;
    public Desimal(int x){
        this.x = x;
    }

    public String toBiner(){
        return(Integer.toBinaryString(this.x));
    }

    public String toOctal(){
        return(Integer.toOctalString(this.x));
    }

    public String toHexadecimal(){
        return(Integer.toHexString(this.x));
    }
}
