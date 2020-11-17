// SUM OF NATURAL USING RECURSION

#include<iostream>
using namespace std;

int sumofnatural(int n){
	if(n==0)
		return 0;
	else
		return sumofnatural(n-1) + n;
}

int main(){
	int r;
	cin>>r;
	int sum = sumofnatural(r);
	cout<<sum;
}