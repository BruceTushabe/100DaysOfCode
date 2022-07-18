// Polymorphism in action  
// Day 16 of 100 Days of Code 

public class AccountTypes {

    public void AccountPurpose(){
        System.out.println("The account has a specic purpose");
    }
}

class Saving extends AccountTypes {
    public void AccountPurpose(){
        System.out.println("This type account is to encourage saving");
    }

}

class Current extends AccountTypes{
    public void AccountPurpose(){
        System.out.println("This account is mainly for every day transactions.");

    }
}

class Fixed extends AccountTypes {
    public void AccountPurpose(){
        System.out.println("Money in this account is fixed for a period of time");
    }
}