let userScore = 0;
let computerScore = 0;

const userScore_span = document.getElementById("user-score");
const computerScore_span = document.getElementById("computer-score");

const scoreBoard_div = document.querySelector(".scoreBoard");
const result_p = document.querySelector(".result > p");

const rock_div = document.getElementById("r");
const paper_div = document.getElementById("p");
const scissors_div = document.getElementById("s");

function getComputerChoice() {
    const choices = ["r", "p", "s"];
    const randomNumber = Math.floor(Math.random()*3);
    return choices[randomNumber];
}

function convertToStrongWord(letter) {
    if(letter === 'r') return "<strong>Rock</strong>";
    if(letter === 'p') return "<strong>Paper</strong>";
    return "<strong>Scissors</strong>";
}

function win(userChoice, computerChoice) {
    const userChoice_div = document.getElementById(userChoice);
    userScore++;
    userScore_span.innerHTML = userScore; 
    result_p.innerHTML = `User's ${convertToStrongWord(userChoice)} beats Computer's ${convertToStrongWord(computerChoice)}. You Win!`;
    userChoice_div.classList.add("green_glow");
    setTimeout(function() { userChoice_div.classList.remove("green_glow") }, 500);
}

function lost(userChoice, computerChoice) {
    const userChoice_div = document.getElementById(userChoice);
    computerScore++;
    computerScore_span.innerHTML = computerScore;
    result_p.innerHTML = `Computer's ${convertToStrongWord(computerChoice)} beats User's ${convertToStrongWord(userChoice)}. You Lose!`;
    userChoice_div.classList.add("red_glow");
    setTimeout(function() { userChoice_div.classList.remove("red_glow") }, 500);
}

function draw(userChoice, computerChoice) {
    const userChoice_div = document.getElementById(userChoice);
    result_p.innerHTML = `It's draw between User's ${convertToStrongWord(userChoice)} and Computer's ${convertToStrongWord(computerChoice)}.`;
    userChoice_div.classList.add("grey_glow");
    setTimeout(function() { userChoice_div.classList.remove("grey_glow") }, 500);
}

function game(userChoice) {
    const computerChoice = getComputerChoice();
    switch(userChoice + computerChoice) {
        case "pr":
        case "rs":
        case "sp":
            win(userChoice, computerChoice);
            break;
        case "rp":
        case "ps":
        case "sr":
            lost(userChoice, computerChoice);
            break;
        case "rr":
        case "pp":
        case "ss":
            draw(userChoice, computerChoice);
            break;
    }
}

function main() {
    rock_div.addEventListener('click', function() {
        game('r');
    });

    paper_div.addEventListener('click', function() {
        game('p');
    });
    
    scissors_div.addEventListener('click', function() {
        game('s');
    });
}
main();