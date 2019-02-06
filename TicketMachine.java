/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2008.03.30
 */
class TicketMachine
{
    // The price of a ticket from this machine.
     private int  price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int total;

    /**
     * Create a machine that issues tickets of the given price.
     * Note that the price must be greater than zero, and there
     * are no checks to ensure this.
     */
    public TicketMachine(int ticketCost)
    {
        price = ticketCost;
        balance = 0;
        total = 0;
    }
    
    public TicketMachine()
    {
        price = 500;
        balance = 0;
        total = 0;
    }

    /**
     * Return the price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return the amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }
    
    public int getTotal()
    {
        return total;
        
    }

    /**
     * Receive an amount of money in cents from a customer.
     */
    public void insertMoney(int amount)
    {
        balance = balance + amount;
    }

    /**
     * Print a ticket.
     * Update the total collected and
     * reduce the balance to zero.
     */
    public void printTicket()
    {
        int amountLeftToPay = price - balance;
        if(amountLeftToPay <= 0){
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();
        
    
            // Update the total collected with the balance.
            total = total + price;
            // Clear the balance.
            balance = balance - price;
        }
        else{
            System.out.println(" You still need "+ amountLeftToPay + " more cents");
        }
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    public void empty()
    {
        total = 0;
    }
    
    public void prompt()
    {
        System.out.println("Please insert the correct amount of money.");
    }
    
    public void showPrice()
    {
        System.out.printf("The price of a ticket is %d cents.\n", price);
    }
    
    public String getLoginName() {
        String name = "aswathy";
        String id = "098";
        int nameEndLength = (name.length() > 4 ) ? 4 : name.length();
        int idEndLength = (id.length() > 3) ? 3 : id.length();
        return name.substring(0,nameEndLength) + id.substring(0,idEndLength);
    }
}

