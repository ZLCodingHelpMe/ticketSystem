package com.zl.service;

import com.zl.dto.TicketDto;

public interface TicketService {

    TicketDto info(String number);

    Integer changeStatus(Integer status, String number);


}
