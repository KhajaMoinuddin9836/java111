package com.Ques3;

public class Ticket {

    private int ticketid;
    private int price;
    private int availableTickets;

    public Ticket() {
        super();
    }
    public int calculateTicketCost(int nooftickets) {

        if(availableTickets>0 && availableTickets>nooftickets)
        {
            int AvlT=availableTickets-nooftickets;
            availableTickets=AvlT;
            int amount=nooftickets*price;
            return amount;
        }
        return -1;
    }
    public int getTicketid() {
        return ticketid;
    }
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public int getAvailableTickets() {
        return availableTickets;
    }

    public void setAvailableTickets(int availableTickets) {
        this.availableTickets = availableTickets;
    }
}
