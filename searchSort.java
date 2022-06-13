import java.util.Scanner;
public class SearchingSorting
{
	public static void main(String[] args) 
	{
		int iKey;
		String searchSort, searchRoutine, sKey, typeSearch, sortRoutine, choice;
		Scanner scanner = new Scanner(System.in);
		int[] arr = { 15, 12, 22, 24, 30, 34, 65, 67, 77, 98, 0, 27, 13, 6, 2, 88 };
		String[] array = { "Hello", "There", "Person", "Plane", "Ready", "Great" };
		System.out.println("Integer Array:");
		printArr(arr);
		System.out.println("\nString Array:");
		printArray(array);
		System.out.print("\n\nWelcome to the searching and sorting algorithm.\nWould you like to search or sort? ");
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
			case "linear": case "1":
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
				}//end typeSearch case
				break;
			case "recursive": case "2":
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
					System.out.println(recursiveSearchString(array, sKey, 0, array.length - 1) == -1 ? "Key not found" : "Key found at: " + (recursiveSearchString(array, sKey, 0, array.length - 1) + 1));
					break;
				default:
					System.out.println("The choice you have entered [" + typeSearch + "] is invalid.");
				}//end typeSearch case
				break;
			case "binary": case "3":
				System.out.println("Would you like to search for a number or a word?");
				typeSearch = scanner.nextLine().toLowerCase();
				switch(typeSearch)
				{
				case "number":
					System.out.println("Please enter a number to search for.");
					iKey = Integer.parseInt(scanner.nextLine());
					System.out.println(binarySearch(arr, iKey) == -1 ? "Key not found" : "Key found at: " + (binarySearch(arr, iKey) + 1));
					break;
				case "word":
					System.out.println("Please enter a word to search for.");
					sKey = scanner.nextLine();
					System.out.println(binarySearchString(array, sKey) == -1 ? "Key not found" : "Key found at: " + (binarySearchString(array, sKey) + 1));
					break;
				default:
					System.out.println("The choice you have entered [" + typeSearch + "] is invalid.");
				}//end typeSearch case
				break;
			default:
				System.out.println("The choice you have entered [" + searchRoutine + "] is invalid.");
			}//end searchRoutine case
			break;
		case "sort":
			System.out.println("Which sorting algorithm would you like to use?");
			System.out.println("[1] Selection");
			System.out.println("[2] Bubble");
			System.out.println("[3] Insertion");
			System.out.println("[4] Quick");
			System.out.println("[5] Merge");
			sortRoutine = scanner.nextLine().toLowerCase();
			switch(sortRoutine)
			{
			case "selection": case "1":
				System.out.println("\nWhich version of Selection Sort would you like to use?");
				System.out.println("[-] Ascending");
				System.out.println("[-] Descending");
				choice = scanner.nextLine().toLowerCase();
				switch(choice)
				{
				case "ascending":
					System.out.println("Would you like to sort numbers or words?");
					typeSearch = scanner.nextLine().toLowerCase();
					switch(typeSearch)
					{
					case "numbers":
						System.out.println("Unsorted Array:");
						printArr(arr);
						System.out.println("\nSorted Array:");
						selectionSortAscending(arr);
						printArr(arr);
						break;
					case "words":
						System.out.println("Unsorted Array:");
						printArray(array);
						System.out.println("\nSorted Array:");
						selectionSortAscendingString(array);
						printArray(array);
						break;
					default:
						System.out.println("The choice you have entered [" + typeSearch + "] is invalid.");
					}//end typeSearch case
					break;
				case "descending":
					System.out.println("Would you like to sort numbers or words?");
					typeSearch = scanner.nextLine().toLowerCase();
					switch(typeSearch)
					{
					case "numbers":
						System.out.println("Unsorted Array:");
						printArr(arr);
						System.out.println("\nSorted Array:");
						selectionSortDescending(arr);
						printArr(arr);
						break;
					case "words":
						System.out.println("Unsorted Array:");
						printArray(array);
						System.out.println("\nSorted Array:");
						selectionSortDescendingString(array);
						printArray(array);
						break;
					default:
						System.out.println("The choice you have entered [" + typeSearch + "] is invalid.");
					}//end typeSearch case
					break;
				default:
					System.out.println("The choice you have entered [" + choice + "] is invalid.");
				}//end sortRoutine case
			case "bubble": case "2":
				System.out.println("Would you like to sort numbers or words?");
				sortRoutine = scanner.nextLine().toLowerCase();
				switch(sortRoutine)
				{
				case "numbers":
					System.out.println("Unsorted Array:");
					printArr(arr);
					System.out.println("\nSorted Array:");
					bubbleSort(arr);
					printArr(arr);
					break;
				case "words":
					System.out.println("Unsorted Array:");
					printArray(array);
					System.out.println("\nSorted Array:");
					bubbleSortString(array);
					printArray(array);
					break;
				default:
					System.out.println("The choice you have entered [" + sortRoutine + "] is invalid.");
				}//end sortRoutine case
				break;
			case "insertion": case "3":
				System.out.println("Would you like to sort numbers or words?");
				sortRoutine = scanner.nextLine().toLowerCase();
				switch(sortRoutine)
				{
				case "numbers":
					System.out.println("Unsorted Array:");
					printArr(arr);
					System.out.println("\nSorted Array:");
					insertionSort(arr);
					printArr(arr);
					break;
				case "words":
					System.out.println("Unsorted Array:");
					printArray(array);
					System.out.println("\nSorted Array:");
					insertionSortString(array);
					printArray(array);
					break;
				default:
					System.out.println("The choice you have entered [" + sortRoutine + "] is invalid.");
				}//end sortRoutine case
				break;
			case "quick": case "4":
				System.out.println("Would you like to sort numbers or words?");
				sortRoutine = scanner.nextLine().toLowerCase();
				switch(sortRoutine)
				{
				case "numbers":
					System.out.println("Unsorted Array:");
					printArr(arr);
					System.out.println("\nSorted Array:");
					quickSort(arr, 0, arr.length - 1);
					printArr(arr);
					break;
				case "words":
					System.out.println("Unsorted Array:");
					printArray(array);
					System.out.println("\nSorted Array:");
					quickSortString(array, 0, array.length - 1);
					printArray(array);
					break;
				default:
					System.out.println("The choice you have entered [" + sortRoutine + "] is invalid.");
				}//end sortRoutine case
				break;
			case "merge": case "5":
				System.out.println("Would you like to sort numbers or words?");
				sortRoutine = scanner.nextLine().toLowerCase();
				switch(sortRoutine)
				{
				case "numbers":
					System.out.println("Unsorted Array:");
					printArr(arr);
					System.out.println("\nSorted Array:");
					mergeSort(arr, arr.length);
					printArr(arr);
					break;
				case "words":
					System.out.println("Unsorted Array:");
					printArray(array);
					System.out.println("\nSorted Array:");
					mergeSortString(array, array.length);
					printArray(array);
					break;
				default:
					System.out.println("The choice you have entered [" + sortRoutine + "] is invalid.");
				}//end sortRoutine case
				break;
			default: 
				System.out.println("The choice you have entered [" + sortRoutine + "] is invalid.");
			}//end sortRoutine case
			break;
		default:
			System.out.println("The choice you have entered [" + searchSort + "] is invalid.");
		}//end searchSort case
		scanner.close();
	}//end main()
	//Selection Sort
	public static void selectionSortAscending(int[] array)
	{
		int num = array.length;
		int minPos;
		for(int i = 0; i < num - 1; i++)
		{
			minPos = i;
			for(int j = i + 1; j < num; j++)
			{
				if(array[j] < array[minPos])
				{
					minPos = j;
				}//end if
			}//end for
			if(i != minPos)
			{
				swap(array, minPos, i);
			}//end if
		}//end for
	}//end selectionSortAscending()
	public static void selectionSortAscendingString(String[] array)
	{
		int num = array.length;
		int minPos;
		for(int i = 0; i < num - 1; i++)
		{
			minPos = i;
			for(int j = i + 1; j < num; j++)
			{
				if(array[j].charAt(0) < array[minPos].charAt(0))
				{
					minPos = j;
				}//end if
			}//end for
			if(i != minPos)
			{
				swapString(array, minPos, i);
			}//end if
		}//end for
	}//end selectionSortAscendingString()
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
				}//end if
				swap(array, maxPos, num - 1);
			}//end for
			num--;
		}//end while
	}//end selectionSortDescending()
	public static void selectionSortDescendingString(String[] array)
	{
		int num = array.length;
		int maxPos;
		while(num > 1)
		{
			maxPos = 0;
			for(int i = 0; i < num; i++)
			{
				if(array[i].charAt(0) > array[maxPos].charAt(0))
				{
					maxPos = i;
				}//end if
				swapString(array, maxPos, num -1);
			}//end for
			num--;
		}//end while
	}//end selectionSortDescendingString()
	public static void swap(int[] array, int idx1, int idx2) 
	{
		int temp = -1;
		temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
	}//end swap()
	public static void swapString(String[] array, int idx1, int idx2)
	{
		String temp = null;
		temp = array[idx1];
		array[idx1] = array[idx2];
		array[idx2] = temp;
	}//end swapString()
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
				}//end if
			}//end for
			counter += 1;
		}//end for
	}//end bubbleSort()
	public static void bubbleSortString(String[] array)
	{
		int counter = 1;
		for(int pass = 0; pass < array.length; pass++)
		{
			for(int element = 0; element < array.length - counter; element++)
			{
				if(array[element].charAt(0) > array[element + 1].charAt(0))
				{
					swapString(array, element, element + 1);
				}//end if
			}//end for
			counter += 1;
		}//end for
	}//end bubbleSortString()
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
			}//end while
			array[j + 1] = key;
		}//end for
	}//end insertionSort()
	public static void insertionSortString(String[] array)
	{
		int j;
		String key;
		for(int i = 0; i < array.length; i++)
		{
			key = array[i];
			j = i - 1;
			while(j >= 0 && key.charAt(0) < array[j].charAt(0))
			{
				array[j + 1] = array[j];
				j--;
			}//end while
			array[j + 1] = key;
		}//end for
	}//end insertionSortString()
	//Quick Sort
	public static int partition(int[] arr, int start, int end)
	{
		int pIndex = start;
		int pivot = arr[end];
		for(int i = start; i < end; i++)
		{
			if(arr[i] <= pivot) 
			{
				swap(arr, i, pIndex);
				pIndex++;
			}//end if
		}//end for
		swap(arr, pIndex, end);
		return pIndex;
	}//end partition()
	public static int partitionString(String[] arr, int start, int end)
	{
		int pIndex = start;
		String pivot = arr[end];
		for(int i = start; i < end; i++)
		{
			if(arr[i].charAt(0) < pivot.charAt(0))
			{
				swapString(arr, i, pIndex);
				pIndex++;
			}//end if
		}//end for
		swapString(arr, pIndex, end);
		return pIndex;
	}//end partitionString()
	public static void quickSort(int[] arr, int start, int end)
	{
		if(start < end)
		{
			int pIndex = partition(arr, start, end);
			quickSort(arr, start, pIndex - 1);
			quickSort(arr, pIndex + 1, end);
		}//end if
	}//end quickSort()
	public static void quickSortString(String[] arr, int start, int end)
	{
		if(start < end)
		{
			int pIndex = partitionString(arr, start, end);
			quickSortString(arr, start, pIndex - 1);
			quickSortString(arr, pIndex + 1, end);
		}//end if
	}//end quickSortString()
	//Merge Sort
	public static void merge(int[] leftArr, int[] rightArr, int[] arr, int leftSize, int rightSize)
	{
		int i = 0, l = 0, r = 0;
		while(l < leftSize && r < rightSize)
		{
			if(leftArr[l] < rightArr[r])
			{
				arr[i++] = leftArr[l++];
			}//end else
			else
			{
				arr[i++] = rightArr[r++];
			}//end else
		}//end while
		while(l < leftSize)
		{
			arr[i++] = leftArr[l++];
		}//end while
		while(r < rightSize)
		{
			arr[i++] = rightArr[r++];
		}//end while
	}//end merge()
	public static void mergeString(String[] leftArr, String[] rightArr, String[] arr, int leftSize, int rightSize)
	{
		int i = 0, l = 0, r = 0;
		while(l < leftSize && r < rightSize)
		{
			if(leftArr[l].charAt(0) < rightArr[r].charAt(0))
			{
				arr[i++] = leftArr[l++];
			}//end else
			else
			{
				arr[i++] = rightArr[r++];
			}//end else
		}//end while
		while(l < leftSize)
		{
			arr[i++] = leftArr[l++];
		}//end while
		while(r < rightSize)
		{
			arr[i++] = rightArr[r++];
		}//end while
	}//end mergeString()
	public static void mergeSort(int[] arr, int len)
	{
		if(len < 2) return;
		int mid = len / 2, k = 0;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[len - mid];
		for(int i = 0; i < len; i++)
		{
			if(i < mid)
			{
				leftArr[i] = arr[i];
			}//end if
			else
			{
				rightArr[k] = arr[i];
				k = k + 1;
			}//end else
		}//end for
		mergeSort(leftArr, mid);
		mergeSort(rightArr, len - mid);
		merge(leftArr, rightArr, arr, mid, len - mid);
	}//end mergeSort()
	public static void mergeSortString(String[] arr, int len)
	{
		if(len < 2) return;
		int mid = len / 2, k = 0;
		String[] leftArr = new String[mid];
		String[] rightArr = new String[len - mid];
		for(int i = 0; i < len; i++)
		{
			if(i < mid)
			{
				leftArr[i] = arr[i];
			}//end if
			else
			{
				rightArr[k] = arr[i];
				k = k + 1;
			}//end else
		}//end for
		mergeSortString(leftArr, mid);
		mergeSortString(rightArr, len - mid);
		mergeString(leftArr, rightArr, arr, mid, len - mid);
	}//end mergeSortString
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
			}//end if
			if(key < array[mid])
			{
				end = mid - 1;
			}//end if
			else if(key > array[mid])
			{
				start = mid + 1;
			}//end else if
		}//end while
		return -1;
	}//end binarySearch()
	public static int binarySearchString(String[] array, String key)
	{
		int start = 0, end = array.length - 1, mid = -1;
		while(start <= end)
		{
			mid = (start + end) / 2;
			if(key.equals(array[mid]))
			{
				return mid;
			}//end if
			if((int)key.charAt(0) < (int)array[mid].charAt(0))
			{
				end = mid - 1;
			}//end if
			else if((int)key.charAt(0) > (int)array[mid].charAt(0))
			{
				start = mid + 1;
			}//end else if
		}//end while
		return -1;
	}//end binarySearchString()
	//Recursive Search
	public static int recursiveSearch(int[] array, int key, int start, int end)
	{
		int mid = (start + end) / 2;
		if(start > end) 
		{
			return -1;
		}//end if
		if(key == array[mid])
		{
			return mid;
		}//end if
		if(key > array[mid])
		{
			start = mid + 1;
			return recursiveSearch(array, key, start, end);
		}//end if
		else
		{
			end = mid - 1;
			return recursiveSearch(array, key, start, end);
		}//end else
	}//end recursiveSearch()
	public static int recursiveSearchString(String[] array, String key, int start, int end)
	{
		int mid = (start + end) / 2;
		if(start > end)
		{
			return -1;
		}//end if
		if(key.equals(array[mid]))
		{
			return mid;
		}//end if
		if((int)key.charAt(0) > (int)array[mid].charAt(0)) 
		{
			start = mid + 1;
			return recursiveSearchString(array, key, start, end);
		}//end if
		else
		{
			end = mid - 1;
			return recursiveSearchString(array, key, start, end);
		}//end else
	}//end recursiveSearchString()
	//Linear Search
	public static int linearSearch(int[] array, int key)
	{
		int index = -1;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i] == key)
			{
				index = i;
			}//end if
		}//end for
		return index;
	}//end linearSearch()
	public static int linearSearchString(String[] array, String key)
	{
		int index = -1;
		for(int i = 0; i < array.length; i++)
		{
			if(array[i].equals(key))
			{
				index = i;
			}//end if
		}//end for
		return index;
	}//end linearSearchString()
	//Print Array
	public static void printArr(int[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}//end for
	}//end printArr()
	public static void printArray(String[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");;
		}//end for
	}//end printArray()
}//end class
