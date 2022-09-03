package main

import "fmt"

func main() {
	n := []int{1, 2, 3, 4, 6, 7, 8, 0}
	fmt.Println(solution(n))

	n = []int{5, 8, 4, 0, 6, 7, 9}
	fmt.Println(solution(n))
}

func solution(numbers []int) int {
	result := 45
	for _, n := range numbers {
		result -= n
	}

	return result
}
