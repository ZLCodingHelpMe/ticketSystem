package com.zl.service;

import com.zl.dto.TicketDto;
import com.zl.entity.Ticket;
import com.zl.mapper.TicketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TicketServiceImpl implements TicketService {

    TicketMapper ticketMapper;

    @Autowired
    public void setTicketMapper(TicketMapper ticketMapper) {
        this.ticketMapper = ticketMapper;
    }

    @Override
    public TicketDto info(String number) {
        //查询电影票信息
        Ticket ticket = ticketMapper.queryTicket(number);

        if (ticket == null) {
            return null;
        }

        TicketDto ticketDto = new TicketDto(ticket);
        //影片时长
        ticketDto.setTotalTime(ticketMapper.totalTime(ticket.getPlayTimeStart(), ticket.getPlayTimeEnd(), number));
        //当前时间到开始放映时间
        Integer startTime = ticketMapper.totalTime(new Date(), ticket.getPlayTimeStart(), number);
        //当前时间到结束放映时间
        Integer endTime = ticketMapper.totalTime(new Date(), ticket.getPlayTimeEnd(), number);
        //距离开始放映时间
        if (startTime > 0 && startTime <= 60 * 24) {
            ticketDto.setMinuteToStartPlay(startTime);
        }

        if (startTime > 0) {
            ticketDto.setStatus("未开始");
        }
        if (startTime <= 0 && endTime > 0) {
            ticketDto.setStatus("放映中");
        }
        if (startTime <= 0) {
            ticketDto.setStatus("放映完毕");
        }

        return ticketDto;
    }

    @Override
    public Integer changeStatus(Integer status, String number) {

        Integer integer = ticketMapper.updateCinemaStatus(status, number);

        return integer;
    }
}
