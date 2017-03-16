import java.util.Scanner;
public class Main{
    public static void  main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
            {
            String s = sc.nextLine();
            //int  t = Integer.parseInt(s.substring(2),16);
            Integer t= Integer.valueOf(s.substring(2),16);
            System.out.println(t);
        }
}
}