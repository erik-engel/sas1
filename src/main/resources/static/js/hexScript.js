var moveAction = false;
var aimAction = false;

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
                if (moveAction) {
                    if (hex.classList.contains("moveable")){
                        removeMoveto();
                        hex.classList.add("moveto");
                    }
                }
                if (aimAction) {
                    if (hex.classList.contains("aimable")){
                        removeAimto();
                        hex.classList.add("aimto");
                    }
                }
            })
            row.appendChild(hex);
        }
    }
}

function removeMoveto(){
    let aim = document.getElementsByClassName("moveto");
    while (aim.length > 0) {
        aim[0].classList.remove("moveto");
    }
}

function removeAimto(){
    let aim = document.getElementsByClassName("aimto");
    while (aim.length > 0) {
        aim[0].classList.remove("aimto");
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

function setAimAble(hexList){
    for (let i = 0; i < hexList.length; i++){
        hexList[i].classList.add("aimable")
    }
}

function removeSailAble(){
    let sail = document.getElementsByClassName("moveable");
    while (sail.length > 0){
        console.log(sail[0].id)
        sail[0].classList.remove("moveable");
    }
}

function removeAimAble(){
    let sail = document.getElementsByClassName("aimable");
    while (sail.length > 0){
        console.log(sail[0].id)
        sail[0].classList.remove("aimable");
    }
}

function testStart(){
    moveAction = true;
    setShip('2,2')
    let sailList = [];
    sailList.push(document.getElementById("3,2"));
    sailList.push(document.getElementById("3,3"));
    sailList.push(document.getElementById("2,3"));
    setSailAble(sailList);
}

function testStart2(){
    moveAction = false;
    aimAction = true;
    removeSailAble()
    let aimList = [];
    aimList.push(document.getElementById("2,0"));
    aimList.push(document.getElementById("3,1"));
    aimList.push(document.getElementById("4,1"));
    aimList.push(document.getElementById("0,3"));
    aimList.push(document.getElementById("1,4"));
    aimList.push(document.getElementById("2,4"));
    setAimAble(aimList);
}

