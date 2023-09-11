import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class StringBuilder {
    public static void main(String[] args) {
        List<String> stringList =  Arrays.asList("white", "grey", "red");
        stringList.sort((s1, t1) -> s1.compareTo(t1));
        System.out.println(stringList);


    }
}