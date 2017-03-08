public class Solution {
    public int maxProfit(int[] prices) {
     /*   int len=prices.length;
        int pronow=0;
      for(int i=0;i<len;i++)
      {
         int db=prices[i];
          for(int j=i;j<len;j++)
          {
             if(prices[j]<db)
             continue;
             else
              {
                  pronow=Math.max(prices[j]-db,pronow);
              }
          }
      }
      return pronow;
    }
    */
    if (prices.length == 0) {
			 return 0 ;
		 }		
		 int max = 0 ;
		 int sofarMin = prices[0] ;
	     for (int i = 0 ; i < prices.length ; ++i) {
	    	 if (prices[i] > sofarMin) {
	    		 max = Math.max(max, prices[i] - sofarMin) ;
	    	 } else{
	    		sofarMin = prices[i];  
	    	 }
	     }	     
	    return  max ;
}
}