package com.test.business.seat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeatCreateDTO {
    private String seatNumber;
    private String grade;
}
