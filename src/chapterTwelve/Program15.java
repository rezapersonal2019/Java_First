package chapterTwelve;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;

public class Program15 {
	
	public static void main(String[] args) throws IOException {
        File file = new File("MyFrients.txt");
        if (file.exists()) {
            System.out.println("File already exists");
            System.exit(1);
        }


    PrintWriter output = new PrintWriter("Exercise12_15.txt");

    int[] array = new int[100];
    Random random = new Random();

    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100) + 1;
    

    System.out.println(" Random number are: " + array[i]);
    }
    Arrays.sort(array);
    output.print(Arrays.toString(array));
    
    output.close();
    System.out.println("Data written to the file.");
}

}
