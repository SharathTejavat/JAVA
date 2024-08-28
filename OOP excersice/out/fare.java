import reservation.fareUtil;
import reservation.Passenger;


class children extends Passenger{
    public children(String name,int p) {
        super(name,p);
    }

    public double total_fare(){
        return 0;
    }
}

class students  extends Passenger{
    public students(String name,int p) {
        super(name,p);
    }

    public double total_fare(){
        return price*0.7;
    }
}

class citizens  extends Passenger{
    public citizens(String name,int p) {
        super(name,p);
    }

    public double total_fare(){
        return price*0.5;
    }
}

class seniorcitizens  extends Passenger{
    public seniorcitizens(String name,int p) {
        super(name,p);
    }

    public double total_fare(){
        return price;
    }
}

public class fare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Passenger ps[] = new Passenger[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter passenger name for passenger " + (i + 1) + ": ");
            String name = scanner.nextLine();
            System.out.println("Enter price for passenger " + (i + 1) + ": ");
            int price = scanner.nextInt();
            scanner.nextLine(); 
            System.out.println("Choose passenger type (children, students, citizens, seniorcitizens) for passenger " + (i + 1) + ": ");
            String type = scanner.nextLine().toLowerCase();
            switch (type) {
                case "children":
                    ps[i] = new children(name, price);
                    break;
                case "students":
                    ps[i] = new students(name, price);
                    break;
                case "citizens":
                    ps[i] = new citizens(name, price);
                    break;
                case "seniorcitizens":
                    ps[i] = new seniorcitizens(name, price);
                    break;
                default:
                    System.out.println("Invalid passenger type. Using default (children).");
                    ps[i] = new children(name, price);
                    break;
            }
        }
        fareUtil fare = new fareUtil();
        fare.total_fare(ps);

    }
}
