/* Access Modifiers/Access Specifiers */

public class Second{
    BankAccount myAcc=new BankAccount();
    myAcc.UseName="Shourya Shri";
    myAcc.setPassword("abcdefgh");
}
class BankAccount{
    public String UseName;
    private String Password;
    public void setPassword(String pwd){
        password=pwd;      //Accessible
    }
}