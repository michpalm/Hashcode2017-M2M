import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;


public static int NO_OF_VIDEO;
public static int NO_OF_ENDPOINT;
public static int NO_OF_SERVER;
public static int SERVER_CAPACITY;
public static Video[] videos;
public static Endpoint[] endpoints;



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
	    NO_OF_VIDEO = Arguments[0];
	    NO_OF_ENDPOINT = Arguments[1];
	    NO_OF_SERVER = Arguments[2];
	    SERVER_CAPACITY = Arguments[4];
	    videos = new Video[NO_OF_VIDEO];

	    String Line1 = br.readLine();
	    Arguments = Arrays.asList(line1.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
	    for(int i = 0; i<NO_OF_VIDEO ; i++){
		videos[i] = new Video(i,Arguments[i]);
	    }

	    endpoints = new Endpoint[NO_OF_ENDPOINT];
	    for(int i = 0; i<NO_OF_ENDPOINT; i++){
		String line = br.readLine();
		Arguments = Arrays.asList(line.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		endpoints[i] = new Endpoint(Arguments[0], Arguments[1]);
		for(int j = 0; j< Arguments[i] ; j++){
		    line = br.readLine();
		    int[] info = Arrays.asList(line.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		    Endpoint[i].add(info[0],info[1]);
		}
		    
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

    public static class Endfile{

	int distance_to_datacenter;
	HashMap<Integer,Integer> cache_point;

	public Endfile(int distance,int no_of_cache){
	    distance_to_datacenter = distance;
	    cache_point = new HashMap(no_of_cache);
	}

	public void add(int cache, int latency){
	    cache_point = put(cache, distance_to_datacenter-latency);
	}
}
