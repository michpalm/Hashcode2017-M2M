import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;


public class hash2017 {
    public static void main(String[] args){
        System.out.println("Hello Hashcode");
        String file_path = "input/me_at_the_zoo.in";

        stream_input(file_path);
    }

    public static void stream_input(String file_path){
      try{
        BufferedReader br = new BufferedReader(new FileReader(file_path));
        String line1 = br.readLine(); //reading the first line

        // Get four arguments (int)

        int[] Arguments = Arrays.asList(line1.split(" ")).stream().mapToInt(Integer::parseInt).toArray();

        System.out.println("Arguments is here:  " + line1);
        for (int i = 0; i < Arguments.length ;i++ ) {
          System.out.println(i +": "+Arguments[i]);
        }
        while((line = br.readLine()) != null){
          System.out.println("undecided");
          }

        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }

        }
}

 class videoInfo {
  int videoName;
  int size;
  HashMap<Integer,Integer> request = new HashMap<>();
}
