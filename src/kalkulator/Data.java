package kalkulator;
public class Data {

    int operan1;
    int operan2;
    int hasil;

    public Data() {
    }

    public void setOperan1(int op) {
        operan1 = op;
    }

    public void setOperan2(int op) {
        operan2 = op;
    }

    public int getHasil() {
        return hasil;
    }

    public void countPenjumlahan() {
        hasil = operan1 + operan2;
    }

    public void countPengurangan() {
        hasil = operan1 - operan2;
    }

    public void countPerkalian() {
        hasil = operan1 * operan2;
    }
}
