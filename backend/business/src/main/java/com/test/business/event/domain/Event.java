package com.test.business.event.domain;

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
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String title;
    private String description;
    private String venue;

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
