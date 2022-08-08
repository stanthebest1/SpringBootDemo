let button = document.getElementById("button")
button.onclick = getCandy;
async function getCandy(){
    try{
        const raw_response = await fetch(`http://localhost:8080/app/candies`);
        if(!raw_response.ok){
            throw new Error(raw_response.status);
        }
        const json_data = await raw_response.json();
        console.log(json_data);
        let candyId = document.getElementById("candytext")
        console.log(json_data[0]);
        console.log(json_data[0].name);
        candyId.innerHTML = `${json_data[0].name} is my favorite candy!`
    } catch (Error){
        alert ("Error: " + Error);
    }
}