package main

import "fmt"

func main() {
	left := 13
	right := 17
	fmt.Println(solution(left, right))

	left2 := 24
	right2 := 27
	fmt.Println(solution(left2, right2))
}

func solution(left int, right int) int {
	result := 0
	for i := left; i <= right; i++ {
		if check(i)%2 == 0 {
			result += i
		} else {
			result -= i
		}
	}

	return result
}

func check(a int) int {
	count := 0
	for i := 1; i <= a; i++ {
		if a%i == 0 {
			count++
		}
	}

	return count
}
