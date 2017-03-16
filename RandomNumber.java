import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
public class Main{
    public static void main(String[] args)
        {
        Scanner sc =new Scanner(System.in);
        while(sc.hasNext())
         {
        int num = sc.nextInt();
        TreeSet<Integer> set  = new TreeSet<Integer>();
        for(int i=0;i<num;i++)
            {
            set.add(sc.nextInt());
        }
           Iterator it = set.iterator();
            while(it.hasNext())
                {
                System.out.println(it.next());
            }
        }
}
}