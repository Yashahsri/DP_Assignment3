package question_17;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;
public class Failsafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<Integer>(new Integer[] { 1, 3, 5, 8 });
    Iterator itr1 = list.iterator();
    while (itr1.hasNext()) {
        Integer no = (Integer)itr1.next();
        System.out.println(no);
        if (no == 5)

            list.add(14);
    }
}
}


