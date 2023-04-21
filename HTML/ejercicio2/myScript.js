function calculator(){

    let number1 = document.getElementById("field1").valueAsNumber;
    let number2 = document.getElementById("field2").valueAsNumber;
    let simbolo = document.getElementById("symbol").value;
    document.getElementById("result").innerHTML = number1;
    document.getElementById("result2").innerHTML = number2;
    document.getElementById("result1").innerHTML = simbolo;

    if(simbolo == "+"){
        document.getElementById("resultado").innerHTML = number1 + number2;
    }else if (simbolo == "-"){
        document.getElementById("resultado").innerHTML = number1 - number2;
    }
    else if (simbolo == "*"){
        document.getElementById("resultado").innerHTML = number1 * number2;
    }else if (simbolo == "/"){
        document.getElementById("resultado").innerHTML = number1 / number2;
    }else if (simbolo == "%"){
        document.getElementById("resultado").innerHTML = number1 % number2;
    }else if (simbolo == "^"){
        document.getElementById("resultado").innerHTML = number1 ** number2;
    }
}
