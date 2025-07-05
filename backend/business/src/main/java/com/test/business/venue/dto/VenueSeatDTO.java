package com.test.business.venue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueSeatDTO {

    private Long id;
    private String seatNumber;
    private String grade;
}
