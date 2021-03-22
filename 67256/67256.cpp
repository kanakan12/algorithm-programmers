#include <string>
#include <vector>
#include <tuple>

using namespace std;

string solution(vector<int> numbers, string hand)
{
    string answer = "";

    tuple<int, int> LP = make_tuple(3, 0);
    tuple<int, int> RP = make_tuple(3, 2);

    for (int i = 0; i < numbers.size(); i++)
    {
        if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7)
        {
            if (numbers[i] == 1)
                LP = make_tuple(0, 0);
            else if (numbers[i] == 4)
                LP = make_tuple(1, 0);
            else if (numbers[i] == 7)
                LP = make_tuple(2, 0);

            answer += "L";
        }
        else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9)
        {
            if (numbers[i] == 3)
                RP = make_tuple(0, 2);
            else if (numbers[i] == 6)
                RP = make_tuple(1, 2);
            else if (numbers[i] == 9)
                RP = make_tuple(2, 2);

            answer += "R";
        }
        else
        {
            if (numbers[i] == 2)
            {
                if ((abs(get<0>(LP) - 0) + abs(get<1>(LP) - 1)) > (abs(get<0>(RP) - 0) + abs(get<1>(RP) - 1)))
                {
                    answer += "R";
                    RP = make_tuple(0, 1);
                }
                else if ((abs(get<0>(LP) - 0) + abs(get<1>(LP) - 1)) < (abs(get<0>(RP) - 0) + abs(get<1>(RP) - 1)))
                {
                    answer += "L";
                    LP = make_tuple(0, 1);
                }
                else
                {
                    if (hand == "right")
                    {
                        answer += "R";
                        RP = make_tuple(0, 1);
                    }
                    else
                    {
                        answer += "L";
                        LP = make_tuple(0, 1);
                    }
                }
            }
            else if (numbers[i] == 5)
            {
                if ((abs(get<0>(LP) - 1) + abs(get<1>(LP) - 1)) > (abs(get<0>(RP) - 1) + abs(get<1>(RP) - 1)))
                {
                    answer += "R";
                    RP = make_tuple(1, 1);
                }
                else if ((abs(get<0>(LP) - 1) + abs(get<1>(LP) - 1)) < (abs(get<0>(RP) - 1) + abs(get<1>(RP) - 1)))
                {
                    answer += "L";
                    LP = make_tuple(1, 1);
                }
                else
                {
                    if (hand == "right")
                    {
                        answer += "R";
                        RP = make_tuple(1, 1);
                    }
                    else
                    {
                        answer += "L";
                        LP = make_tuple(1, 1);
                    }
                }
            }
            else if (numbers[i] == 8)
            {
                if ((abs(get<0>(LP) - 2) + abs(get<1>(LP) - 1)) > (abs(get<0>(RP) - 2) + abs(get<1>(RP) - 1)))
                {
                    answer += "R";
                    RP = make_tuple(2, 1);
                }
                else if ((abs(get<0>(LP) - 2) + abs(get<1>(LP) - 1)) < (abs(get<0>(RP) - 2) + abs(get<1>(RP) - 1)))
                {
                    answer += "L";
                    LP = make_tuple(2, 1);
                }
                else
                {
                    if (hand == "right")
                    {
                        answer += "R";
                        RP = make_tuple(2, 1);
                    }
                    else
                    {
                        answer += "L";
                        LP = make_tuple(2, 1);
                    }
                }
            }
            else if (numbers[i] == 0)
            {
                if ((abs(get<0>(LP) - 3) + abs(get<1>(LP) - 1)) > (abs(get<0>(RP) - 3) + abs(get<1>(RP) - 1)))
                {
                    answer += "R";
                    RP = make_tuple(3, 1);
                }
                else if ((abs(get<0>(LP) - 3) + abs(get<1>(LP) - 1)) < (abs(get<0>(RP) - 3) + abs(get<1>(RP) - 1)))
                {
                    answer += "L";
                    LP = make_tuple(3, 1);
                }
                else
                {
                    if (hand == "right")
                    {
                        answer += "R";
                        RP = make_tuple(3, 1);
                    }
                    else
                    {
                        answer += "L";
                        LP = make_tuple(3, 1);
                    }
                }
            }
        }
    }
    return answer;
}

int main(void)
{
    vector<int> a = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    string b = "right";

    solution(a, b);
}