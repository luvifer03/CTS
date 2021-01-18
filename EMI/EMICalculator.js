function calculateEMI(){
    const p =document.getElementById("principalAmount").value;
    const r_1=document.getElementById("interestRate").value;
    const n=document.getElementById("tenure").value;
    
    const r_2= (r_1/100)/12;
    const r=r_2.toFixed(2)
    const EMI = p*r*(math.pow(1+r,n)/(math.pow(1+r,n)-1));
    document.getElementById("result").innerHTML="EMI is Rs. " +EMI;
    
    console.log(EMI);
    
    
    return false;
}
