package main

import "fmt"

func main()  {
	var userInput string;
	fmt.Println("Enter a string");
	fmt.Scanln(&userInput);
	var i int;
	var userInputLength = len(userInput);
	for i = 0; i < userInputLength ; i++ {
		if (userInput[i] != userInput[userInputLength - 1 - i]) {
			fmt.Println(userInput, "is not a palindrone");
			return ;
		}
	}

	fmt.Println(userInput, "is a palindrone");
}