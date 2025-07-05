package com.test.business.schedule.domain;

import com.test.business.event.domain.Event;
import com.test.business.seat.domain.Seat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime time;

    @ToString.Exclude
    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ToString.Exclude
    @OneToMany(mappedBy = "schedule", cascade = CascadeType.ALL)
    private List<Seat> seats = new ArrayList<>();


}

