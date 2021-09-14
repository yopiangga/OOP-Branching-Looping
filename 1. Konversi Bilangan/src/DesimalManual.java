
public class DesimalManual {
    public int x;

    public DesimalManual(int x) {
        this.x = x;
    }

    public StringBuffer toBiner() {
        int sisa = this.x;
        String result = new String("");

        while (sisa >= 1) {
            result = result.concat(Integer.toString(sisa % 2));
            sisa = sisa / 2;
        }

        StringBuffer convert = new StringBuffer(result);
        convert = convert.reverse();
        return (convert);
    }

    public StringBuffer toOctal() {
        int i;
        int sisa = this.x;
        StringBuffer result = new StringBuffer("");
        while (sisa >= 1) {
            result = result.append(sisa % 8);
            sisa = sisa / 8;
        }

        StringBuffer convert = new StringBuffer("");
        for (i = result.length() - 1; i >= 0; i--) {
            convert = convert.append(result.charAt(i) - '0');
        }

        return (convert);
    }

    public StringBuffer toHexadecimal() {
        int i;
        int sisa = this.x;
        int temp;
        StringBuffer result = new StringBuffer("");
        while (sisa >= 1) {
            temp = (int)sisa % 16;
            if(temp >=0 && temp <=9){
                result = result.append(temp);
            } else {
                result = result.append(cek(temp));
            }
            sisa = sisa / 16;
        }

        StringBuffer convert = new StringBuffer("");
        for (i = result.length() - 1; i >= 0; i--) {
            convert = convert.append(result.charAt(i));
        }

        return (convert);
    }

    private String cek(int intX) {
        String result;
        switch(intX) {
            case 10:
                result = "A";
                break;
            case 11:
                result = "B";
                break;
            case 12:
                result = "C";
                break;
            case 13:
                result = "D";
                break;
            case 14:
                result = "E";
                break;
            case 15:
                result = "F";
                break;
            default :
                result = "Z";
                break;
        }

        return(result);
    }
}
