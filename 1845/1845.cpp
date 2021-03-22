#include <vector>
#include <algorithm>
#include <unordered_set>

using namespace std;

// type 2
int solution(vector<int> nums)
{
    int answer = nums.size() / 2;
    unordered_set<int> s(nums.begin(), nums.end());

    if (answer > s.size())
        answer = s.size();

    return answer;
}

// type 1
// int solution(vector<int> nums)
// {
//     int answer = nums.size() / 2;
//     sort(nums.begin(), nums.end());
//     nums.erase(unique(nums.begin(), nums.end()), nums.end());

//     if (answer > nums.size())
//         answer = nums.size();

//     return answer;
// }

int main(void)
{
    vector<int> nums = {3, 1, 2, 3};
    solution(nums);
}