package main

import (
	"fmt"
	"strings"
)

func main() {
	idList := []string{"muzi", "frodo", "apeach", "neo"}
	report := []string{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}
	k := 2
	fmt.Println(solution(idList, report, k))

	idList = []string{"con", "ryan"}
	report = []string{"ryan con", "ryan con", "ryan con", "ryan con"}
	k = 3
	fmt.Println(solution(idList, report, k))
}

func solution(id_list []string, report []string, k int) []int {
	var (
		totalMap   map[string]map[string]bool = make(map[string]map[string]bool, 0)
		selectMap  map[string]int             = make(map[string]int, 0)
		reusltName []string
		result     []int
	)

	for _, r := range report {
		user := strings.Split(r, " ")
		if totalMap[user[0]] == nil {
			totalMap[user[0]] = make(map[string]bool)
		}

		totalMap[user[0]][user[1]] = true
	}

	for _, a := range id_list {
		for _, b := range id_list {
			if totalMap[a][b] {
				selectMap[b] += 1
			}
		}
	}

	for key, value := range selectMap {
		if value >= k {
			reusltName = append(reusltName, key)
		}
	}

	for _, value := range id_list {
		count := 0

		for _, name := range reusltName {
			if totalMap[value][name] {
				count++
			}
		}

		result = append(result, count)
	}

	return result
}
