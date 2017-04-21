// 归并两个有序的数列
void mergearray(int[] a,int first, int mid,int last,int [] temp)
{
	int i=first， j=mid+1;
	int m=mid, n=last;
	int k=0;
	while(i<=m&&j<=n)
	{
		if(a[i]<=a[j])
			temp[k++]=a[i++];
		else
            temp[k++]=a[j++];
	}
       while(i<m)
       {
       	temp[k++]=a[i++];
       }
       while(j<n)
       {
       	temp[k++]=a[j++];
       }

       for(int z=0;z<k;z++)
       {
       	a[first+z]=temp[z];
       }
}


//分解递归部分
void mergesort(int [] a,int first,int last,int [] temp)
{
	int mid=(first+last)/2;
	mergesort(a,first,mid,temp);
	mergesort(a,mid+1,last,temp);
	mergearray(a,first,mid,last,temp);
}