import java.util.Arrays;
import java.util.List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

public class invoice {
    PDDocument invc;

    int n;
    Integer total = 0;
    Integer price;
    String CustName;
    String CustPh;
    List<String> ProductName = new ArrayList<String>();
    List<Integer> ProductPrice = new ArrayList<Integer>();
    List<Integer> ProductQty = new ArrayList<Integer>();

    String InvoiceTitle = new String("Kisoboka Africa");
    String SubTitle = new String("Invoice");

    // Using a constructor to create a blank pdf invoice

    invoice() {
        // Create document

        invc = new Document();
        // Create a blank page
        PDPage newpage = new PDPage();
        // Add the blank page
        invc.addPage(newpage);

    }

    // getdata() method is used to get the customer information

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name: ");

        CustName = sc.nextLine();
        
        System.out.println("Enter the Customer Phone Number: ");
        CustPh = sc.next();

        System.out.println("Enter the number of products: ");
        n = sc.nextInt();

        System.out.println();

        for(int i=0; i<n; i++){
            System.out.println("Enter the product name: ");
            ProductName.add(sc.next());
            System.out.println("Enter the price of the product: ");
            ProductPrice.add(sc.nextInt());
            System.out.println("Enter the quantity of the product: ");
            ProductQty.add(sc.nextInt());
            System.out.println();

            // calculating the total amount

            total = total + (ProductPrice.get(i)*ProductQty.get(i));

        }
    }

    void WriteInvoice(){
        // get the page

        PDPage mypage = invc.getPage(0);

        try{
            // Prepare content stream

            PDPageContentStream cs = new PDPageContentStream(invc, mypage);

            // writing single line text
            // writing invoice title

            cs.beginText();
            
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
      
            cs.setLeading(20f);
            cs.newLineAtOffset(60, 610);
            cs.showText("Customer Name: ");
            cs.newLine();
            cs.showText("Phone Number: ");
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
            cs.setLeading(20f);
            cs.newLineAtOffset(170, 610);
            cs.showText(CustName);
            cs.newLine();
            cs.showText(CustPh);
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
            cs.newLineAtOffset(80, 540);
            cs.showText("Product Name");
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
            cs.newLineAtOffset(200, 540);
            cs.showText("Unit Price");
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
            cs.newLineAtOffset(310, 540);
            cs.showText("Quantity");
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
            cs.newLineAtOffset(410, 540);
            cs.showText("Price");
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 12);
            cs.setLeading(20f);
            cs.newLineAtOffset(80, 520);
            for(int i =0; i<n; i++) {
              cs.showText(ProductName.get(i));
              cs.newLine();
            }
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 12);
            cs.setLeading(20f);
            cs.newLineAtOffset(200, 520);
            for(int i =0; i<n; i++) {
              cs.showText(ProductPrice.get(i).toString());
              cs.newLine();
            }
            cs.endText();
            
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 12);
            cs.setLeading(20f);
            cs.newLineAtOffset(310, 520);

            for(int i =0; i<n; i++) {
                price = ProductPrice.get(i)*ProductQty.get(i);
                cs.showText(price.toString());
                cs.newLine();
              }
            cs.endText();
              
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
            cs.newLineAtOffset(310, (500-(20*n)));
            cs.showText("Total: ");
            cs.endText();
            cs.beginText();
            cs.setFont(PDType1Font.TIMES_ROMAN, 14);
            //Calculating where total is to be written using number of products
            cs.newLineAtOffset(410, (500-(20*n)));
            cs.showText(total.toString());
            cs.endText();
            
            //Close the content stream
            cs.close();
            //Save the PDF
            invc.save(String FilePath);
            
          } catch (IOException e) {
            e.printStackTrace();
          }


          public static void main(String args[]) {

            invoice i = new invoice();
            i.getdata();
            i.WriteInvoice();
            System.out.println("Invoice Generated!");

          }
        
        }
        
      
        }




}