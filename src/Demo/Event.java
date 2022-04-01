package Demo;

public class Event {

  private String description;
  private int nrOfTickets;
  private int ticketPrice;


  Event (String description, int nrOfTickets, int ticketPrice){
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setNrOfTickets(int nrOfTickets) {
    this.nrOfTickets = nrOfTickets;
  }

  public void setTicketPrice(int ticketPrice) {
    this.ticketPrice = ticketPrice;
  }

  public String getDescription() {
    return description;
  }

  public int getNrOfTickets() {
    return nrOfTickets;
  }

  public int getTicketPrice() {
    return ticketPrice;
  }

  Event test = new Event("Testing Somthing", 1, 200);
 // Event test2 = new Event();

  //public Event getTest() {
    ///return test;
 // }


  @Override
  public String toString() {
    return "Event{" +
        "description='" + description + '\'' +
        ", nrOfTickets=" + nrOfTickets +
        ", ticketPrice=" + ticketPrice +
        '}';
  }
}
