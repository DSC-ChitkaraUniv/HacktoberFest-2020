// GOOGLE QUES

#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;

int domino(vector<int> v1,vector<int> v2){
	int count = 1;
	if(v1 == v2){
		cout<<0;
	}
	for(int i=0;i<v1.size();i++){
		if(v.at(i) == v.at(i+1))
			count++;
		else
			break;
	}
	for(int i=0;i<v1.size();i++){
		if(v1.at(i) == )
			break;
		else{

		}
	}
}

int main(){
	vector<int> v1;
	vector<int> v2;

	int size;
	cin>>size;
	v1.resize(size);
	v2.resize(size);

	int value1,value2;

	for(int i=0;i<size;i++){
		cin>>value1;
		v1.at(i) = value1;
	}
	for(int i=0;i<size;i++){
		cin>>value2;
		v2.at(i) = value2;
	}
	
	

	for(auto &x: v1){
		cout<<x;
	}
	for(auto &y: v2){
		cout<<y;
	}

	domino(v1,v2);
}