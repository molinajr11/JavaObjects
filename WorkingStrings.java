import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class WorkingStrings {
    public static void main(String[] args) {
        String text= "piensa en grande se Grande " ;
        String text2 = "provando arrays ";
        Function<String, String> stringStringFunction = (String upercase) -> upercase.substring(0, 1).toUpperCase() + upercase.substring(1);
        System.out.println("stringStringFunction.apply(text)); = " + stringStringFunction.apply(text));
        System.out.println("stringStringFunction.apply(text)); = " + stringStringFunction.apply(text2));
    }
}

