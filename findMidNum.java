import java.util.PriorityQueue;
import java.util.Comparator;
public class Solution {
      private int count = 0;//数据流中的数据量
        //优先队列集合实现了堆 默认实现了小根堆
      private PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        //定义大根堆 更改比较方式
        private PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(15,new Comparator<Integer>(){
                                                                         public int compare(Integer o1, Integer o2)
                                                                           {
                                                                               return o2-o1;
                                                                         }
                                                              });
    public void Insert(Integer num) {
      if((count&1)==0)
         {
         //当数据总数是偶数时，进入小根堆
         //(注意不是直接进入小根堆,而是经过大根堆筛选之后取大根堆中足最大的元素进入小根堆)
         //新加入的元素先入到大根堆,由大根堆筛选出堆中最大的元素
         maxHeap.offer(num);
         int filterMaxNum = maxHeap.poll();
         //2 筛选后的最大元素进入小根堆
         minHeap.offer(filterMaxNum);
         }
        else
        {
            // 当数据总数为奇数时，新加入的元素，应当进入大根堆
            // （注意不是直接进入大根堆，而是经小根堆筛选后取小根堆中最大元素进入大根堆）
            // 1.新加入的元素先入到小根堆，由小根堆筛选出堆中最小的元素
            minHeap.offer(num);
            int filteredMinNum = minHeap.poll();
            // 2.筛选后的【小根堆中的最小元素】进入小根堆
            maxHeap.offer(filteredMinNum);
        }
        
        count++;
}
    public Double GetMedian()
        {
        //数目为偶数的时候，中位数为小根堆堆顶元素和大根堆的堆顶的一半
        if((count&1)==0)
            {
            return new Double((minHeap.peek()+maxHeap.peek()))/2;
        }
        else
            {
            return new Double(minHeap.peek());
        }
}
}