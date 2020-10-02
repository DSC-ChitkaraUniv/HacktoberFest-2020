#include <iostream>

using namespace std;

int main() {
  int t;
  cin >> t;
  for (int i = 0; i < t; ++i) {
    long int n, cnt = 0;
    cin >> n;
    long int arr[n], left_max[n], right_max[n];
    long int cur_max = 0;
    for (long int j = 0; j < n; j++) {
      cin >> arr[j];
      if (arr[j] > cur_max) {
        cur_max = arr[j];
      }
      left_max[j] = cur_max;
    }

    cur_max = 0;
    for (long int j = n - 1; j >= 0; j--) {
      if (arr[j] > cur_max) {
        cur_max = arr[j];
      }
      right_max[j] = cur_max;
    }

    for (long int j = 0; j < n; j++) {
      long int min = left_max[j] < right_max[j] ? left_max[j] : right_max[j];
      cnt += (min - arr[j]);
    }
    cout << cnt << endl;
  }
  return 0;
}
