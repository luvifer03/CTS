function calculateEMI(){
    var p = document.getElementById("principalAmount").value;
    var r = document.getElementById("interestRate").value;
    var n = document.getElementById("tenure").value;
    
    var R = (r/100)/12;
    var a = (Math.pow((1+R),n));
    var b = a-1;
    var c = a/b;
    
    ans = p*R*c;
    EMI = ans.toFixed(2);
    document.getElementById("result").innerHTML="EMI is Rs." +EMI;
    
    return false;
}