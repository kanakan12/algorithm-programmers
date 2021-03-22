#include <vector>

using namespace std;

bool check[100][100];
int cnt = 0;

void func(int a, int b, int m, int n, vector<vector<int>> p, int cur)
{
    if (a < 0 || a >= m)
        return;
    else if (b < 0 || b >= n)
        return;
    else if (check[a][b] == true || p[a][b] == 0)
        return;
    else if (p[a][b] != cur)
        return;

    else if (p[a][b] == cur)
    {
        cnt++;
        check[a][b] = true;
        func(a + 1, b, m, n, p, cur);
        func(a - 1, b, m, n, p, cur);
        func(a, b + 1, m, n, p, cur);
        func(a, b - 1, m, n, p, cur);
    }
}

vector<int> solution(int m, int n, vector<vector<int>> picture)
{
    int number_of_area = 0;
    int max_size_of_one_area = 0;

    vector<int> answer(2);
    answer[0] = number_of_area;
    answer[1] = max_size_of_one_area;

    cnt = 0;
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            check[i][j] = false;
        }
    }

    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n; j++)
        {
            if (check[i][j] == true)
                continue;

            cnt = 0;
            if (picture[i][j] != 0)
                func(i, j, m, n, picture, picture[i][j]);

            if (cnt > 0)
            {
                answer[0]++;

                if (answer[1] < cnt)
                    answer[1] = cnt;
            }
        }
    }

    return answer;
}

int main(void)
{
    // int m = 6;
    // int n = 4;
    // vector<vector<int> > p = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};

    int m = 2;
    int n = 2;
    vector<vector<int>> p = {{1, 1}, {0, 1}};

    solution(m, n, p);
}