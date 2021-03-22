#include <string>
#include <vector>
#include <queue>

using namespace std;

int solution(vector<int> scoville, int K)
{
    int answer = 0;
    // priority_queue => 자료형, 구현체, 비교연산자 순
    // 비교연산자에 less를 사용할 경우, 큰 순서대로 정렬
    priority_queue<int, vector<int>, greater<int>> pq;

    for (int i = 0; i < scoville.size(); i++)
        pq.push(scoville[i]);

    int first, second, result;
    while (true)
    {
        if (pq.size() > 1)
        {
            if (pq.top() < K)
            {
                first = pq.top();
                pq.pop();
                second = pq.top();
                pq.pop();
                result = first + (second * 2);
                pq.push(result);
                answer++;
            }
            else
                break;
        }
        else
        {
            if (pq.top() < K)
                answer = -1;
            break;
        }
    }

    return answer;
}

int main(void)
{
    vector<int> scoville = {1, 2, 3, 9, 10, 12};
    int K = 7;
    solution(scoville, K);
}