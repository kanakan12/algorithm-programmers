#include <string>
#include <vector>

using namespace std;

vector<string> func(int n, vector<int> arr)
{
    vector<string> res;

    for (int i = 0; i < n; i++)
    {
        int cur = arr[i];
        string s = "";

        while (cur != 0)
        {
            if (cur % 2 == 0)
            {
                s += "0";
            }
            else
            {
                s += "1";
            }

            cur /= 2;
        }

        while (s.size() != n)
        {
            s += "0";
        }

        reverse(s.begin(), s.end());

        res.push_back(s);
    }

    return res;
}

vector<string> solution(int n, vector<int> arr1, vector<int> arr2)
{
    vector<string> answer;

    vector<string> varr1 = func(n, arr1);
    vector<string> varr2 = func(n, arr2);

    for (int i = 0; i < n; i++)
    {
        string s = "";

        for (int j = 0; j < n; j++)
        {
            if (varr1[i][j] == '0' && varr2[i][j] == '0')
            {
                s += " ";
            }
            else
            {
                s += "#";
            }
        }

        answer.push_back(s);
    }

    return answer;
}

int main(void)
{
    int n = 5;
    vector<int> arr1 = {9, 20, 28, 18, 11};
    vector<int> arr2 = {30, 1, 21, 17, 28};

    solution(n, arr1, arr2);
}