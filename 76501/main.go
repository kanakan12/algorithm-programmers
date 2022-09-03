package main

import (
	"fmt"
)

func main() {
	ab := []int{4, 7, 12}
	si := []bool{true, false, true}
	fmt.Println(solution(ab, si))

	ab = []int{1, 2, 3}
	si = []bool{false, false, true}
	fmt.Println(solution(ab, si))
}

func solution(absolutes []int, signs []bool) int {
	result := 0

	for idx, ab := range absolutes {
		if signs[idx] {
			result += ab
		} else {
			result -= ab
		}
	}

	return result
}
