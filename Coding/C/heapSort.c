#include<stdio.h>
void swap(int * a, int * b) {
    int temp = * a;
    * a = * b;
    * b = temp;
}
void heapify(int arr[], int n, int i) {
    int largest = i;
    int left = 2 * i + 1;
    int right = 2 * i + 2;
    if (left < n && arr[left] > arr[largest]) largest = left;
    if (right < n && arr[right] > arr[largest]) largest = right;
    if (largest != i) {
        swap( & arr[i], & arr[largest]);
        heapify(arr, n, largest);
    }
}
void heapsort(int arr[], int n) {
    for (int i = n / 2 - 1; i >= 0; i--) {
        heapify(arr, n, i);
    }
    for (int i = n - 1; i >= 0; i--) {
        swap( & arr[0], & arr[i]);
        heapify(arr, i, 0);
    }
}
void print(int arr[], int n) {
    printf("Sorted Array:");
    for (int i = 0; i < n; i++)
        printf("%d ", arr[i]);
    printf("\n");
}
int main() {
    int n;
    printf("Enter size of array to be sorted:");
    scanf("%d", & n);
    int arr[n];
    printf("Enter array element:");
    for (int i = 0; i < n; i++) {
        scanf("%d", & arr[i]);
    }
    heapsort(arr, n);
    print(arr, n);
    return 0;
}
