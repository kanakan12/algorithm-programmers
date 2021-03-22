#include <string>
#include <vector>

using namespace std;

int solution(vector<vector<int>> board, vector<int> moves)
{
    int answer = 0;
    vector<int> ans;

    for (int i = 0; i < moves.size(); i++)
    {
        int cur = moves[i] - 1;

        int res = 0;
        int idx = 0;
        while (idx < board[cur].size())
        {
            if (board[idx][cur] != 0)
            {
                res = board[idx][cur];
                board[idx][cur] = 0;
                break;
            }
            idx++;
        }

        if (res != 0)
        {
            if (ans.size() == 0)
            {
                ans.push_back(res);
            }
            else
            {
                int check = ans.back();

                if (check == res)
                {
                    ans.pop_back();
                    answer += 2;
                }
                else
                {
                    ans.push_back(res);
                }
            }
        }
    }

    return answer;
}

int main(void)
{
    printf("test");

    vector<vector<int>> a = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
    vector<int> b = {1, 5, 3, 5, 1, 2, 1, 4};

    int ans = solution(a, b);

    return 0;
}