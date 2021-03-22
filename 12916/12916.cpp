#include <string>
#include <iostream>
#include <algorithm>

using namespace std;

bool solution(string s)
{
    bool answer = true;

    transform(s.begin(), s.end(), s.begin(), ::towlower);

    int p = 0, y = 0;
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i] == 'p')
            p++;
        if (s[i] == 'y')
            y++;
    }

    if (p != y)
        answer = false;

    return answer;
}

int main(void)
{
    string a = "pPoooyY";
    solution(a);
}