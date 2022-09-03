package main

import "fmt"

func main() {
	n := 10
	fmt.Println(solution(n))

	n2 := 12
	fmt.Println(solution(n2))
}

func solution(n int) int {
	for i := 3; i < n; i++ {
		if n%i == 1 {
			return i
		}
	}

	return 0
}
