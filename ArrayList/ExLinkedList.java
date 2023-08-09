package ArrayList;
import java.util.*;

public class ExLinkedList {
    public static void main(String[] args) {
        //criar lista do linked list
        LinkedList<String> flores = new LinkedList<>();
        flores.add("rosas"); 
        flores.addFirst("magarida"); 
        flores.add("rosas negras"); 
        System.out.println(flores.getFirst());
        System.out.println(flores.getLast());
    
    }
}
