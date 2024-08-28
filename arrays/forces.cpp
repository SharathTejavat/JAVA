#include <iostream>
#include <string>
#include <vector>

using namespace std;

int minOperationsToSubstring(string x, string s) {
    int n = x.length();
    int m = s.length();
    int result = m;
    for (int i = 0; i < n; i++) {
        int j = 0;
        int ops = i;
        while (j < m && x[(i + j) % n] == s[j]) {
            j++;
            if (j == m) {
                return ops + 1;
            }
        }
    }
    return -1;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        int n, m;
        cin >> n >> m;
        string x, s;
        cin >> x >> s;
        int result = minOperationsToSubstring(x, s);
        cout << result << endl;
    }
    return 0;
}

