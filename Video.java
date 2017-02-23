import java.util.HashMap;

public class Video {
    int num;
    int size;
    HashMap<Integer,Integer> requests = new HashMap<>();

    public Video(int num, int size) {
	this.num = num;
	this.size = size;

    }

    public void add_request(int endpoint, int request){
<<<<<<< HEAD
	requests.put(endpoint, request);
=======
	    request.put(endpoint, request);
>>>>>>> 1bd26d083e1114d655a4ea8428c39ff0350a337a
    }
}
