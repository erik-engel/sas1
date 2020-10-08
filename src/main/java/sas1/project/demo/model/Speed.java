package sas1.project.demo.model;

public class Speed {

        Ship ship;
        Wind wind;
        private int currentSpeed = 0;
        private int speedIncrement = 0;

        public Speed(Ship ship, Wind wind) {
            this.ship = ship;
            this.wind = wind;
        }

        public int getCurrentSpeed() {
            return currentSpeed;
        }

        public void setCurrentSpeed(int currentSpeed) {
            this.currentSpeed = currentSpeed;
        }

        public int speedChange(){
            if (ship instanceof shipBrig){
                if( ship.getSails() <= 2 && ship.getSails() >=1 ) {
                    ship.setMaxSpeed(1);
                }else if(ship.getSails() == 0){
                    ship.setMaxSpeed(0);
                }
            }
            else if (ship instanceof shipShipOfLine){
                if (ship.getSails() <= 5 && ship.getSails() >= 3) {
                    ship.setMaxSpeed(3);
                }else if(ship.getSails() == 2){
                    ship.setMaxSpeed(2);
                }
                else if(ship.getSails() == 1){
                    ship.setMaxSpeed(1);
                }
                else if(ship.getSails() == 0){
                    ship.setMaxSpeed(0);
                }
            }
            else if (ship instanceof shipManAtWar){
                if(ship.getSails() <= 12 && ship.getSails() > 6 ){
                    ship.setMaxSpeed(3);
                }else if(ship.getSails() <= 6 && ship.getSails() > 2){
                    ship.setMaxSpeed(2);
                }else if(ship.getSails() == 2 || ship.getSails() == 1){
                    ship.setMaxSpeed(1);
                }else if (ship.getSails() == 0){
                    ship.setMaxSpeed(0);
                }
            }
            switch (wind.getWindDirection()){
                case "N":
                    if(ship.getDirection().equals(Ship.Direction.N) || ship.getDirection().equals(Ship.Direction.NE) || ship.getDirection().equals(Ship.Direction.NW)){
                        if(wind.getWindSpeed()>ship.getMaxSpeedChange()){
                            currentSpeed = ship.getSpeed() + ship.getMaxSpeedChange();
                        }
                        else{
                            currentSpeed = ship.getSpeed() + wind.getWindSpeed();
                        }
                    }
                    else if(ship.getDirection().equals(Ship.Direction.SE) || ship.getDirection().equals(Ship.Direction.SW)){
                        currentSpeed = ship.getSpeed() -1;
                    }
                    else if(ship.getDirection().equals(Ship.Direction.S)){
                        currentSpeed = 0;
                    }
                    break;
                case "NE":
                    if(ship.getDirection().equals(Ship.Direction.NE) || ship.getDirection().equals(Ship.Direction.N) || ship.getDirection().equals(Ship.Direction.SE)){
                        if(wind.getWindSpeed()>ship.getMaxSpeedChange()){
                            currentSpeed = ship.getSpeed() + ship.getMaxSpeedChange();
                        }
                        else{
                            currentSpeed = ship.getSpeed() + wind.getWindSpeed();
                        }
                    }
                    else if(ship.getDirection().equals(Ship.Direction.S) || ship.getDirection().equals(Ship.Direction.NW)){
                        currentSpeed = ship.getSpeed() -1;
                    }
                    else if(ship.getDirection().equals(Ship.Direction.SW)){
                        currentSpeed = 0;
                    }
                    break;
                case "SE":
                    if(ship.getDirection().equals(Ship.Direction.SE) || ship.getDirection().equals(Ship.Direction.NE) || ship.getDirection().equals(Ship.Direction.S)){
                        if(wind.getWindSpeed()>ship.getMaxSpeedChange()){
                            currentSpeed = ship.getSpeed() + ship.getMaxSpeedChange();
                        }
                        else{
                            currentSpeed = ship.getSpeed() + wind.getWindSpeed();
                        }
                    }
                    else if(ship.getDirection().equals(Ship.Direction.SW) || ship.getDirection().equals(Ship.Direction.N)){
                        currentSpeed = ship.getSpeed() -1;
                    }
                    else if(ship.getDirection().equals(Ship.Direction.NW)){
                        currentSpeed = 0;
                    }
                    break;
                case "S":
                    if(ship.getDirection().equals(Ship.Direction.S) || ship.getDirection().equals(Ship.Direction.SE) || ship.getDirection().equals(Ship.Direction.SW)){
                        if(wind.getWindSpeed()>ship.getMaxSpeedChange()){
                            currentSpeed = ship.getSpeed() + ship.getMaxSpeedChange();
                        }
                        else{
                            currentSpeed = ship.getSpeed() + wind.getWindSpeed();
                        }
                    }
                    else if(ship.getDirection().equals(Ship.Direction.NE) || ship.getDirection().equals(Ship.Direction.NW)){
                        currentSpeed = ship.getSpeed() -1;
                    }
                    else if(ship.getDirection().equals(Ship.Direction.N)){
                        currentSpeed = 0;
                    }
                    break;
                case "SW":
                    if(ship.getDirection().equals(Ship.Direction.SW) || ship.getDirection().equals(Ship.Direction.S) || ship.getDirection().equals(Ship.Direction.NW)){
                        if(wind.getWindSpeed()>ship.getMaxSpeedChange()){
                            currentSpeed = ship.getSpeed() + ship.getMaxSpeedChange();
                        }
                        else{
                            currentSpeed = ship.getSpeed() + wind.getWindSpeed();
                        }
                    }
                    else if(ship.getDirection().equals(Ship.Direction.SE) || ship.getDirection().equals(Ship.Direction.N)){
                        currentSpeed = ship.getSpeed() -1;
                    }
                    else if(ship.getDirection().equals(Ship.Direction.NE)){
                        currentSpeed = 0;
                    }
                    break;
                case "NW":
                    if(ship.getDirection().equals(Ship.Direction.NW) || ship.getDirection().equals(Ship.Direction.SW) || ship.getDirection().equals(Ship.Direction.N)){
                        if(wind.getWindSpeed()>ship.getMaxSpeedChange()){
                            currentSpeed = ship.getSpeed() + ship.getMaxSpeedChange();
                        }
                        else{
                            currentSpeed = ship.getSpeed() + wind.getWindSpeed();
                        }
                    }
                    else if(ship.getDirection().equals(Ship.Direction.S) || ship.getDirection().equals(Ship.Direction.NE)){
                        currentSpeed = ship.getSpeed() -1;
                    }
                    else if(ship.getDirection().equals(Ship.Direction.SE)){
                        currentSpeed = 0;
                    }
                    break;
            }
            if(currentSpeed > ship.getMaxSpeed()){
                currentSpeed = ship.getMaxSpeed();
            }
            return currentSpeed;
        }
        @Override
        public String toString() {
            return "Speed{" +
                    "ship=" + ship +
                    ", wind=" + wind +
                    ", currentspeed=" + currentSpeed +
                    '}';
        }
    }
