#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;

int main(){
	std::vector<vector<int> > v;
	int n1,n2,a;

	cin>>a;
	v.resize(a);
	for(int i=0;i<a;i++){
		cin>>n1>>n2;
		v[n1].pushback(n2);
	}
	for(const auto& e1: v){
		for(const auto& e2: e1){
			cout<<e2;
		}
		cout<<endl;
	}
}