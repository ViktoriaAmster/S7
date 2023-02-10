import java.util.TreeMap;
public class program {

    public static void main(String[] args) {
        MySet likeSet = new MySet();
        likeSet.add(1);
        likeSet.add(17);
        likeSet.add(12);
        likeSet.add(17);
        likeSet.add(3);
        System.out.println(likeSet.add(12));
        System.out.println(likeSet.add(5));
        System.out.println(likeSet.toString());
        System.out.println(likeSet.get(3));
    }
}

class MySet {
    private TreeMap<Integer, Object> map = new TreeMap<>();
    private final Object OBJ = new Object();

    public boolean add(int i) {
        if (map.keySet().contains(i)) {
            return false;
        } else {
            map.putIfAbsent(i, OBJ);
            return true;
        }
    }

    public String toString() {
        return map.keySet().toString();
    }

    public Integer get(Integer i) {
        if (i < map.keySet().toArray().length) {
            return (Integer) map.keySet().toArray()[i];
        } else return null;
    }
}
