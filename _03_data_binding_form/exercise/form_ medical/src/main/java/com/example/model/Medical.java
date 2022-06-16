package com.example.model;

public class Medical {
    private String name;
    private String birthday;
    private String gender;
    private String nationality;
    private String idNumber;
    private String transport;
    private String idTransport;
    private String seats;
    private String startDay;
    private String endDay;
    private String startMonth;
    private String endMonth;
    private String startYear;
    private String endYear;
    private String historyMove;

    public Medical() {
    }

    public Medical(String name, String birthday, String gender, String nationality, String idNumber, String transport, String idTransport, String seats, String startDay, String endDay, String startMonth, String endMonth, String startYear, String endYear, String historyMove) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.nationality = nationality;
        this.idNumber = idNumber;
        this.transport = transport;
        this.idTransport = idTransport;
        this.seats = seats;
        this.startDay = startDay;
        this.endDay = endDay;
        this.startMonth = startMonth;
        this.endMonth = endMonth;
        this.startYear = startYear;
        this.endYear = endYear;
        this.historyMove = historyMove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    public String getIdTransport() {
        return idTransport;
    }

    public void setIdTransport(String idTransport) {
        this.idTransport = idTransport;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDay() {
        return endDay;
    }

    public void setEndDay(String endDay) {
        this.endDay = endDay;
    }

    public String getStartMonth() {
        return startMonth;
    }

    public void setStartMonth(String startMonth) {
        this.startMonth = startMonth;
    }

    public String getEndMonth() {
        return endMonth;
    }

    public void setEndMonth(String endMonth) {
        this.endMonth = endMonth;
    }

    public String getStartYear() {
        return startYear;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public String getHistoryMove() {
        return historyMove;
    }

    public void setHistoryMove(String historyMove) {
        this.historyMove = historyMove;
    }
}
