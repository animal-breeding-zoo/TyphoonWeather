package date.pm25.model;

import java.util.Date;

/**
 * Created by toy on 22/04/2017.
 */

public class AqiChina {
    private Integer id;
    private String queryId;
    private String area;
    private Integer d1;
    private Date timePoint;
    private Integer aqi;
    private String positionName;
    private String stationCode;
    private Integer ozone;
    private Integer pm25;
    private Integer pm10;
    private Integer sulfurDioxide;
    private Integer nitrogenDioxide;
    private Double carbonicOxide;
    private String primaryPollutants;
    private String airQuality;
    private Date updatedTime;
    private Date createdTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQueryId() {
        return queryId;
    }

    public void setQueryId(String queryId) {
        this.queryId = queryId;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Integer getD1() {
        return d1;
    }

    public void setD1(Integer d1) {
        this.d1 = d1;
    }

    public Date getTimePoint() {
        return timePoint;
    }

    public void setTimePoint(Date timePoint) {
        this.timePoint = timePoint;
    }

    public Integer getAqi() {
        return aqi;
    }

    public void setAqi(Integer aqi) {
        this.aqi = aqi;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getStationCode() {
        return stationCode;
    }

    public void setStationCode(String stationCode) {
        this.stationCode = stationCode;
    }

    public Integer getOzone() {
        return ozone;
    }

    public void setOzone(Integer ozone) {
        this.ozone = ozone;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getSulfurDioxide() {
        return sulfurDioxide;
    }

    public void setSulfurDioxide(Integer sulfurDioxide) {
        this.sulfurDioxide = sulfurDioxide;
    }

    public Integer getNitrogenDioxide() {
        return nitrogenDioxide;
    }

    public void setNitrogenDioxide(Integer nitrogenDioxide) {
        this.nitrogenDioxide = nitrogenDioxide;
    }

    public Double getCarbonicOxide() {
        return carbonicOxide;
    }

    public void setCarbonicOxide(Double carbonicOxide) {
        this.carbonicOxide = carbonicOxide;
    }

    public String getPrimaryPollutants() {
        return primaryPollutants;
    }

    public void setPrimaryPollutants(String primaryPollutants) {
        this.primaryPollutants = primaryPollutants;
    }

    public String getAirQuality() {
        return airQuality;
    }

    public void setAirQuality(String airQuality) {
        this.airQuality = airQuality;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
