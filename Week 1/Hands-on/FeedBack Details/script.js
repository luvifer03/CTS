var feedbk = [];
function addFeedback(){
    var text = document.getElementById("feedback").value;
    feedbk.push(text);
    document.getElementById("feedback").value="";
    document.getElementById("result").innerHTML="<h2>Feedback Details</h2><br>Successfully Added Feedback Details!";
}

function displayFeedback(){
    var op="";
    for (var i = 0; i < feedbk.length; i++) {
        op+="Feedback "+(i+1)+"<br>"+feedbk[i]+"<br>";
    }
    document.getElementById("result").innerHTML="<h2>Feedback Details</h2>"+op;
    feed.length=0;
}