import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {


    public static void main(String[] args) {
        int[] tab = {2,7,5,1};
        Arrays.sort(tab);

        System.out.println(Arrays.toString(tab));

    }

//    public static BigInteger getFactorial(int f) {
//        if (f < 2) {
//            return BigInteger.valueOf(1);
//        }
//        else {
//            return IntStream.rangeClosed(2, f).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply).get();
//        }
//    }

}
