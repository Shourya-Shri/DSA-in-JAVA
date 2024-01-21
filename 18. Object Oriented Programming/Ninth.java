//Interface

public class Ninth{
    public static void main(String args[]){
        Queen q=new Queen();
        q.moves();
    }
}
interface chessPlayer{
    void moves();
}
class Queen implements chessPlayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("Up,Down,Left,Right");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up,donw,left,right,diagonal");
    }
}

/* Other concept-- SUPER KEY:-
                    It is a keyword used to refer immediate parent class of objects.
 */