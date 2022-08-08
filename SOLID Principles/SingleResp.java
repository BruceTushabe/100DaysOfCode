import lombok.Data;

public class SingleResp{
    public static void main(String[] args){

    }
}

class ProductService {
    public void addProduct(){
        System.out.println("add a product logic..");

    }
    public Product getProduct(){
        return null;
    }

    public Product getProductbyID(Long id){
        return null;
    }

    public void sendSMS(){
        System.out.println("sms sent");
    }

    public void sendEmail(){
        System.out.println("Email sent");
    }
}

@Data
@AllArgsConstructor

class Product{
    private String name;
}