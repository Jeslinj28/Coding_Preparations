import java.util.Scanner;
public class Array_Practice_Programs {

	public static void main(String[] args) {
		Array_Practice_Programs ar = new Array_Practice_Programs();
		/*
		 *  1) Array Declaration 
			2) Printing Array
			3) Printing in reverse order
			4) Linear Search
			5) Finding index of given number
			6) Removing given number from an array
			7) Placing given number in last index of given array
			8) how many times a given element is present
			9) Finding biggest no. in given array
			10) Finding smallest no. in given array
			11) Finding first two biggest numbers in a given array
			12) Finding first two smallest numbers in a given array
			13) Finding count of duplicate elements in a given array
			14) Finding addition of odd index numbers in a given array
			15) Moving all elements towards left in a given array
			16) Moving all elements towards left twice in a given array
			17) Moving all elements towards right in a given array
			18) Moving all elements towards right twice in a given array
			19) Copying the given array to another array in reverse order
			20) Addition of two integer arrays
			21) Finding only negative numbers in given array
			22) Copying only the negative numbers in given array - to another array
			23) Copying only the odd indexed numbers in given array - to another array 
			24) Printing values between adjacent two elements in a given array
			25) Removing all the duplicate elements in a given array
			26) Sub Array or not. 
			27) Binary Search
		 */
		// array_getting();
		//ar._2_Array_Printing();
		//ar._3_Reverse_order();
		//ar._4_Linear_Search();
		//ar._5_Finding_Index();
		//ar._6_Removing_number();
		//ar._7_placing_given_number_in_last_index();
		//ar._8_elements_present();
		//ar._9_biggest_number();
		//ar._10_smallest_number();
		//ar._11_First_2_biggest_number();
		//ar._12_First_2_smallest_number();
		//ar._13_Count_duplicates();
		//ar._14_Add_oddIndex_numbers();
		//ar._15_left_Shift();
		//ar._16_leftShift_twice();
		//ar._17_rightShift();
		//ar._18_rightShift_twice();
		//ar._19_Copy_another_array();
		//ar._20_addition_2_integer_array();
		//ar._21_Negative_Numbers();
		//ar._22_Negative_Numbers_to_Array();
		//ar._23_odd_index();
		//ar._24_adjacent_2_elements();//doubt
		//ar._25_removing_duplicate_element();
		//ar._26_SubArray_or_not();
		//ar._27_binary_Search();
		//ar._28_removing_duplicate_element_and_store_in_another_array();
	}


	private static void array_getting() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Your Values: ");
		int Values=sc.nextInt();
		int arr[]=new int[Values];
		System.out.println("Enter your Array Elements: ");
		for(int i =0;i<Values;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("Original Array: ");
		for(int i =0;i<Values;i++) {

			System.out.print(arr[i]+" ");
		}
	}


