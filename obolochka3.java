package Practice3;
import java.lang.*;
public class obolochka3 {
    public static void main(String []args){
        Double obj = new Double("25.25");
        int intVal = obj.intValue();
        System.out.println(intVal);
        byte byteVal = obj.byteValue();
        System.out.println(byteVal);
        short shortVal = obj.shortValue();
        System.out.println(shortVal);
        float floatVal = obj.floatValue();
        System.out.println(floatVal);
        double doubleVal = obj.doubleValue();
        System.out.println(doubleVal);
    }
}
