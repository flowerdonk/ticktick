package com.test.business.schedule.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleSummaryDto {

    private Long id;
    private LocalDateTime time;
}
