package com.test.business.seat.domain;

import com.test.business.reservation.domain.Reservation;
import com.test.business.schedule.domain.Schedule;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String seatNumber;
    private String grade;
    private boolean available;

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule;

    @OneToMany(mappedBy = "seat", cascade = CascadeType.ALL)
    private List<Reservation> reservations;

}
