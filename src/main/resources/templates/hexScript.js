
function createRow(x, y){
    for (i = 0; i < x; i++){
        name = "row-even"
        if (i % 2 === 0){
            name = "row"
        }
        const row = document.createElement("div");
        row.classList.add(name);
        const el = document.getElementById("board");
        el.appendChild(row);
        for (j = 0; j < y; j++){
            const hex = document.createElement("div");
            hex.id = i + "," + j;
            hex.classList.add("hexagon");
            hex.classList.add("wave");
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
    ship = document.getElementById(shipPosition);
    ship.classList.remove("wave");
    ship.classList.add("ship");
}

function setWave(shipPosition){
    ship = document.getElementById(shipPosition);
    ship.classList.remove("ship");
    ship.classList.add("wave");
}