public class FirS extends Thread{
    Resursa r;
    FirS(Resursa r){
        this.r = r;
    }
     public void run(){
        int i;
        for(i = 1;i<=10;i++) {
            r.scrie(i);
            System.out.println("Am scris" + i);
        }
    }
}
