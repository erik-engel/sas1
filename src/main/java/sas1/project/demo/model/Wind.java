package sas1.project.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wind {
    @Id
    private int windId;
    private String windDirection;
    private int windSpeed;
    private int directionChange;

    public Wind() {
    }

    public Wind(int windId, String windDirection, int windSpeed) {
        this.windId = windId;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
    }



    private int windDirectionDice(){

        int diceRoll=(int)(Math.random()*12+1);
        return directionChange=diceRoll;

        // denne del er blevet lavet dobbelt og er lidt overflødig.
        // gemmer den dog til forståelse / mulig senere generisk brug
/*
        if(diceRoll== 1){
            return directionChange =-2;
        }
        else if(diceRoll==2||diceRoll==3){
            return directionChange =-1;
        }
        else if(diceRoll==4||diceRoll==5||diceRoll==6||diceRoll==7||diceRoll==8||diceRoll==9){
            return directionChange =0;
        }
        else if(diceRoll==10 || diceRoll==11){
            return directionChange +1;
        }
        else {
            return directionChange +2;
        }
       */

    }


    // mangler logik der siger at  værdien af vindens retning max må skiftes med 2 "grader"
    // vindens retning må max ændres med 2 kurser enten venstre eller højre


    // skal hente current wind direction fra databasen og så skifte den alt efter "directionChange værdien"
    public void getNewWindAttributes(){

        // ruller et dice til at bestemme rundens wind direction
        // bruges så af denne class som directionChange attribut
        windDirectionDice();

        //metode til at rulle dice og ændre wind speed
        windSpeedDiceAndChange();

        // hente wind fra db og kald den for currentDbWind
        String currentDbWind=getWindDirection();
        if(currentDbWind=="N"){
            if(directionChange==1){
                this.windDirection="SW";
            }
            else if(directionChange==2||directionChange==3){
                this.windDirection="NW";
            }
            else if(directionChange==4||directionChange==5||directionChange==6||directionChange==7||directionChange==8||directionChange==9){
                this.windDirection="N";
            }
            else if(directionChange==10||directionChange==11){
                this.windDirection="NE";
            }
            else{
                this.windDirection="SE";
            }
        }

        if(currentDbWind=="S"){
            if(directionChange==1){
                this.windDirection="SW";
            }
            else if(directionChange==2||directionChange==3){
                this.windDirection="SW";
            }
            else if(directionChange==4||directionChange==5||directionChange==6||directionChange==7||directionChange==8||directionChange==9){
                this.windDirection="S";
            }
            else if(directionChange==10||directionChange==11){
                this.windDirection="SE";
            }
            else{
                this.windDirection="NE";
            }
        }
        if(currentDbWind=="NE"){
            if(directionChange==1){
                this.windDirection="NW";
            }
            else if(directionChange==2||directionChange==3){
                this.windDirection="N";
            }
            else if(directionChange==4||directionChange==5||directionChange==6||directionChange==7||directionChange==8||directionChange==9){
                this.windDirection="NE";
            }
            else if(directionChange==10||directionChange==11){
                this.windDirection="SE";
            }
            else{
                this.windDirection="S";
            }
        }
        if(currentDbWind=="SE"){
            if(directionChange==1){
                this.windDirection="N";
            }
            else if(directionChange==2||directionChange==3){
                this.windDirection="NE";
            }
            else if(directionChange==4||directionChange==5||directionChange==6||directionChange==7||directionChange==8||directionChange==9){
                this.windDirection="SE";
            }
            else if(directionChange==10||directionChange==11){
                this.windDirection="S";
            }
            else{
                this.windDirection="SW";
            }
        }

        if(currentDbWind=="SW"){
            if(directionChange==1){
                this.windDirection="SE";
            }
            else if(directionChange==2||directionChange==3){
                this.windDirection="S";
            }
            else if(directionChange==4||directionChange==5||directionChange==6||directionChange==7||directionChange==8||directionChange==9){
                this.windDirection="SW";
            }
            else if(directionChange==10||directionChange==11){
                this.windDirection="NW";
            }
            else{
                this.windDirection="N";
            }
        }

        if(currentDbWind=="NW"){
            if(directionChange==1){
                this.windDirection="S";
            }
            else if(directionChange==2||directionChange==3){
                this.windDirection="SW";
            }
            else if(directionChange==4||directionChange==5||directionChange==6||directionChange==7||directionChange==8||directionChange==9){
                this.windDirection="NW";
            }
            else if(directionChange==10||directionChange==11){
                this.windDirection="N";
            }
            else{
                this.windDirection="NW";
            }
        }

    }

    // metoden skal rulle en random terning og give wind speed en værdi
    // denne metode skal køre efter / eller før hver rundte
    private int windSpeedDiceAndChange(){

        int diceRoll=(int)(Math.random()*12+1);

        // no wind speed change
        if(diceRoll==1){
            return this.windSpeed=0;
        }
        // laver check på om windspeed er under 0 hvis 2 trækkes fra.
        // hvis det er tilfælder så sættes windspeed til 0
        else if(diceRoll==2){
            if(this.windSpeed-2<0){
                return this.windSpeed=0;
            }
            else{
                return this.windSpeed+=-2;
            }
        }
        //laver check på om windspeed er under 0 hvis 1 trækkes fra.
        // hvis det er tilfælder så sættes windspeed til 0
        else if(diceRoll==3||diceRoll==4){
            if(this.windSpeed-1<0){
                return this.windSpeed=0;
            }
            else{
                return this.windSpeed+=-1;
            }
        }
        // laver check på om windspeed er over 8 hvis 1 lægges til
        // hvis det er tilfældet sættes windspeed til 8
        else if(diceRoll==10||diceRoll==11){
            if(this.windSpeed+1>8){
                return this.windSpeed=8;
            }
            else{
                return this.windSpeed+=1;
            }
        }
        // laver check på om windspeed er over 8 hvis 2 lægges til
        // hvis det er tilfældet sættes windspeed til 8
        else if(diceRoll==12){
            if(this.windSpeed+2>8){
                return this.windSpeed=8;
            }
            else{
                return this.windSpeed+=2;
            }
        }
        // der er nogle slag f.eks. 5,6,7,8,9 der ikke tæller for noget så derfor kun if
        // på nogle bestemet værdier og ingen ændring ved else
        else{
            return this.windSpeed;
        }
    }






    public int getWindId() {
        return windId;
    }

    public void setWindId(int windId) {
        this.windId = windId;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }
}
