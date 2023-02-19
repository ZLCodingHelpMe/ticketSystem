package com.zl;

import com.zl.entity.Ticket;
import com.zl.mapper.TicketMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TicketSystemApplicationTests {

    TicketMapper ticketMapper;

    @Autowired
    public void setTicketMapper(TicketMapper ticketMapper) {
        this.ticketMapper = ticketMapper;
    }

    @Test
    public void test() {

        Ticket ticket = ticketMapper.queryTicket("12345678");
        System.out.println(ticket);
    }

    @Test
    public void test01() {

        Integer integer = ticketMapper.updateCinemaStatus(1, "52345678");
        System.out.println(integer);
    }

    @Test
    public void test02() {
        Ticket ticket = ticketMapper.queryTicket("12345678");
        System.out.println(ticket);
        Integer integer = ticketMapper.totalTime(ticket.getPlayTimeStart(), ticket.getPlayTimeEnd(), "12345678");
        System.out.println(integer);


    }

}
