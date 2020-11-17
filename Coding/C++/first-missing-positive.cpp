#include <bits/stdc++.h>
using namespace std;


int MissingPositive(vector<int> &A) {
    int n = A.size();
    int correctPos;
    //nums[i] should be in range of 1 to n, where n is the size of array.
    //If nums[i] is not equal to nums[nums[i] - 1]
    //then we swap, till that number reaches to its index position
    //like, 1 will reach to index 0 (because array start from 0 index)
    //so when all numbers will reach their index position, 
    //the number which is not at its indexed position or
    //it is a negative number, then smallest positive number is missing at that position
    //like if 1 is not at its position, then 1 is missing

    for(int i = 0; i<n; i++)
    {
        correctPos = A[i] - 1;
        while( (A[i] >= 1 && A[i] <= n) && A[i] != A[correctPos] )
        {
            swap(A[i], A[correctPos]);
            correctPos = A[i] - 1;
        }
    }
    for(int i=0; i<n; i++)
    {
        if(i+1 != A[i])
        {
            return i+1;
        }
    }
    return n+1;
}



int main()
{
    //question is that you are given an array
    //find the first missive positive integer in that array
    //in constant extra space and linear time complexity
    //Input: [3,4,-1,1]
    //Output: 2
    
    int n,x;
    cin>>n;
    vector <int> s;
    for(int i=0; i<n; i++)
    {
        cin>>x;
        s.push_back(x);
    }
    
    cout<<MissingPositive(s)<<endl;
    return 0;
}