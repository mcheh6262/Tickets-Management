public class VipTicket extends Ticket{
    public VipTicket(Show show, int rowNumber, int seatNumber, Customer ticketCustomer, double ticketPrice) {
        super(show, rowNumber, seatNumber, ticketCustomer, ticketPrice);
        try {
            this.setTicketPrice(calculateTicketPrice());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public double calculateTicketPrice() throws Exception {

        if (this.getTicketCustomer().getCustomerType() == CustomerType.VIP) {
            return this.getTicketPrice() - this.getTicketPrice() * getTicketCustomer().getCustomerDiscount() / 100;
        }else {
            throw new Exception("Not a vip customer, but exception was caught");
        }
    }
}
