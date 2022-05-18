import java.util.Scanner;
public class Testing 
{
	public static void main(String[] args) 
	{
		/*
		int key = 24, choice;
		int[] arr = { 15, 12, 22, 24, 30, 34, 65, 67, 77, 98, 0, 27, 13, 6, 2, 88 };
		Scanner scanner = new Scanner(System.in);
		System.out.println("List of Values:");
		printArr(arr);
		System.out.println();
		bubbleSort(arr);
		System.out.println("Sorted List:");
		printArr(arr);
		
		System.out.println("[1] binary or [2] recursive or [3] linear");
		choice = Integer.parseInt(scanner.nextLine());
		switch(choice)
		{
		case 1:
			System.out.println("enter a key to search for");
			key = Integer.parseInt(scanner.nextLine());
			System.out.println(binarySearch(arr, key) == -1 ? "Key not found" : "Key found at: " + (binarySearch(arr, key) + 1));
			break;
		case 2:
			System.out.println("enter a key to search for");
			key = Integer.parseInt(scanner.nextLine());
			System.out.println(recursiveSearch(arr, key, 0, arr.length - 1) == -1 ? "Key not found" : "Key found at: " + (recursiveSearch(arr, key, 0, arr.length - 1) + 1));
			break;
		case 3:
			System.out.println("enter a key to search for");
			key = Integer.parseInt(scanner.nextLine());
			System.out.println(linearSearch(arr, key) == -1 ? "Key not found" : "Key found at: " + (linearSearch(arr, key) + 1));
			break;
		default:
			System.out.println("invalid choice");
			break;
		}
		*/
		
		int iKey;
		String searchSort, searchRoutine, sKey, typeSearch;
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 15, 12, 22, 24, 30, 34, 65, 67, 77, 98, 0, 27, 13, 6, 2, 88 };
		String[] array = { "Hello", "There", "Person", "Plane", "Ready", "Great" };
		System.out.print("Welcome to the searching and sorting algorithm.\nWould you like to search or sort? ");
		searchSort = scanner.nextLine().toLowerCase();
		//Cases for searching v.s. sorting
		switch(searchSort)
		{
		case "search":
			System.out.println("Which searching routine would you like to use?");
			System.out.println("[1]. Linear");
			System.out.println("[2]. Recursive");
			System.out.println("[3]. Binary");
			searchRoutine = scanner.nextLine().toLowerCase();
			//Cases for search routine
			switch(searchRoutine)
			{
			case "linear":
				System.out.println("Would you like to search for a number or a word?");
				typeSearch = scanner.nextLine().toLowerCase();
				//Cases for the type of search (word / number)
				switch(typeSearch)
				{
				case "number":
					System.out.println("Please enter a number to search for.");
					iKey = Integer.parseInt(scanner.nextLine());
					System.out.println(linearSearch(arr, iKey) == -1 ? "Key not found" : "Key found at: " + (linearSearch(arr, iKey) + 1));
					break;
				case "word":
					System.out.println("Please enter a word to search for.");
					sKey = scanner.nextLine();
					System.out.println(linearSearchString(array, sKey) == -1 ? "Key not found" : "Key found at: " + (linearSearchString(array, sKey) + 1));
					break;
				default:
					System.out.println("The choice you have entered [" + typeSearch + "] is invalid.");
				}
				break;
			case "recursive":
				System.out.println("Would you like to search for a number or a word?");
				typeSearch = scanner.nextLine().toLowerCase();
				switch(typeSearch)
				{
				case "number":
					System.out.println("Please enter a number to search for.");
					iKey = Integer.parseInt(scanner.nextLine());
					System.out.println(recursiveSearch(arr, iKey, 0, arr.length - 1) == -1 ? "Key not found" : "Key found at: " + (recursiveSearch(arr, iKey, 0, arr.length - 1) + 1));
					break;
				case "word":
					System.out.println("Please enter a word to search for.");
					sKey = scanner.nextLine();
					System.out.println(recursiveSearchString(array, sKey, 0, arr.length - 1) == -1 ? "Key not found" : "Key found at: " + (recursiveSearchString(array, sKey, 0, array.length - 1) + 1));
					break;
				default:
					System.out.println("The choice you have entered [" + typeSearch + "] is invalid.");
				}
				break;
			case "binary":
				break;
			default:
				System.out.println("The choice you have entered [" + searchRoutine + "] is invalid.");
			}
			break;
		case "sort":
			break;
		default:
			System.out.println("The choice you have entered [" + searchSort + "] is invalid.");
		}
	}
	//Selection Sort
	
	public static void selectionSortDescending(int[] array)
	{
		int num = array.length;
		int maxPos;
		while(num > 1)
		{
			maxPos = 0;
			for(int i = 0; i < num; i++)
			{
				if(array[i] > array[maxPos])
				{
					maxPos = i;
				}
				swap(array, maxPos, num - 1);
			}
			num--;
		}
	}
	public static void swap(int[] array, int idx1, int idx2) 
	{
		int temp = -1;
		temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
	}
	
	//Bubble Sort
	public static void bubbleSort(int[] array)
	{
		int counter = 1;
		for(int pass = 0; pass < array.length; pass++)
		{
			for(int element = 0; element < array.length - counter; element++)
			{
				if(array[element] > array[element + 1])
				{
					swap(array, element, element + 1);
				}
			}
			counter += 1;
		}
	}
	//Insertion Sort
	public static void insertionSort(int[] array)
	{
		int key, j;
		//outer loop goes through the array
		for(int i = 0; i < array.length; i++)
		{
			key = array[i];
			j = i - 1;
			while(j >= 0 && key < array[j])
			{
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = key;
		}
	}
	//Quick Sort
	//Merge Sort
	//Binary Search
	public static int binarySearch(int[] array, int key)
	{
		int start = 0, end = array.length - 1, mid = -1;
		while(start <= end)
		{
			mid = (start + end) / 2;
			if(key == array[mid]) 
			{
				return mid;
			}
			if(key < array[mid])
			{
				end = mid - 1;
			}
			else if(key > array[mid])
			{
				start = mid + 1;
			}
		}
		return -1;
	}
	//Recursive Search
	public static int recursiveSearch(int[] array, int key, int start, int end)
	{
		int mid = (start + end) / 2;
		if(start > end) 
		{
			return -1;
		}
		if(key == array[mid])
		{
			return mid;
		}
		if(key > array[mid])
		{
			start = mid + 1;
			return recursiveSearch(array, key, start, end);
		}
		else
		{
			end = mid - 1;
			return recursiveSearch(array, key, start, end);
		}
	}
	public static int recursiveSearchString(String[] array, String key, int start, int end)
	{
		int mid = (start + end) / 2;
		if(start > end)
		{
			return -1;
		}
		if(key.equals(array[mid]))
		{
			return mid;
		}
		if((int)key.charAt(0) > (int)array[mid].charAt(0)) 
		{
			start = mid + 1;
			return recursiveSearchString(array, key, start, end);
		}
		else
		{
			end = mid + 1;
			return recursiveSearchString(array, key, start, end);
		}
	}
	//Linear Search
	public static int linearSearch(int[] array, int key)
	{
		int index = -1;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)
			{
				index = i;
			}
		}
		return index;
	}
	public static int linearSearchString(String[] array, String key)
	{
		int index = -1;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].equals(key))
			{
				index = i;
			}
		}
		return index;
	}
	//Print Array
	public static void printArr(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
	}
}
