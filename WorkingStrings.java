import java.io.FileNotFoundException;
import java.util.*;
import java.util.function.Function;

public class WorkingStrings {
    public static void main(String[] args) {
        String text= "piensa en grande se Grande " ;
        String text2 = "provando arrays ";
        Function<String, String> stringStringFunction = (String upercase) -> upercase.substring(0, 1).toUpperCase()
                + upercase.substring(1);
        System.out.println("stringStringFunction.apply(text)); = " + stringStringFunction.apply(text));
        System.out.println("stringStringFunction.apply(text)); = " + stringStringFunction.apply(text2));

        List<String> nombres = new ArrayList<>();
        nombres.add("Super Mario");
        nombres.add("Yoshi");
        nombres.add("Donkey Kong");
        nombres.add("Peachman");
        nombres.add("lugi");
        nombres.add("ando");
        nombres.add("super Mario");

        List <Double> numbers= new ArrayList();
        numbers.add(1.0);
        numbers.add(10.0);
        numbers.add(3.0);
        numbers.add(2.0);
        numbers.add(6.0);
        numbers.add(13.6);
        numbers.add(12.3);

        Optional<Double> max = numbers
                .stream()
                .max(Double::compareTo);
        System.out.println("max = " + max.get());
        try {
            nombres.stream().sorted(String::compareToIgnoreCase).forEach(System.out::println);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }

    public void validateAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }

    public void openFile() throws FileNotFoundException {
        // Código que puede lanzar una FileNotFoundException
    }
    public class StockInsuficienteException extends Exception {

        public StockInsuficienteException (String msg) {
            super(msg);
        }

    }
    public void RealizaCompra(Producto producto) throws StockInsuficienteException {
        //otras instrucciones aquí..
        if (producto.totalDeProdutosEnStock < 0) {
            throw new StockInsuficienteException("Stock insuficiente");
        }
    }

}

