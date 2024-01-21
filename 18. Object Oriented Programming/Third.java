// Get: To return the value.
// Set: To modify the value.
//this: this keyword is used to refer to the current object.

public class Third{

}
class Pen{
    private String color;
    private int tip;

        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
        void setColor(String newcolor){
            this.color=newcolor;
        }
        void SetTip(int newTip){
            this.tip=newTip;    //It will be more usefull when variables have same names.
        }                       /* void setTip(int tip){
                                        this.tip=tip;
                                 } */
}