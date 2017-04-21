public void sort(int[] a,int low,int high)
{
    int start = low;
    int end = high;
    int key=a[low];

    //从后往前找
    while(end>start)
    {
    	while(end>start&& key<=a[end])
     end--;
     if(key>a[end])
     {
     	int temp1= a[end];
     	a[end]=a[start];
     	a[start]=temp;
     }
      //从前往后找
     while(end>start&& key>=a[start])
     	start++;
     if(a[start]>key)
     {
     	int temp2=a[start];
     	a[start]=a[end];
        a[end]=temp2;
     }
 }
     //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
    if(start>low) sort(a,low,start-1);//左边序列。第一个索引位置到关键值索引-1
    if(end<high) sort(a,end+1,high);//右边序列。从关键值索引+1到最后一个
}
