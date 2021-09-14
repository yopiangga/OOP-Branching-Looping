
public class Orang {
    String nama;
    int tinggi;
    int berat;

    public Orang(String nama, int tinggi, int berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }

    public float hitungBMI(){
        float t = this.tinggi / (float)100;
        return(this.berat / (float)Math.pow(t, 2));
    }

    public String statusBMI(){
        String status;
        float result = hitungBMI();

        if(result < (float)18.5){
            status = "Underweight";
        } else if(result >= (float)18.5 && result <= (float)24.9){
            status = "Normal Weight";
        } else if(result >= (float)25.0 && result <= (float)29.9){
            status = "Overweight";
        } else if(result >= (float)30.0 && result <= (float)34.9){
            status = "Obesity Class 1";
        } else if(result >= (float)35.0 && result <= (float)39.9){
            status = "Obesity Class 2";
        } else if(result >= (float)40.0){
            status = "Obesity Class 3";
        } else {
            status = "Undefined";
        }

        return(status);
    }
}
