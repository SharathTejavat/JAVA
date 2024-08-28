package reservation;

interface reservation_cost{
    public void total_fare(Passenger[] passengers);
}


public class fareUtil implements reservation_cost{
    public void total_fare(Passenger[] passengers){
        double sm=0;
        for(int i=0;i<passengers.length;i++){
            sm+=passengers[i].total_fare();
        }
        System.out.println("total amount "+sm);
    }
}
