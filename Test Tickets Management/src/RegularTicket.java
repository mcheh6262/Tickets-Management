public class RegularTicket extends Ticket{
    public RegularTicket(Show show, int rowNumber, int seatNumber, Customer ticketCustomer, double ticketPrice) {
        super(show, rowNumber, seatNumber, ticketCustomer, ticketPrice);
    }

    @Override
    public double calculateTicketPrice() throws Exception {
        return this.getTicketPrice();
    }



}
