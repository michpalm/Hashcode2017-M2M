import java.util.HashMap;

public class Video {
  int num;
  int size;
  HashMap<Integer,Integer> request = new HashMap<>();

  public Video(int num, int size, HashMap<Integer,Integer> request) {
    this.num = num;
    this.size = size;
    this.request = request;
  }
}
