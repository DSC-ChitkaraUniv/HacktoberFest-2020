//C++ program for merge sort

void merge(int arr[], int l, int m, int r) 
{ 
    int i, j, k; 
    int n1 = m - l + 1; 
    int n2 = r - m; 
    int L[n1], R[n2]; //temp arrays

  //copy the values
    for (i = 0; i < n1; i++) 
        L[i] = arr[l + i]; 
    for (j = 0; j < n2; j++) 
        R[j] = arr[m + 1 + j]; 

    //merge temp
    i = 0; 
    j = 0; 
    k = l; 
    while (i < n1 && j < n2) { 
        if (L[i] <= R[j]) { 
            arr[k] = L[i]; 
            i++; 
        } 
        else { 
            arr[k] = R[j]; 
            j++; 
        } 
        k++; 
    } 

   //remaining values copied
    while (i < n1) { 
        arr[k] = L[i]; 
        i++; 
        k++; 
    } 

  //remaining elements of R array
    while (j < n2) { 
        arr[k] = R[j]; 
        j++; 
        k++; 
    } 
} 


void mergeSort(int arr[], int l, int r) 
{ 
    if (l < r) { 
        int m = l + (r - l) / 2; 
        mergeSort(arr, l, m); 
        mergeSort(arr, m + 1, r); 

        merge(arr, l, m, r); 
    } 
} 

//print function
void printArray(int A[], int size) 
{ 
    int i; 
    for (i = 0; i < size; i++) 
        cout<<A[i]<<" ";       
    cout<<endl; 
} 

//driver code
int main() 
{ 
    int arr[] = { 12, 11, 13, 5, 6, 7 }; 
    int arr_size = sizeof(arr) / sizeof(arr[0]); 
    cout<<"Array before sort"<<endl;
    printArray(arr, arr_size); 

    mergeSort(arr, 0, arr_size - 1); 

    cout<<"Sorted array is:"<<endl; 
    printArray(arr, arr_size); 
    return 0; 
} 
