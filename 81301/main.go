package main

import (
	"fmt"
	"strconv"
	"strings"
)

func main() {
	s := "one4seveneight"
	fmt.Println(solution(s))

	s = "23four5six7"
	fmt.Println(solution(s))

	s = "2three45sixseven"
	fmt.Println(solution(s))

	s = "123"
	fmt.Println(solution(s))
}

// func solution(s string) int {
// 	numbers := []string{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}
// 	result := ""
// 	char := ""

// 	for _, a := range s {
// 		char += string(a)

// 		if re, err := strconv.Atoi(string(char)); err == nil {
// 			result += strconv.Itoa(re)
// 			char = ""
// 		} else {
// 			for idx, n := range numbers {
// 				if strings.EqualFold(char, n) {
// 					result += strconv.Itoa(idx)
// 					char = ""
// 					break
// 				}
// 			}
// 		}
// 	}

// 	answer, _ := strconv.Atoi(result)

// 	return answer
// }

func solution(s string) int {
	f := strings.NewReplacer(
		"zero", "0",
		"one", "1",
		"two", "2",
		"three", "3",
		"four", "4",
		"five", "5",
		"six", "6",
		"seven", "7",
		"eight", "8",
		"nine", "9",
	)

	i, _ := strconv.Atoi(f.Replace(s))
	return i
}
