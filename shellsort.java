public void shellSort(int[] a,int n)
{
   int j;
   for(int gap=n/2;gap>0;gap/=2)
   {
   	   for(int i=gap; i<a.length;i++)

   	   {
   	   	int temp=a[i];
   	   	for(j=i;j>=gap&&temp<a[j-gap];j-=gap)
   	   		a[j]=a[j-gap];
   	   		a[j]=temp;
   	   }
   }
}