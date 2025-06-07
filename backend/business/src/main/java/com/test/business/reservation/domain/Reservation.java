package com.test.business.reservation.domain;

import com.test.business.schedule.domain.Schedule;
import com.test.business.seat.domain.Seat;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String userId; // 예약한 사용자 ID

    @ManyToOne
    @JoinColumn(name = "seat_id")
    private Seat seat; // 예약된 좌석

    @ManyToOne
    @JoinColumn(name = "schedule_id")
    private Schedule schedule; // 예약된 일정

    @Enumerated(EnumType.STRING)
    private ReservationStatus status; // 예약 상태 (예: PENDING, CONFIRMED, CANCELLED)

}
