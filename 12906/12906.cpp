#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> arr)
{
    vector<int> answer;
    answer.push_back(arr[0]);

    for (int i = 1; i < arr.size(); i++)
    {
        if (answer.back() != arr[i])
        {
            answer.push_back(arr[i]);
        }
    }
    return answer;
}

int main(void)
{
    vector<int> a = {1, 1, 3, 3, 0, 1, 1};
    solution(a);
}