	private void _2_Array_Printing(){
		int arr[]= {14,16,17,3,2,19};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private void _3_Reverse_order() {
		int arr[]= {14,16,17,3,2,19};
		for(int i=(arr.length-1);i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	private void _4_Linear_Search() {
		int arr[]= {14,16,17,3,2,19};
		int key=20;int i =0;
		while(i<arr.length){
			if(key==arr[i]) {
				System.out.println("Yes , Key is present at ");
				break;
			}
			i++;
		}
		if(i==arr.length) {
			System.out.println("Key is not present");
		}
	}

	private void _5_Finding_Index() {
		int arr[]= {10,20,30,40,50};
		int key=30;
		int i =0;
		while(i<arr.length) {
			if(key==arr[i]) {
				System.out.println("Key is present at "+ i);
				break;
			}
			i++;
		}
		if(i==arr.length) {
			System.out.println("Key is Not present");
		}
	}

	private void _6_Removing_number() {

		int [] arr= {1,2,3,4,5};
		int [] arr1=new int[arr.length];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Remove");
		int no = sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(no!=arr[i])
			{
				arr1[i]=arr[i];
				System.out.print(arr1[i]+" ");
			}
		}

	}

	private void _7_placing_given_number_in_last_index() {
		int [] arr= {1,2,3,4,5};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number To Place At Last Index");
		int no = sc.nextInt();
		arr[arr.length-1]=no;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private void _8_elements_present() {
		int arr[]= {1,3,2,5,2,4,3};
		int key =3;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(key==arr[i]) {
				count++;
			}
		}
		System.out.println("The key is present "+count+" times");
	}

	private void _9_biggest_number() {
		int arr[]= {80,60,40,95,99,2};
		int a=Integer.MIN_VALUE;int i=0;
		while(i<arr.length) {
			if(arr[i]>a) {
				a=arr[i];

			}i++;
		}System.out.println(a);
	}

	private void _10_smallest_number() {
		int arr[]= {18,24,32,55,6,7};
		int small=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(small);
	}

	private void _11_First_2_biggest_number() {
		int arr[]= {10,20,50,70,30,80,90};
		int FirstLargest=Integer.MIN_VALUE;
		int SecondLargest=Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>FirstLargest) {
				SecondLargest=FirstLargest;
				FirstLargest=arr[i];
			}
			else if(arr[i]>SecondLargest) {
				SecondLargest=arr[i];
			}
		}	System.out.println("First largest number: "+FirstLargest+" Second Largest Number: "+SecondLargest);

	}

