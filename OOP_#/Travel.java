import java.util.Scanner;

interface fare {
    double getFare(String type);
    double getAmenities(String type);
}

class bus implements fare{
    double dist;
    double ac=100,nonac=10,slp=50,semislp=20;
    double aac=30,anonac=5,aslp=10,asemislp=15;
    bus(double dist){
        this.dist=dist;
    }
    
    public double getFare(String type){
        if(type.equals("ac"))return this.dist*ac;
        if(type.equals("non ac"))return this.dist*nonac;
        if(type.equals("sleeper"))return this.dist*this.slp;
        return this.dist*this.semislp;
    }

    public double getAmenities(String type){
        if(type.equals("ac"))return this.dist*aac;
        if(type.equals("non ac"))return this.dist*anonac;
        if(type.equals("sleeper"))return this.dist*this.aslp;
        return this.dist*this.asemislp;
    }
}

class train implements fare{
    double dist;
    double ac=100,slp=50,gnrl=20;
    double aac=30,aslp=10,angrl=15;
    train(double dist){
        this.dist=dist;
    }
    public double getFare(String type){
        if(type.equals("ac"))return this.dist*ac;
        if(type.equals("general"))return this.dist*gnrl;
        if(type.equals("sleeper"))return this.dist*this.slp;
        return 0;
    }

    public double getAmenities(String type){
        if(type.equals("ac"))return this.dist*aac;
        if(type.equals("general"))return this.dist*angrl;
        if(type.equals("sleeper"))return this.dist*this.aslp;
        return 0;
    }
}

class flight implements fare{
    double dist;
    double ecm=1000,busni=2000;
    double aecm=100,abusni=200;
    flight(double dist){
        this.dist=dist;
    }
    public double getFare(String type){
        if(type.equals("eco"))return this.dist*ecm;
        return this.dist*busni;

    }

    public double getAmenities(String type){
        if(type.equals("eco"))return this.dist*aecm;
        return this.dist*abusni;
    }
}

public class Travel {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 for bus\n2 for train\n3 for flight");
            int k=sc.nextInt();
            switch(k){
                case 1:
                    System.out.println("1 for ac\n2 for non-ac\n3 for sleeper\n4 for semi sleeper");
                    k=sc.nextInt();
                    System.out.println("enter distance travelled");
                    int dist=sc.nextInt();
                    bus b=new bus(dist);
                    switch(k){
                        case 1:
                            System.out.println("amenities "+b.getAmenities("ac"));
                            System.out.println("fare "+b.getFare("ac"));
                            break;
                        case 2:
                            System.out.println("amenities "+b.getAmenities("non ac"));
                            System.out.println("fare "+b.getFare("non ac"));
                            break;
                        case 3:
                            System.out.println("amenities "+b.getAmenities("sleeper"));
                            System.out.println("fare "+b.getFare("sleeper"));
                            break;
                        case 4:
                            System.out.println("amenities "+b.getAmenities("semi sleeper"));
                            System.out.println("fare "+b.getFare("semi sleeper"));
                            break;
                        default:
                            System.out.println("invalid selection..");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("1 for ac\n2 for general\n3 for sleeper");
                    k=sc.nextInt();
                    System.out.println("enter distance travelled");
                    dist=sc.nextInt();
                    train t=new train(dist);
                    switch(k){
                        case 1:
                            System.out.println("amenities "+t.getAmenities("ac"));
                            System.out.println("fare "+t.getFare("ac"));
                            break;
                        case 2:
                            System.out.println("amenities "+t.getAmenities("general"));
                            System.out.println("fare "+t.getFare("general"));
                            break;
                        case 3:
                            System.out.println("amenities "+t.getAmenities("sleeper"));
                            System.out.println("fare "+t.getFare("sleeper"));
                            break;
                        default:
                            System.out.println("invalid selection..");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("1 for economy\n2 for business");
                    k=sc.nextInt();
                    System.out.println("enter distance travelled");
                    dist=sc.nextInt();
                    flight f=new flight(dist);
                    switch(k){
                        case 1:
                            System.out.println("amenities "+f.getAmenities("eco"));
                            System.out.println("fare "+f.getFare("eco"));
                            break;
                        case 2:
                            System.out.println("amenities "+f.getAmenities("wqdsa"));
                            System.out.println("fare "+f.getFare("ds"));
                            break;
                        default:
                            System.out.println("invalid selection..");
                            break;
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println("thank you...");
    }
}
