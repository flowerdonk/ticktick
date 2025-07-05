package com.test.business.event.domain;

import com.test.business.schedule.domain.Schedule;
import com.test.business.venue.domain.Venue;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "venue_id")
    private Venue venue;

    @ToString.Exclude
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Schedule> schedules;

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", venue='" + venue + '\'' +
                ", schedules=" + schedules +
                '}';
    }
}
