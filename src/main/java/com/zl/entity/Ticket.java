package com.zl.entity;

import java.util.Date;

public class Ticket {

    //    1 id 排队 ID 长整数 主键 自动增长
    Long id;
    //2 number 取票码 字符串 非空 8 位数字
    String number;
    //3 order_time 购票时间 日期 非空 如：2021-02-22 22:22:21
    Date orderTime;
    //4 take_ticket_time 取票时间 日期 非空 如：2021-02-22 22:22:21
    Date takeTicketTime;
    //5 take_ticket_status 取票状态 整形 非空 0:待取票，1:已取票
    Integer takeTicketStatus;
    //6 movie_name 电影名称 字符串 非空 长度为 32 位
    String movieName;
    //7 cinema_name 影院名称 字符串 非空 长度为 32 位
    String cinemaName;
    //8 cinema_address 影院地址 字符串 非空 长度为 128 位
    String cinemaAddress;
    //9 cinema_phone 影院电话 字符串 非空 11 位手机电话号码
    String cinemaPhone;
    //10 ticket_price 电影票价格 字符串 非空 浮点型字符串
    Double ticketPrice;
    //11 play_time_end 开始放映时间 日期 非空 如：2021-02-22 22:22:21
    Date playTimeEnd;
    // 12 play_time_start 结束放映时间 日期 非空 如：2021-02-22 23:22:21
    Date playTimeStart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getTakeTicketTime() {
        return takeTicketTime;
    }

    public void setTakeTicketTime(Date takeTicketTime) {
        this.takeTicketTime = takeTicketTime;
    }

    public Integer getTakeTicketStatus() {
        return takeTicketStatus;
    }

    public void setTakeTicketStatus(Integer takeTicketStatus) {
        this.takeTicketStatus = takeTicketStatus;
    }

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

    public Double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(Double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Date getPlayTimeEnd() {
        return playTimeEnd;
    }

    public void setPlayTimeEnd(Date playTimeEnd) {
        this.playTimeEnd = playTimeEnd;
    }

    public Date getPlayTimeStart() {
        return playTimeStart;
    }

    public void setPlayTimeStart(Date playTimeStart) {
        this.playTimeStart = playTimeStart;
    }

    public Ticket() {
    }

    public Ticket(Long id, String number, Date orderTime, Date takeTicketTime, Integer takeTicketStatus, String movieName, String cinemaName, String cinemaAddress, String cinemaPhone, Double ticketPrice, Date playTimeEnd, Date playTimeStart) {
        this.id = id;
        this.number = number;
        this.orderTime = orderTime;
        this.takeTicketTime = takeTicketTime;
        this.takeTicketStatus = takeTicketStatus;
        this.movieName = movieName;
        this.cinemaName = cinemaName;
        this.cinemaAddress = cinemaAddress;
        this.cinemaPhone = cinemaPhone;
        this.ticketPrice = ticketPrice;
        this.playTimeEnd = playTimeEnd;
        this.playTimeStart = playTimeStart;
    }

    @Override
    public String toString() {
        return "ticket{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", orderTime=" + orderTime +
                ", takeTicketTime=" + takeTicketTime +
                ", takeTicketStatus=" + takeTicketStatus +
                ", movieName='" + movieName + '\'' +
                ", cinemaName='" + cinemaName + '\'' +
                ", cinemaAddress='" + cinemaAddress + '\'' +
                ", cinemaPhone='" + cinemaPhone + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", playTimeEnd=" + playTimeEnd +
                ", playTimeStart=" + playTimeStart +
                '}';
    }
}
