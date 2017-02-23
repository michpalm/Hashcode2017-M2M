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

    public static int NO_OF_VIDEO;
    public static int NO_OF_ENDPOINT;
    public static int NO_OF_SERVER;
    public static int SERVER_CAPACITY;
    public static Video[] videos;

    public static void stream_input(String file_path){
      try{
        BufferedReader br = new BufferedReader(new FileReader(file_path));
        String firstLine = br.readLine(); //reading the first line

        // Get four arguments (int)

        int[] Arguments = Arrays.asList(firstLine.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
        NO_OF_VIDEO = Arguments[0];
        NO_OF_ENDPOINT = Arguments[1];
        NO_OF_SERVER = Arguments[2];
        SERVER_CAPACITY = Arguments[4];
        videos = new Video[NO_OF_VIDEO];


  String rest = br.readLine();
	Arguments = Arrays.asList(rest.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	for(int i = 0; i<NO_OF_VIDEO ; i++){
	    videos[i] = new Video(i,Arguments[i]);
	}
	
      //do operations to everyline after line 1 here
        while((rest = br.readLine()) != null){
          System.out.println("undecided");
        }

        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }

       }
}
