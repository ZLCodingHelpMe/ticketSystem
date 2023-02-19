package com.zl.web.controller;

import com.zl.dto.Result;
import com.zl.dto.ResultUtils;
import com.zl.dto.TicketDto;
import com.zl.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {

    TicketService ticketService;

    @Autowired
    public void setTicketService(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @GetMapping("/info")
    public Result<TicketDto> info(String number) {

        TicketDto info = ticketService.info(number);

        if (info == null) {

            return ResultUtils.returnFail("电影票不存在");

        }
        return ResultUtils.returnDataSuccess(info);
    }

    @PostMapping("/changeStatus")
    public Result changeStatus(Integer status, String number) {

        Integer changeStatus = ticketService.changeStatus(status, number);

        if (changeStatus <= 0) {
            return ResultUtils.returnFail("取票异常");
        }

        return ResultUtils.returnSuccess("取票成功");


    }

}
