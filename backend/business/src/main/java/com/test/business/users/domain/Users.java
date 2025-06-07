package com.test.business.users.domain;

import com.test.business.reservation.domain.Reservation;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id; // 사용자 ID

    private String username; // 사용자 이름
    private String email; // 사용자 이메일

    @OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
    private List<Reservation> reservations; // 사용자의 예약 목록

}
