import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Show show1 = new Show("chen", LocalDate.now());
        Customer c1 = new Customer("tom","levi", "@@", "Tel_Aviv",CustomerType.VIP, 10);
        Customer c2 = new Customer("tomer","cohen", "@@", "Yavne",CustomerType.REGULAR, null);
        VipTicket v1 = new VipTicket(show1, 5,2,c1,100);

        System.out.println(v1.getTicketPrice());

        ArrayList<Ticket> listTicket = new ArrayList<>();
        listTicket.add(v1);
        System.out.println(listTicket);
        System.out.println("---");
        listTicket.remove(v1);
        System.out.println(listTicket);




    }
}