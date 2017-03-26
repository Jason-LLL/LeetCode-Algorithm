public class Solution {
    public int JumpFloorII(int target) {
        //1.是用递归
      /*
      if(target<=0) return -1;
        else
         if(target==1) return 1;
        else
            return 2*JumpFloorII(target-1);
        
    }*/
        int jumpflo=1;
        while(--target>=1)
            {
            jumpflo=jumpflo*2;
        }
        return jumpflo;
}
}