#include<iostream>
#include<bits/stdc++.h>
using namespace std;

int printMatrix(int arr[][10]){
	int x,y;

	for(int i=0;i<x;i++){
		for(int j=0;j<y;j++){
			cout<<arr[i][j];
		}
		cout<<endl;
	}
}

int main(){
	int row,col;
	cin>>row>>col;
	int arr[row][col];
	for(int i=0;i<row;i++){
		for(int j=0;j<col;j++){
			cin>>arr[i][j];
		}
	}
	printMatrix(arr);
}