	private void _12_First_2_smallest_number() {
		int arr[]= {10,20,50,70,30,80,90};
		int FirstSmallest=Integer.MAX_VALUE;
		int SecondSmallest=Integer.MAX_VALUE;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<FirstSmallest) {
				SecondSmallest=FirstSmallest;
				FirstSmallest=arr[i];
			}
			else if(arr[i]<SecondSmallest) {
				SecondSmallest=arr[i];
			}
		}	System.out.println("First smallest number: "+FirstSmallest+" Second smallest Number: "+SecondSmallest);

	}

	private void _13_Count_duplicates() {
		int arr[]= {5,6,6,8,7,8,6,7,7,7};int count=0;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("The no.of.Duplicates in the array is "+count);
	}

	private void _14_Add_oddIndex_numbers() {
		int arr[]= {1,2,3,4,5,6};int j=0;int s=0;
		int arr1[]=new int[arr.length/2];
		for(int i =1;i<arr.length;i+=2) {
			//for(int j =0;j<arr.length/2;j++)                     
			arr1[j]=arr[i];
			j++;
		}
		for(int k=0;k<arr1.length;k++) {
			System.out.print(arr1[k]+" ");
		}
		for(int i =0;i<arr1.length;i++) {

			s=s+arr1[i];
		}
		System.out.println("\nTotal addition of odd indexes in the given sum is "+s);
	}

	private void _15_left_Shift() {
		int arr[]= {12,14,15,17,18};
		int temp=arr[0];
		for(int i =1;i<=arr.length;i++) {
			if(i==arr.length) {
				arr[arr.length-1]=temp;
				break;
			}
			arr[i-1]=arr[i];

		}for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private void _16_leftShift_twice() {
		int arr[]= {12,14,15,17,18};
		int temp=arr[0];
		int temp2=arr[1];
		for(int i =2;i<=arr.length;i++) {
			if(i==arr.length) {
				arr[arr.length-1]=temp2;
				arr[arr.length-2]=temp;
				break;
			}
			arr[i-2]=arr[i];

		}for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private void _17_rightShift() {
		int arr[]= {12,14,15,17,18};
		int temp=arr[arr.length-1];
		for(int i =arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
			arr[0]=temp;
		}
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private void _18_rightShift_twice() {
		int arr[]= {12,14,15,17,18,19};
		int temp2=arr[arr.length-1];
		int temp=arr[arr.length-2];
		for(int i =0;i<=arr.length-1;i++) {
			if(i==arr.length-2) {
				arr[1]=temp2;
				arr[0]=temp;
				break;
			}
			arr[i+2]=arr[i];

		}for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private void _19_Copy_another_array() {
		int arr[]= {2,4,6,7,8};
		int count=arr.length-1;
		int arr1[] = new int [arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[count]=arr[i];
			count--;
		}for(int j=0;j<arr.length;j++) {
			System.out.print(arr1[j]+" ");
		}
	}

	private void _20_addition_2_integer_array() {
		int [] arr1= {1,2,3,4,5};
		int [] arr2= {1,2,3,4,5};
		//int big=arr1.length>arr2.length?arr1.length:arr2.length;
		int [] arr3=new int[arr1.length];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

	private void _21_Negative_Numbers() {
		int arr[]= {-1,7,-4,5,6,-3};
		for(int i =0;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	private void _22_Negative_Numbers_to_Array() {
		int arr[]= {-1,7,-4,5,6,-3};int count=0;int k=0;

		for(int i =0;i<arr.length;i++) {
			if(arr[i]<0) {
				count++;
			}
		}
		int arr1[]=new int [count];
		for(int j=0;j<arr.length;j++) {
			if(arr[j]<0) {
				arr1[k]=arr[j];
				System.out.print(arr1[k]+" ");
				if(k==count)
					break;
				k++;
			}
		}
	}

	private void _23_odd_index() {
		int arr[]= {4,2,5,6,8,9};int count=0;
		int arr1[]= new int[arr.length/2];
		for(int i =1;i<arr.length;i+=2) {
			arr1[count]=arr[i];
			count++;
		}
		for(int j =0;j<arr1.length;j++) {
			System.out.print(arr1[j]+" ");
		}
	}

	private void _24_adjacent_2_elements() {
		int [] a= {1,11,2,15,3,17,4,26,5};
		for(int i=0;i<a.length-2;i++)
		{
			if((a[i]-a[i+2])== 1 )
			{
				System.out.println(a[i+1]);
			}
			else if((a[i]-a[i+2])== -1 )
			{
				System.out.println(a[i+1]);
			}
		}

	}

	private void _25_removing_duplicate_element() {
		int arr[]= {5,6,5,6,7,8,7,9};
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	private void _26_SubArray_or_not() {
		int [] a= {1,2,4,7,5};
		int [] b= {2,4,7};
		int [] c= new int[b.length];
		for(int j=0;j<b.length;j++)
		{
			for(int i=0;i<a.length;i++)
			{
				if(b[j]==a[i])
					c[j]=i;
			}
		}
		int count=0;
		for(int i=0;i<c.length-1;i++)
		{
			if(c[i+1]-c[i]==1)
				count++;
		}
		if(count==c.length-1)
			System.out.println("It is sub array");
		else
			System.out.println("Not a Sub Array");
	}


	private void _27_binary_Search() {
		int[] ar = {10, 20, 30, 34, 56, 78, 89, 90};		// Arrays.sort(ar); 
		//		     0	 1	 2	 3	 4   5   6   7
		int key = 29; 
		int min =0, max = 7; 
		while(min<=max){
			int mid = (min+max)/ 2; 
			if(key == ar[mid])	//100 == 90
			{	System.out.println("Yes, present at "+ mid);
			break;  }
			else if(key>ar[mid])	//100>90
			{	
				min = mid +1; 
			}
			else{
				max = mid - 1; 
			}
		}
		if(min>max)
		{
			System.out.println("Element is not present");
		} 
	}


	private void _28_removing_duplicate_element_and_store_in_another_array() {
		int arr[] = {6,1,2,2,3,4,5,4,5,6,6};
		int validNumberCount = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != -1) {
				for(int j= i+1;j<arr.length;j++) {
					if(arr[i] == arr[j]) {
						arr[j] = -1;
					}
				}
				validNumberCount++;
			}
		}
		int j = 0;
		int out[] = new int[validNumberCount];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != -1) {
				out[j++] = arr[i];
			}
		}
		//Just used this for showing you we can print in before loop itself
		for(int i=0;i<validNumberCount;i++) {
			System.out.print(out[i]+" ");
		}
	}

}
