package main

import "fmt"

func main() {
	price := 3
	money := 20
	count := 5

	fmt.Println(solution(price, money, count))
}

func solution(price int, money int, count int) int64 {
	cost := 0
	for i := 1; i < count+1; i++ {
		cost += price * i
	}

	if cost > money {
		return int64(cost - money)
	}

	return 0
}
