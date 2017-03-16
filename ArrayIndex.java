public class Main{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int n = sc.nextInt();
			Queue<Integer> q = new LinkedList<Integer>();
			for (int i=0;i<n;i++)
			{
               q.offer(i);
			}
			int count =0;
			while(q.size()!=1)
			{
				if(count!=2)
				{
					int tem = q.peek();
				q.poll();
				q.offer(temp);
				count++;
			   }
			   else
			   {
			   	q.poll();
			   	count=0;
			   }
			}
			System.out.println(q.peek());
		}
	}
}
---------------------
import java.util.*;
 
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n > 1000) {
                n = 999;
            }
            List<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(i);
            }
            int i = 0;
            while (list.size() > 1) {
                i = (i + 2) % list.size();
                list.remove(i);
            }
            System.out.println(list.get(0));
        }
    }
}
