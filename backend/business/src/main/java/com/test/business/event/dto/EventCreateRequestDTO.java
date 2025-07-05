package com.test.business.event.dto;

import com.test.business.schedule.dto.ScheduleCreateDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventCreateRequestDTO {
    private String title;
    private String description;
    private Long venueId;
    private List<ScheduleCreateDTO> schedules;
}
