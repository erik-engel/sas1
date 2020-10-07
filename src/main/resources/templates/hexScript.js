function createRow(x, y){
    let name;
    for (let i = 0; i < x; i++){
        name = "row-even"
        if (i % 2 === 0){
            name = "row"
        }
        const row = document.createElement("div");
        row.classList.add(name);
        const el = document.getElementById("board");
        el.appendChild(row);
        for (let j = 0; j < y; j++){
            const hex = document.createElement("div");
            hex.id = i + "," + j;
            hex.classList.add("hexagon", "wave");
            hex.addEventListener("click", function (e){
                if (hex.classList.contains("wave")){
                setShip(hex.id);
                } else {
                    setWave(hex.id);
                }
            })
            row.appendChild(hex);
        }
    }
}

function setShip(shipPosition){
    let ship = document.getElementById(shipPosition);
    ship.classList.remove("wave");
    ship.classList.add("ship");
}

function setWave(shipPosition){
    let ship = document.getElementById(shipPosition);
    ship.classList.remove("ship");
    ship.classList.add("wave");
}

function setSailAble(hexList){
    for (let i = 0; i < hexList.length; i++){
        hexList[i].classList.add("moveable");
    }
}

function removeSailAble(){
    let sail = document.getElementsByClassName("moveable");
    while (sail.length > 0){
        console.log(sail[0].id)
        sail[0].classList.remove("moveable");
    }
}

function sailListTest(){
    let sailList = [];
    sailList.push(document.getElementById("1,1"));
    sailList.push(document.getElementById("2,2"));
    sailList.push(document.getElementById("3,3"));
    return sailList;
}