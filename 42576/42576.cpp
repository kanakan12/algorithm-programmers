#include <string>
#include <vector>
#include <unordered_set>

using namespace std;

// test 1
// string solution(vector<string> participant, vector<string> completion) {
//     string answer = "";

//     sort(participant.begin(), participant.end());
//     sort(completion.begin(), completion.end());

//     for(int i = 0; i < completion.size(); i++)
//     {
//         if(participant[i] != completion[i])
//         {
//             answer = participant[i];
//             break;
//         }
//     }

//     if(answer == "")
//         answer = participant.back();

//     return answer;
// }

// test 2
string solution(vector<string> participant, vector<string> completion)
{
    string answer = "";
    unordered_multiset<string> names;

    for (int i = 0; i < participant.size(); i++)
    {
        names.insert(participant[i]);
    }

    for (int i = 0; i < completion.size(); i++)
    {
        unordered_multiset<string>::iterator itr = names.find(completion[i]);
        names.erase(itr);
    }

    return *names.begin();
}

int main(void)
{
    vector<string> a = {"leo", "kiki", "eden"};
    vector<string> b = {"eden", "kiki"};

    string ans = solution(a, b);
}