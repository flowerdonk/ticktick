package com.test.business.reservation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationRequestDTO {

    private Long userId;
    private Long scheduleId;
    private Long seatId;
}
