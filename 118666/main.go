package main

import "fmt"

func main() {
	survery := []string{"AN", "CF", "MJ", "RT", "NA"}
	choices := []int{5, 3, 2, 7, 5}
	fmt.Println(solution(survery, choices))

	survery = []string{"TR", "RT", "TR"}
	choices = []int{7, 1, 3}
	fmt.Println(solution(survery, choices))
}

func solution(survey []string, choices []int) string {
	var (
		mapList map[string]int = make(map[string]int, 0)
		result  string         = ""
	)

	for i, s := range survey {
		diff := choices[i] - 4

		if diff > 0 {
			mapList[string(s[1])] += diff
		} else if diff < 0 {
			mapList[string(s[0])] += diff * -1
		}
	}

	if mapList["R"]-mapList["T"] >= 0 {
		result += "R"
	} else {
		result += "T"
	}

	if mapList["C"]-mapList["F"] >= 0 {
		result += "C"
	} else {
		result += "F"
	}

	if mapList["J"]-mapList["M"] >= 0 {
		result += "J"
	} else {
		result += "M"
	}

	if mapList["A"]-mapList["N"] >= 0 {
		result += "A"
	} else {
		result += "N"
	}

	return result
}
