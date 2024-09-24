public class Kalkulator
{
    private double num1;
    private double num2;

    public void isiNum1 (double x){
        num1 = x;
    }
    
    public void isiNum2 (double y) {
        num2 = y;
    }
    
    public double tambah(double num1, double num2){
        return num1 + num2;
    }
    
    public double kurang(double num1, double num2){
        return num1 - num2;
    }
    
    public double kali(double num1, double num2){
        return num1 * num2;
    }
    
    public double bagi(double num1, double num2){
        return num1 / num2;
    }
}
