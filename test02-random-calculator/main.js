let primaryNumEle = document.querySelector('#primary-number')
let secondaryNumEle = document.querySelector('#secondary-number')
let operatorEle = document.querySelector('#operator')
let guessEle = document.querySelector('#result')
let scoreEle = document.querySelector('.score')
let timeEle = document.querySelector('.time')
const btnStartGameEle = document.querySelector('#start')

let firstNumber;
let secondNumber;
let operators = ['+', '-', '*'];
let operator;
let total;
let time;
let interval;
let score;



btnStartGameEle.addEventListener('click',function(){
    startGame();
})


function randomNumber() {
    firstNumber = Math.floor(Math.random() * 10)
    secondNumber = Math.floor(Math.random() * 10)
    operator = operators[Math.floor(Math.random() * (operators.length))]
    total = eval(`${firstNumber} ${operator} ${secondNumber}`)
    primaryNumEle.innerText = firstNumber
    secondaryNumEle.innerText = secondNumber
    operatorEle.innerText = operator
}

function startGame() {
    time = 30;
    score = 0;
    scoreEle.innerText = score;
    randomNumber()
    interval = setInterval(countDown, 1000)
}

guessEle.addEventListener('keydown', function (event) {
    if (event.keyCode === 13) {
        let value = Number(this.value);
        if (value == total) {
            randomNumber();
            this.value = '';
            scoreEle.innerHTML++
        } else {
            this.value = '';
            return;
        }
    }
});


function countDown() {
    time--
    timeEle.innerText = time;
    if (time == 0) {
        clearInterval(interval);
        alert("Chức Mừng Bạn Đạt Được :" + scoreEle.innerHTML++ + " điểm");
    }
}