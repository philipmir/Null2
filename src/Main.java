import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle(3.0, 4.0);
        Rectangle rec2 = new Rectangle(3.0, 4.0);
        Rectangle rec3 = new Rectangle(3.0, 4.0);
        Rectangle rec4 = new Rectangle(3.0, 4.0);

        rec3 = null;
        ArrayList<Rectangle> recList = new ArrayList<>();

        recList.add(rec);
        recList.add(rec2);
        recList.add(rec3);
        recList.add(rec4);

        for(Rectangle rectangle : recList)  {
            if (rectangle != null) {
                System.out.println(rectangle.getHeight());

            }


        }





    }
}