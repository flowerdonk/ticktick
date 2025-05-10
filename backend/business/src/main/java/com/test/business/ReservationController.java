package com.test.business;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@RestController
public class ReservationController {

    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private int seat = 0;

    @GetMapping("/init")
    public ResponseEntity<String> init() {
        // 5초 후 변수 1로 설정
        scheduler.schedule(() -> {
            System.out.println("5초 후 변수 1로 설정");
            seat = 1;
        }, 5, TimeUnit.SECONDS);

        // 즉시 응답
        return ResponseEntity.ok("요청을 수신했습니다. 변수는 잠시 후 1로 설정됩니다.");
    }

    @GetMapping("/reserve")
    public String reserve() {
        if (seat == 0) {
            seat = 1;
            return "success";
        }
        return "fail";
    }

    @GetMapping("/value")
    public int value() {
        return seat;
    }

    @GetMapping("/reset")
    public void reset() {
        seat = 0;
    }
}
