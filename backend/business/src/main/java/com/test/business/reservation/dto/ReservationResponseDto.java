package com.test.business.reservation.dto;

import com.test.business.reservation.domain.ReservationStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationResponseDto {

    private Long id;
    private String username;
    private String eventTitle;
    private LocalDateTime scheduleTime;
    private String seatNumber;
    private String grade;
    private ReservationStatus status;
}
