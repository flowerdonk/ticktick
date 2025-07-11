package com.test.business.venue.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VenueResponseDTO {

    private Long id;
    private String name;
    private String location;
    private List<VenueSeatDTO> seats;
}
