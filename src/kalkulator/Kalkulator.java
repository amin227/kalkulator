package kalkulator;
import java.util.Scanner;
public class Kalkulator {
private Tampilan tmp;
private Data data;
public Kalkulator(){
    tmp=new Tampilan();
    data=new Data();
}
public void processByPilihan(int p){
    if(p==1){
    tmp.prompt2Operan(data);
    data.countPenjumlahan();
    tmp.displayHasil(data);
    
    }
    else if(p==2){
    tmp.prompt2Operan(data);
    data.countPengurangan();
    tmp.displayHasil(data);
    }
    else if(p==3){
    tmp.prompt2Operan(data);
    data.countPerkalian();
    tmp.displayHasil(data);
    }
    else if(p==0){
    tmp.displayClosing();
    }
    else{}
    
}
public void play(){
Scanner sc=new Scanner(System.in);

int a;
do{
tmp.displayMenu();
a=tmp.promptMenu();
processByPilihan(a);
}while(a!=0);

}

    
    public static void main(String[] args) {
        Kalkulator a=new Kalkulator();
        a.play();
      
    }
    
}
