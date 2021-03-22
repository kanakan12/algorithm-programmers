#include <string>
#include <vector>

using namespace std;

int solution(string s)
{
    int answer = s.size();

    for (int i = 1; i <= s.size() / 2; i++)
    {
        int len = s.size();

        for (int j = 0; j < s.size(); j++)
        {
            for (int cnt = 0, z = i; j + z < s.size(); z += i)
            {
                if (s.substr(j, i) == s.substr(j + z, i))
                    cnt++;
                else
                {
                    len -= i * cnt;

                    if (cnt)
                        len += to_string(cnt + 1).size();

                    j += z - 1;
                    break;
                }

                if (j + z + i >= s.size())
                {
                    len -= i * cnt;
                    len += to_string(cnt + 1).size();
                    j += z;
                }
            }
        }

        if (len < answer)
            answer = len;
    }

    return answer;
}

int main(void)
{
    string s = "aabbaccc";
    solution(s);
}