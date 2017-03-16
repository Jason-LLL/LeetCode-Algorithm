import java.util.Scanner;
public class Main{
    public  static void main(String[] args)
        {
       Scanner sc =new Scanner(System.in);
        Main main =new Main();
        while(sc.hasNext())
            {
            int num = sc.nextInt();
            if(num==0) break;
            System.out.println(main.waterBottle(num));       
            }
        }
  public  int waterBottle(int n)
   {
      int res=0;
      while(n/3>0)
          {
          res=res+n/3;
          n=n/3+n%3;
      }
      return res=n==2?res+1:res;
  }
   /* {
     Scanner sc = new Scanner(System.in);
    while(sc.hasNext())
        {
        int num = sc.nextInt();
            if(num==0) break;
            int left = num;
            int total = 0;
            while(left!=0){
                if(left==2){
                    total+=1;
                    break;
                }else if(left==1){
                    break;
                }else{
                    int curr = left/3;
                    total+=curr;
                    left = left-curr*3+curr;
                }
            }
            System.out.println(total);
    }*/
}