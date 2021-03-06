import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;


public class hash2017 {
    public static int NO_OF_VIDEO;
    public static int NO_OF_ENDPOINT;
    public static int NO_OF_SERVER;
    public static int SERVER_CAPACITY;
    public static Video[] videos;
    public static Endpoint[] endpoints;

    public static void main(String[] args){
        System.out.println("Hello Hashcode");
        String file_path = "input/me_at_the_zoo.in";

        stream_input(file_path);
    }



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
	    for(int k = 0; k<NO_OF_VIDEO ; k++){
		if (Arguments[k] > SERVER_CAPACITY) {
		    //to filter out big videos
		    videos[k] = null;

		}else{
		    videos[k] = new Video(k,Arguments[k]);

		}
	    }
		
	    endpoints = new Endpoint[NO_OF_ENDPOINT];
	    for(int i = 0; i<NO_OF_ENDPOINT; i++){
		String line = br.readLine();
		Arguments = Arrays.asList(line.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		endpoints[i] = new Endpoint(Arguments[0], Arguments[1]);
		for(int j = 0; j< Arguments[1] ; j++){
		    line = br.readLine();

		    int[] info = Arrays.asList(line.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		    endpoints[i].add(info[0],info[1]);
		}

	    }



	    while((rest = br.readLine()) !=null){
		Arguments = Arrays.asList(rest.split(" ")).stream().mapToInt(Integer::parseInt).toArray();
		videos[Arguments[0]].add_request(Arguments[1],Arguments[2]);
		endpoints[Arguments[1]].add_request(Arguments[0],Arguments[2]);
	    }


	    //Handle Dead request
	    //for loop
	    for (int a = 0;a<videos.length ;a++ ) {
		if (videos[a].requests.isEmpty()){
		    videos[a] = null;
		}
	    }
	

	} catch (FileNotFoundException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}

    }


    public static class Endpoint{

	public int distance_to_datacenter;
	public HashMap<Integer,Integer> cache_point;
	public HashMap<Integer,Integer> requests;

	public Endpoint(int distance,int no_of_cache){
	    distance_to_datacenter = distance;
	    cache_point = new HashMap(no_of_cache);
	    requests = new HashMap();
	}

	public void add(int cache, int latency){
	    cache_point.put(cache, distance_to_datacenter-latency);
	}

	public void add_request(int video_num, int request){
	    requests.put(video_num, request);
	}
    }
}
