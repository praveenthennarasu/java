import java.util.*;
class data{
	int array[] = new int[7];
	Scanner sc = new Scanner(System.in);
	void getInput(){
	 int i;
	 System.out.println("Enter numbers:");
	 for(i=0;i<array.length;i++) array[i] = sc.nextInt();
	}
	void swap(int i, int j){
	 int temp;
	 temp = array[i];
	 array[i] = array[j];
	 array[j] = temp;
	}
}
class selectionSort{
	public static void main(String args[]){
		int i,j,min;
		data ob = new data();
		ob.getInput();
		for(i=0;i<ob.array.length-1;i++){
			min = i;
			for(j=i+1;j<ob.array.length;j++) if(ob.array[j]<ob.array[min]) min = j;
			ob.swap(i,min);
		}
		for(i=0;i<ob.array.length;i++)
			System.out.print(ob.array[i]+" ");
	}
}