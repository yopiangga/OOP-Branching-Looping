public class Bilangan {
    int x;

    public Bilangan(int x){
        this.x = x;
    }

    public StringBuffer WhiteSpace(){
        String strX = Integer.toString(this.x);
        StringBuffer strBuffX = new StringBuffer("");
        int i;

        for(i=0; i<strX.length(); i++){
            strBuffX = strBuffX.append(" " + strX.charAt(i));
        }

        return(strBuffX);
    }

}
