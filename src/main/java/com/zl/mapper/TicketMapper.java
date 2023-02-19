package com.zl.mapper;


import com.zl.entity.Ticket;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

@Mapper
public interface TicketMapper {

    /**
     * 电影票信息查询
     *
     * @param number
     * @return
     */
    Ticket queryTicket(String number);

    /**
     * 修改电影票取票状态
     *
     * @param status
     * @param number
     * @return
     */
    Integer updateCinemaStatus(@Param("status") Integer status, @Param("number") String number);

    /**
     * 查询电影时长
     *
     * @param timeStart
     * @param timeEnd
     * @param number
     * @return
     */
    Integer totalTime(@Param("timeStart") Date timeStart, @Param("timeEnd") Date timeEnd, @Param("number") String number);

}
