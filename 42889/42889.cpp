#include <string>
#include <vector>

using namespace std;

bool cmp(pair<double, int> a, pair<double, int> b)
{
    if (a.first == b.first)
    {
        if (b.second > a.second)
            return true;
        else
            return false;
    }
    else if (a.first > b.first)
        return true;
    else
        return false;
}

vector<int> solution(int N, vector<int> stages)
{
    vector<int> answer;

    vector<pair<double, int>> vp;

    for (int i = 0; i <= N + 1; i++)
    {
        vp.push_back({0, i});
    }

    for (int i = 0; i < stages.size(); i++)
    {
        vp[stages[i]].first += 1.0;
    }

    double cnt = stages.size();

    for (int i = 0; i <= N; i++)
    {
        double cur = vp[i].first;
        if (cur == 0.0)
        {
            vp[i].first = 0.0;
            continue;
        }

        cnt -= cur;

        vp[i].first = cur / cnt;
    }

    sort(vp.begin() + 1, vp.end() - 1, cmp);

    for (int i = 1; i <= N; i++)
    {
        answer.push_back(vp[i].second);
    }

    return answer;
}

int main(void)
{
    int n = 5;
    vector<int> v = {2, 1, 2, 6, 2, 4, 3, 3};

    solution(n, v);
}