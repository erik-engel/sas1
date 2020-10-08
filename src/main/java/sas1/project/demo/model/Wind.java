package sas1.project.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wind {
    @Id
    private int windId;
    private String windDirection;
    private int windSpeed;

    public Wind() {
    }

    public Wind(int windId, String windDirection, int windSpeed) {
        this.windId = windId;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
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
