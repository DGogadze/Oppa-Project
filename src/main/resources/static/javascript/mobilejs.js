function validate() {
    let stringAmount = document.getElementById("amount").value;
    let floatAmount = parseFloat(stringAmount);
    let result = " საკომისიო შეადგენს:";
    if (floatAmount>0.5){
        result+=(floatAmount*1/100);
    } else {
        result+=0.50;
    }
    document.getElementById("result").innerHTML = result;
}