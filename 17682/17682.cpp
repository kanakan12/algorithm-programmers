#include <string>
#include <vector>

using namespace std;

int solution(string dartResult)
{
    int answer = 0;
    vector<int> v;

    int cur = 0;

    for (int i = 0; i < dartResult.size(); i++)
    {
        if (dartResult[i] >= '0' && dartResult[i] <= '9')
        {
            cur = atoi(&dartResult[i]);

            if (cur == 10)
                i++;
        }
        else if (dartResult[i] == 'S' || dartResult[i] == 'D' || dartResult[i] == 'T')
        {
            if (dartResult[i] == 'D')
                cur *= cur;
            else if (dartResult[i] == 'T')
                cur = cur * cur * cur;

            v.push_back(cur);
        }
        else if (dartResult[i] == '*')
        {
            for (int j = v.size() - 1, z = 0; j >= 0 && z < 2; j--, z++)
            {
                v[j] *= 2;
            }
        }
        else if (dartResult[i] == '#')
        {
            v[v.size() - 1] *= -1;
        }
    }

    for (int k = 0; k < v.size(); k++)
        answer += v[k];

    return answer;
}

int main(void)
{
    string a = "1D2S#10S";
    solution(a);
}