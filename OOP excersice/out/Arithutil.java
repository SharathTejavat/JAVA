package complex;

public class Arithutil {
    public int rp,ip;
    public Arithutil(){
        rp=0;
        ip=0;
    }

    public Arithutil(int rp,int ip){
        this.rp=rp;
        this.ip=ip;
    }

    public void add(Arithutil a1,Arithutil a2){
        rp=a1.rp+a2.rp;
        ip=a1.ip+a2.ip;
    }

    public void sub(Arithutil a1,Arithutil a2){
        rp=a1.rp-a2.rp;
        ip=a1.ip-a2.ip;
    }
}
