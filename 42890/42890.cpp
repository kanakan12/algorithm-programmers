#include <string>
#include <vector>
#include <map>

using namespace std;

vector<int> ans;

int check(int bit)
{
    for (int i = 0; i < ans.size(); i++)
    {
        if ((ans[i] & bit) == ans[i])
            return 0;
    }

    return 1;
}

int solution(vector<vector<string>> relation)
{
    int answer = 0;

    int row = relation.size();
    int col = relation[0].size();

    for (int i = 1; i < (1 << col); i++)
    {
        map<string, int> m;

        for (int j = 0; j < row; j++)
        {
            string s = "";

            for (int k = 0; k < col; k++)
            {
                if (i & (1 << k))
                    s += relation[j][k] + "_";
            }

            m[s] = 1;
        }

        if (m.size() == row && check(i) == 1)
            ans.push_back(i);
    }

    answer = ans.size();

    return answer;
}

int main(void)
{
    vector<vector<string>> relation = {{"100", "ryan", "music", "2"},
                                       {"200", "apeach", "math", "2"},
                                       {"300", "tube", "computer", "3"},
                                       {"400", "con", "computer", "4"},
                                       {"500", "muzi", "music", "3"},
                                       {"600", "apeach", "music", "2"}};
    // vector<vector<string>> relation = {{"ab", "c"}, {"a", "bc"}, {"a", "x"}, {"x", "c"}};
    solution(relation);
}