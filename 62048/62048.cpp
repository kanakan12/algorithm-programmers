#include <iostream>

using namespace std;

int func(int w, int h)
{
    return (w % h != 0) ? func(h, w % h) : h;
}

long long solution(int w, int h)
{
    long long answer = 1;

    long long total = (long long)w * (long long)h;
    long long use = w + h - func(w, h);

    return answer = total - use;
}

int main(void)
{
    int a = 100000000;
    int b = 100000000;
    solution(a, b);
}