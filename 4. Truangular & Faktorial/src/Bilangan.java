public class Bilangan {
    int x;
    public Bilangan(int x){
        this.x = x;
    }

    public int hitungTriangular(){
        int i;
        int result = 0;
        for(i=0; i<this.x; i++){
            result = result + i;
        }
        return(result);
    }

    public int hitungFaktorial(){
        int i;
        int result = 1;
        for(i=1; i<=this.x; i++){
            result = result * i;
        }
        return(result);
    }
}
