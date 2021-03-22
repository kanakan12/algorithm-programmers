#include <string>
#include <vector>

using namespace std;

string solution(int n)
{
    string answer = "";

    int value = n;
    int reminder = -1;

    while (value != 0)
    {
        reminder = value % 3;
        value /= 3;

        if (reminder == 0)
        {
            answer = "4" + answer;
            value--;
        }
        else if (reminder == 1)
            answer = "1" + answer;
        else if (reminder == 2)
            answer = "2" + answer;
    }

    return answer;
}

int main(void)
{
    int a = 4;
    solution(a);
}