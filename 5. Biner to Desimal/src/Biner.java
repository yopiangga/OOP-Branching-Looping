public class Biner {
    StringBuffer x = new StringBuffer("");
    public Biner(String x){
        this.x.append(x);
    }

    public int toDesimal(){
        int result = 0;
        int i;
        int j = 0;
        int temp = 0;
        
        for(i=this.x.length()-1; i>=0; i--){
            temp = (int)(this.x.charAt(i) - '0') * (int)Math.pow(2, j);
            result = result + temp;
            j++;
        }

        return(result);
    }
}