package com.test.business.event.dto;

import com.test.business.schedule.dto.ScheduleSummaryDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EventResponseDto {

    private Long id;
    private String title;
    private String description;
    private String venueName;
    private List<ScheduleSummaryDto> schedules;
}
