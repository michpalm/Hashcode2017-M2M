import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class hash2017 {
    public static void main(String[] args){
        System.out.println("Hello Hashcode");
        String file_path = "input/me_at_the_zoo.in";

        stream_input(file_path);
    }

    public static void stream_input(String file_path){
      try{
        BufferedReader br = new BufferedReader(new FileReader(file_path));
        String line;
        String line1 = br.readLine(); //reading the first line

        // Get four arguments (int)
        public int[] Arguments = Arrays.asList(line1.split(" ")).stream().mapToInt(Integer::parseInt).toArray();

        System.out.println("Arguments is here:  " + Arguments);
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

public class videoInfo {
  int videoName;
  int size;
  HashMap<Integer,Integer> request = new HashMap<>();
}
