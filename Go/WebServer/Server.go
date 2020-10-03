package main

import (
	"fmt"
	"net/http"
	"log"
)

func indexHandler(w http.ResponseWriter, r *http.Request) {
	fmt.Fprintf(w, "Hello World");
}

func main() {
	http.HandleFunc("/", indexHandler);
	log.Print("Starting server on localhost:8080");
	if err := http.ListenAndServe(":8080", nil);
	err != nil {
		log.Fatal(err);
	}
}