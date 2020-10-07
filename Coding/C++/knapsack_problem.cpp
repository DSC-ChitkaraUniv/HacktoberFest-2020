#include <iostream>
#include <vector>
#include <algorithm>

using std::vector;

double get_optimal_value(double capacity, vector<double> weights, vector<double> values) {
  double value = 0.0, a = 0, small = 0, temp = 0;

  int i, n, j, p, f=0;
  n = values.size();

  vector<double> div(n);
  for (i=0; i<n; ++i){
    div[i] = ((double)values[i] / (double)weights[i]);
  }

  for (i=0; i<n-1; ++i){
    small = div[i];
    f = 0;
    for (j=i+1; j<n; ++j){
        if(small < div[j]){
            small = div[j];
            p = j;
            f = 1;
        }
    }

    if (f==1){
        div[p] = div[i];
        div[i] = small;

        temp = weights[p];
        weights[p] = weights[i];
        weights[i] = temp;
    }
  }

  //for (i=0; i<n; ++i){
   // std::cout << div[i] << " " << weights[i] << '\n';
 // }

  std::cout<< "\n";
  /*std::sort(div.begin(), div.end());
  std::reverse(div.begin(), div.end());*/

  for (i=0; i<n; ++i){
     if (capacity == 0)
        return value;
     a = std::min(weights[i], capacity);
     //std::cout << " " << a << " " << capacity;
     value += a * div[i];
     //std::cout << "\nValue = " << values[p] << " weight = " << weights[p] << " value = "<< value << "\n";
     capacity -= a;
     weights[i] -= a;
  }

  // write your code here

  return value;
}

int main() {
  int n;
  double capacity;
  std::cin >> n >> capacity;
  vector<double> values(n), weights(n);
  for (int i = 0; i < n; i++) {
    std::cin >> values[i] >> weights[i];
  }

  double optimal_value = get_optimal_value(capacity, weights, values);

  std::cout.precision(10);
  std::cout << optimal_value << std::endl;
  return 0;
}

// end code
// contributor -> Sparsh Garg
