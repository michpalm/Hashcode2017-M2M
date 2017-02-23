import java.util.HashMap;

public class Video {
    int num;
    int size;
    HashMap<Integer,Integer> request = new HashMap<>();

    public Video(int num, int size) {
	this.num = num;
	this.size = size;

    }

    public void add_request(int endpoint, int request){
	    request.put(endpoint, request);
    }
}
