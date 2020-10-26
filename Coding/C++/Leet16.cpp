#include<iostream>
using namespace std;

void full_rotation(int arr[],int initial,int final){
	int temp;
	while(initial<final){
		temp = arr[initial];
		arr[initial] = arr[final];
		arr[final] = temp;
		initial++;
		final--;
	}
}

void rotation(int arr[],int n,int k){

	full_rotation(arr,0,n-1);
	full_rotation(arr,0,k-1);
	full_rotation(arr,k,n-1);
}

int printarray(int arr[],int n){
	for(int i=0;i<n;i++){
		cout<<arr[i]<<" ";
	}
}

int main(){
	int n,k;
	cin>>n>>k;
	int arr[n];
	for(int i=0;i<n;i++){
		cin>>arr[i];
	}

	rotation(arr,n,k);
	printarray(arr,n);
}