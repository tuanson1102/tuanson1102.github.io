
// 2.
// const max2Numbers = function (array) {
// 	let copyArray = array.sort((a, b) => a - b);
// 	console.log(copyArray);
// 	const maxValue = array[copyArray.length - 1];
// 	for (let i = copyArray.length - 1; i >= 0; i--) {
// 		if (copyArray[i] < maxValue) {
// 			console.log(i);
// 			return copyArray[i];
// 		}
// 	}
// };

// const testArray = [1, 3, 2, 4, 2, 7, 6, 7];
// console.log(testArray);
// console.log(max2Numbers(testArray));



// 7
// const randomHexCode = function () {
// 	let result = "#";
// 	let hexCode = "";
// 	let number = 0;
// 	for (let i = 0; i < 3; i++) {
// 		number = Math.floor(Math.random() * 256);
// 		hexCode = number.toString(16);
// 		result = result.concat(hexCode);
// 	}
// 	return result;
// };

//8.
// const randomRgbCode = function () {
// 	const number1 = Math.floor(Math.random() * 256);
// 	const number2 = Math.floor(Math.random() * 256);
// 	const number3 = Math.floor(Math.random() * 256);
// 	const result = `rgb(${number1}, ${number2}, ${number3})`;
// 	return result;
// };



// 1.

// const checkStringExist = (str1, str2) => {
// 	return str1.toLocaleLowerCase().includes(str2.toLocaleLowerCase()) ||
// 		str2.toLocaleLowerCase().includes(str1.toLocaleLowerCase())
// 		? true
// 		: false;
// };

// 2.

// const shortenString = function (str) {
// 	if (str.length <= 8) {
// 		return str;
// 	} else {
// 		let result = str.slice(0, 8);
// 		result += `...`;
// 		return result;
// 	}
// };

// 3.
// const capitalizeString = function (str) {
// 	function capitalizePart(str) {
// 		str = str.toLocaleLowerCase();
// 		str = str.charAt(0).toLocaleUpperCase() + str.slice(1);
// 		return str;
// 	}
// 	let result = ``;
// 	const arrStr = str.split(` `);
// 	arrStr.forEach((element) => {
// 		result += `${capitalizePart(element)} `;
// 	});
// 	result = result.trim();
// 	return result;
// };

// 4.

// const repeatString = function (stringInit, repNum) {
// 	let result = stringInit;
// 	for (let i = 0; i < repNum - 1; i++) {
// 		result += `-${stringInit}`;
// 	}
// 	return result;
// };

// 5.

// const reverseString = function (stringInit) {
// 	let result = ``;
// 	for (let i = stringInit.length - 1; i >= 0; i--) {
// 		result += stringInit.charAt(i);
// 	}
// 	return result;
// };

// 6.

// const checkSymmetricString = function (stringInit) {
// 	const arrStr = stringInit.split(` `);
// 	let morphString = ``;
// 	arrStr.forEach((element) => {
// 		element = element.toLocaleLowerCase();
// 		morphString += element;
// 	});
// 	for (let i = 0; i < Math.floor(morphString.length / 2); i++) {
// 		if (morphString.charAt(i) !== morphString.charAt(morphString.length - 1 - i)) {
// 			return false;
// 		}
// 	}
// 	return true;
// };


