import java.util.HashMap;

public class videoInfo {
  int num;
  int size;
  HashMap<Integer,Integer> request = new HashMap<>();

  public void videoInfo(int num, int size, HashMap<Integer,Integer> request) {
    this.num = num;
    this.size = size;
    this.request = request;
  }


}