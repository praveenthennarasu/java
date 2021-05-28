class data{
	int array[] = {0,3,2,1,4,7,5,6,9,8};
	void swap(int i, int j){
		array[i] = array[i]+array[j];
		array[j] = array[i]-array[j];
		array[i] = array[i]-array[j];
	}
}

class bubbleSort{
	public static void main(String args[]){
		data ob = new data();
		int i,j;
		for(i=0;i<ob.array.length;i++) System.out.print(ob.array[i]+" ");
		System.out.println();
		for(i=0;i<ob.array.length-1;i++)
		 for(j=0;j<ob.array.length-1-i;j++)
		  if(ob.array[j+1]<ob.array[j]) ob.swap(j+1,j);	
		for(i=0;i<ob.array.length;i++) System.out.print(ob.array[i]+" ");
	}
}