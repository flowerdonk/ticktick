package com.test.business.schedule.dto;

import com.test.business.seat.dto.SeatDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleDetailDTO {

    private Long id;
    private LocalDateTime time;
    private String eventTitle;
    private List<SeatDto> seats;
}
