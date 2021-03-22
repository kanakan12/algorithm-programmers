#include <string>
#include <vector>
#include <algorithm>

using namespace std;

string solution(string new_id)
{
    string answer = "";

    int cnt = new_id.size();
    transform(new_id.begin(), new_id.end(), new_id.begin(), ::tolower);

    for (int i = 0; i < new_id.size(); i++)
    {
        if ((new_id[i] >= 'a' && new_id[i] <= 'z') || (new_id[i] >= '0' && new_id[i] <= '9') || new_id[i] == '-' || new_id[i] == '_' || new_id[i] == '.')
        {
        }
        else
        {
            new_id.erase(i, 1);
            i--;
        }
    }

    for (int i = 0; i < new_id.size() - 1; i++)
    {
        if (new_id[i] == '.' && new_id[i + 1] == '.')
        {
            new_id.erase(i, 1);
            i--;
        }
    }

    if (new_id[0] == '.')
    {
        new_id.erase(0, 1);
    }

    if (new_id[new_id.size() - 1] == '.')
    {
        new_id.erase(new_id.size() - 1, 1);
    }

    if (new_id.size() == 0)
    {
        new_id = "a";
    }

    if (new_id.size() >= 16)
    {
        new_id.erase(15, new_id.size() - 15);
    }

    if (new_id[new_id.size() - 1] == '.')
    {
        new_id.erase(new_id.size() - 1, 1);
    }

    while (new_id.size() <= 2)
    {
        new_id += new_id[new_id.size() - 1];
    }

    return answer = new_id;
}

int main(void)
{
    //string a = "...!@BaT#*..y.abcdefghijklm";
    string a = "z-+.^.";

    solution(a);
}