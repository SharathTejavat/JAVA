package mseva;

interface msevaMethods{
    public boolean checkAP();
    public boolean checkA();
    public boolean checkBC();
    public boolean checkPC();
}

public class msevautil implements msevaMethods{
    public boolean sz,vomit,eye,mus,fev,fat,skin,bp;
    public msevautil(boolean sz,boolean vomit,boolean eye,boolean mus,boolean fev,boolean fat,boolean skin,boolean bp){
        this.sz=sz;
        this.vomit=vomit;
        this.eye=eye;
        this.mus=mus;
        this.fev=fev;
        this.fat=fat;
        this.skin=skin;
        this.bp=bp;
        greet();
    }

    public void greet(){
        System.out.println("Welcome to M-Seva");
    }

    public boolean checkAP(){
        if(sz || vomit || eye || mus || fev)return true;
        return false;
    }

    public boolean checkA(){
        if(sz || vomit || eye || fat || fev)return true;
        return false;
    }
    public boolean checkBC(){
        if(sz || vomit || eye || skin || bp)return true;
        return false;
    }
    public boolean checkPC(){
        if(sz || vomit || eye || fat || fev)return true;
        return false;
    }

}
