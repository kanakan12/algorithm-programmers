#include <string>
#include <vector>
#include <algorithm>

using namespace std;

char cArr[18] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

string Convert(int number, int n)
{
    string str = "";
    while (true)
    {
        str += cArr[number % n];

        int a = number / n;
        if (a != 0)
            number = a;
        else
            break;
    }

    reverse(str.begin(), str.end());

    return str;
}

string solution(int n, int t, int m, int p)
{
    string answer = "";
    string str = "";
    int i = 0;
    while (true)
    {
        str += Convert(i, n);

        if (str.length() >= t * m)
            break;
        i++;
    }

    for (int i = 0; i < t; i++)
        answer += str[p - 1 + (m * i)];

    return answer;
}

int main(void)
{
    int n = 16;
    int t = 16;
    int m = 2;
    int p = 1;
    // n : 진법
    // t : 미리 구할 숫자의 개수
    // m : 게임에 참가하는 인원
    // p : 튜브의 순서
    solution(n, t, m, p);
}