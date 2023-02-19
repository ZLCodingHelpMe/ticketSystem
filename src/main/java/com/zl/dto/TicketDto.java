package com.zl.dto;

import com.zl.entity.Ticket;

import java.text.SimpleDateFormat;

public class TicketDto {

    String movieName;
    String cinemaName;
    String cinemaAddress;
    String cinemaPhone;
    String playTimeStart;
    String playTimeEnd;
    Integer minuteToStartPlay;
    Integer totalTime;
    String price;
    String orderTime;
    String takeTicketStatus;
    String Status;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaAddress() {
        return cinemaAddress;
    }

    public void setCinemaAddress(String cinemaAddress) {
        this.cinemaAddress = cinemaAddress;
    }

    public String getCinemaPhone() {
        return cinemaPhone;
    }

    public void setCinemaPhone(String cinemaPhone) {
        this.cinemaPhone = cinemaPhone;
    }

    public String getPlayTimeStart() {
        return playTimeStart;
    }

    public void setPlayTimeStart(String playTimeStart) {
        this.playTimeStart = playTimeStart;
    }

    public String getPlayTimeEnd() {
        return playTimeEnd;
    }

    public void setPlayTimeEnd(String playTimeEnd) {
        this.playTimeEnd = playTimeEnd;
    }

    public Integer getMinuteToStartPlay() {
        return minuteToStartPlay;
    }

    public void setMinuteToStartPlay(Integer minuteToStartPlay) {
        this.minuteToStartPlay = minuteToStartPlay;
    }

    public Integer getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Integer totalTime) {
        this.totalTime = totalTime;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getTakeTicketStatus() {
        return takeTicketStatus;
    }

    public void setTakeTicketStatus(String takeTicketStatus) {
        this.takeTicketStatus = takeTicketStatus;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public TicketDto() {
    }

    public TicketDto(Ticket ticket) {
        this.movieName = ticket.getMovieName();
        this.cinemaName = ticket.getCinemaName();
        this.cinemaAddress = ticket.getCinemaAddress();
        this.cinemaPhone = ticket.getCinemaPhone();
        this.playTimeStart = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(ticket.getPlayTimeStart());
        this.playTimeEnd = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(ticket.getPlayTimeEnd());
        this.price = String.format("%.2f", ticket.getTicketPrice());
        this.orderTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(ticket.getOrderTime());
        this.takeTicketStatus = ticket.getTakeTicketStatus() == 0 ? "待取票" : "已取票";


    }
}
