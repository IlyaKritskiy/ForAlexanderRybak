package com.OOP.bus;

public class Bus {

    private String name;
    private String busNumber;
    private int wayNumber;
    private String mark;
    private String yearStartUsing;
    private int distance;

    public Bus(){

    }

    public Bus(String name, String busNumber, int wayNumber, String mark, String yearStartUsing, int distance){
        this.name = name;
        this.busNumber = busNumber;
        this.wayNumber = wayNumber;
        this.mark = mark;
        this.yearStartUsing = yearStartUsing;
        this.distance = distance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBusNumber(String busNumber) {
        this.busNumber = busNumber;
    }

    public String getBusNumber(){
        return busNumber;
    }

    public void setWayNumber(int wayNumber){
        this.wayNumber = wayNumber;
    }

    public int getWayNumber(){
        return wayNumber;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setYearStartUsing(String yearStartUsing) {
        this.yearStartUsing = yearStartUsing;
    }

    public String getYearStartUsing() {
        return yearStartUsing;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    static class BusServiceTest {



    }

    public static class BusService {

        public Bus[] getBusesByWay(Bus[] buses, int way){
            Bus[] resBuses = new Bus[buses.length];
            int index = 0;
            for(Bus bus: buses) {
                if (bus.getWayNumber() == way){
                    resBuses[index] = bus;
                    index++;
                }
            }
            return resBuses;
        }

        public Bus[] getBusesByYear(Bus[] buses, String yearStartUsing){
            Bus[] resBuses = new Bus[buses.length];
            int index = 0;
            for (Bus bus : buses){
                if(bus.getYearStartUsing().equals(yearStartUsing)){
                    resBuses[index] = bus;
                    index++;
                }
            }
            return resBuses;
        }

        public Bus[] getBusesMoreDistance(Bus[] buses, int distance){
            Bus[] resBuses = new Bus[buses.length];
            int index = 0;
            for(Bus bus : buses){
                if(bus.getDistance() >= distance){
                    resBuses[index] = bus;
                    index++;
                }
            }
            return resBuses;
        }
    }

    public static class BusMain {
        public static void main(String[] args) {
        }
    }
}
