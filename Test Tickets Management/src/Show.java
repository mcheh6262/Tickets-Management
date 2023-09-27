import java.time.LocalDate;
import java.util.ArrayList;

public class Show {
    private static int counter = 1;
    private int id;
    private String showName;
    private LocalDate showDate;
    private ArrayList<Ticket>listOfShowTicket;

    public Show(String showName, LocalDate showDate) {
        this.id = counter++;
        this.showName = showName;
        this.showDate = LocalDate.now();
        this.listOfShowTicket = new ArrayList<Ticket>();
    }

    public int getId() {
        return id;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }

    public LocalDate getShowDate() {
        return showDate;
    }

    public void setShowDate(LocalDate showDate) {
        this.showDate = showDate;
    }

    public ArrayList<Ticket> getListOfShowTicket() {
        return listOfShowTicket;
    }

    public void setListOfShowTicket(ArrayList<Ticket> listOfShowTicket) {
        this.listOfShowTicket = listOfShowTicket;
    }
    public void addTickets(Ticket ticket) {
        this.listOfShowTicket.add(ticket);
    }
    public void removeTickets(Ticket ticket) {
        this.listOfShowTicket.remove(ticket);
    }

    public void sumTickets() {
        double sum = 0;
        for (Ticket ticket : this.getListOfShowTicket()){
            sum += ticket.getTicketPrice();
        }
    }


}
