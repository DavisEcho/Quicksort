import java.io.*;
import java.util.*;

public class gen {
    public static void main(String[] args) {

	Random ran = new Random();

	for (int i = 0; i < 10000; i++) {
	    System.out.println(ran.nextInt(1000));
	}
    }
}