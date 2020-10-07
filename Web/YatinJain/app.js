let roundNumber = 0;
let userScore = 0;
let computerScore = 0;

const userScore_span = document.getElementById("user-score");
const computerScore_span = document.getElementById("computer-score");
const roundNumber_span = document.getElementById("round-count");
const scoreBoard_div = document.querySelector(".scoreBoard");
const result_p = document.querySelector(".result > p");
const rock_div = document.getElementById("rock");
const paper_div = document.getElementById("paper");
const scissors_div = document.getElementById("scissors");

function getComputerChoice() {
    const choices = ["rock", "paper", "scissors"];
    const randomNumber = Math.floor(Math.random() * 3);
    return choices[randomNumber];
}

function convertToStrongTitle(word) {
    if (word === 'rock') return "<strong>Rock</strong>";
    if (word === 'paper') return "<strong>Paper</strong>";
    return "<strong>Scissors</strong>";
}

function updateRound() {
    roundNumber++;
    roundNumber_span.innerHTML = roundNumber;
}

function win(userChoice, computerChoice) {
    const userChoice_div = document.getElementById(userChoice);
    userScore++;
    userScore_span.innerHTML = userScore;
    result_p.innerHTML = `User's ${convertToStrongTitle(userChoice)} beats Computer's ${convertToStrongTitle(computerChoice)}. You Win!`;
    userChoice_div.classList.add("green_glow");
    setTimeout(() => userChoice_div.classList.remove("green_glow"), 500);
}

function lost(userChoice, computerChoice) {
    const userChoice_div = document.getElementById(userChoice);
    computerScore++;
    computerScore_span.innerHTML = computerScore;
    result_p.innerHTML = `Computer's ${convertToStrongTitle(computerChoice)} beats User's ${convertToStrongTitle(userChoice)}. You Lose!`;
    userChoice_div.classList.add("red_glow");
    setTimeout(() => userChoice_div.classList.remove("red_glow"), 500);
}

function draw(userChoice, computerChoice) {
    const userChoice_div = document.getElementById(userChoice);
    result_p.innerHTML = `It's draw between User's ${convertToStrongTitle(userChoice)} and Computer's ${convertToStrongTitle(computerChoice)}.`;
    userChoice_div.classList.add("dark_glow");
    setTimeout(() => userChoice_div.classList.remove("dark_glow"), 500);
}

function game(userChoice) {
    updateRound();
    const computerChoice = getComputerChoice();
    switch (userChoice + "_" + computerChoice) {
        case "paper_rock":
        case "rock_scissors":
        case "scissors_paper":
            win(userChoice, computerChoice);
            break;
        case "rock_paper":
        case "paper_scissors":
        case "scissors_rock":
            lost(userChoice, computerChoice);
            break;
        case "rock_rock":
        case "paper_paper":
        case "scissors_scissors":
            draw(userChoice, computerChoice);
            break;
    }
}

function main() {
    rock_div.addEventListener('click', () => game('rock'));

    paper_div.addEventListener('click', () => game('paper'));

    scissors_div.addEventListener('click', () => game('scissors'));
}
main();