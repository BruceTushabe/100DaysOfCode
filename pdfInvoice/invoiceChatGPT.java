import java.util.ArrayList;
import java.util.List;

public class invoiceChatGPT {
  private String invoiceNumber;
  private List<LineItem> lineItems;
  private Customer customer;

  public invoiceChatGPT(String invoiceNumber, Customer customer) {
    this.invoiceNumber = invoiceNumber;
    this.lineItems = new ArrayList<>();
    this.customer = customer;
  }

  public void addLineItem(LineItem lineItem) {
    lineItems.add(lineItem);
  }

  public double getTotalAmount() {
    double totalAmount = 0;
    for (LineItem lineItem : lineItems) {
      totalAmount += lineItem.getPrice() * lineItem.getQuantity();
    }
    return totalAmount;
  }

  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public List<LineItem> getLineItems() {
    return lineItems;
  }

  public Customer getCustomer() {
    return customer;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("Invoice Number: ").append(invoiceNumber).append("\n");
    sb.append("Customer: ").append(customer).append("\n");
    sb.append("Line Items:\n");
    for (LineItem lineItem : lineItems) {
      sb.append(lineItem).append("\n");
    }
    sb.append("Total Amount: ").append(getTotalAmount()).append("\n");
    return sb.toString();
  }
}

class LineItem {
  private String productName;
  private int quantity;
  private double price;

  public LineItem(String productName, int quantity, double price) {
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getProductName() {
    return productName;
  }

  @Override
  public String toString() {
    return productName + " (Quantity: " + quantity + ", Price: " + price + ")";
  }
}

class Customer {
  private String name;
  private String address;

  public Customer(String name, String address) {
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return name + " (" + address + ")";
  }
}
