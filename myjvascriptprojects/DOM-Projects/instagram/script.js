var istatus =document.querySelector("h5")

var btn =document.querySelector("#add")

 var flag=0

btn.addEventListener("click",function(){
    if (flag==0) {
        istatus.innerHTML = "Friends" 
    istatus.style.color ="green"
btn.innerHTML ="Remove Friends"
    flag=1
        
    }else{
         istatus.innerHTML = "Stranger" 
    istatus.style.color ="Red"
    btn.innerHTML ="Add Friends"
    flag=0
    }
    
})



//method2 using remove button
/*var istatus =document.querySelector("h5")

var addFriend =document.querySelector("#add")
var RemoveFriend =document.querySelector("#Remove")

  addFriend.addEventListener("click",function(){
    istatus.innerHTML = "Friends" 
    istatus.style.color ="green"

})
RemoveFriend.addEventListener("click",function(){
    istatus.innerHTML = "Stranger" 
    istatus.style.color ="Red"

})*/