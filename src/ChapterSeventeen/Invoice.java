package ChapterSeventeen;

public class Invoice {
    private int partNumber;
    private String partDescription;
    private int quantity;
    private double price;

    public Invoice(int partNumber, String partDescription, int quantity,int price) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price=price;
    }


    public int getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(int partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
public double getPrice(){
        return price;
}
    public double invoice() {
        return getQuantity()*getPartNumber();
    }



    @Override
    public String toString() {
        return String.format("%-8d %-8s %8d %8.2f",
              getPartNumber(), getPartDescription(), getQuantity(), getPrice());
    }

}