package main

import "fmt"

func main() {
	l := []int{44, 1, 0, 0, 31, 25}
	w := []int{31, 10, 45, 1, 6, 19}
	fmt.Println(solution(l, w))

	l = []int{0, 0, 0, 0, 0, 0}
	w = []int{38, 19, 20, 40, 15, 25}
	fmt.Println(solution(l, w))

	l = []int{45, 4, 35, 20, 3, 9}
	w = []int{20, 9, 3, 45, 4, 35}
	fmt.Println(solution(l, w))
}

func solution(lottos []int, win_nums []int) []int {
	result := 0
	zeroCount := 0

	for _, l := range lottos {
		if l == 0 {
			zeroCount++
		} else if check(win_nums, l) {
			result++
		}
	}

	min := result
	max := result + zeroCount

	if 7-max >= 6 {
		max = 6
	} else {
		max = 7 - max
	}

	if 7-min >= 6 {
		min = 6
	} else {
		min = 7 - min
	}

	return []int{max, min}
}

func check(win_nums []int, lotto int) bool {
	for _, w := range win_nums {
		if w == lotto {
			return true
		}
	}

	return false
}
