public class Bilangan {
    int x;
    public Bilangan(int x){
        this.x = x;
    }

    public int penjumlahan(){
        String strX = Integer.toString(this.x);
        int i;
        int result = 0;
        for(i=0; i<strX.length(); i++){
            result = result + strX.charAt(i) - '0';
        }
        return(result);
    }

    public int perkalian(){
        String strX = Integer.toString(this.x);
        int i;
        int result = 1;
        for(i=0; i<strX.length(); i++){
            result = result * (int) (strX.charAt(i) - '0');
        }
        return(result);
    }

    public StringBuffer pembalik(){
        String strX = Integer.toString(this.x);
        int i;
        StringBuffer result = new StringBuffer("");
        for(i=strX.length() - 1; i>=0; i--){
            result = result.append(strX.charAt(i));
        }
        return(result);
    }
}
