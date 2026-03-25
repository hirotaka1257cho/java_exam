'use strict';

//  問題1
    console.log('横山広隆');

// 問題2
    let firstName = 'hirotaka';
    let lastName = 'yokoyama';
    console.log(firstName + ' ' + lastName);
// 問題3
    let yen = (200 * 3) + (250 * 4);
    let tax = yen * 0.1;
    let total = yen + tax;

    console.log('小計');
    console.log(yen);
    console.log('消費税');
    console.log(tax);
    console.log('合計金額');
    console.log(total);

//問題4
    let testScore = 101;
    if(testScore >= 0 && testScore <= 79){
        console.log('追試です')
    }else if(testScore >=80 && testScore <= 100){
        console.log('合格です')
    }else{
        console.log('存在しない点数です');
    }

//問題5
    let sum = 0;
    for(let i = 1; i <= 100; i++){
        sum = sum + i;
    }
    console.log(sum);

//問題6
    function add(x, y){
        return x + y;
    }
    function sub(x, y){
        return x - y;
    }
    function multi(x, y){
        return x * y;
    }
    function div(x, y){
        return x / y;
    }
    console.log('5 + 3 = ' + add(5, 3));
    console.log('5 - 3 = ' + sub(5, 3));
    console.log('5 * 3 = ' + multi(5, 3));
    console.log('5 / 3 = ' + div(5, 3));
