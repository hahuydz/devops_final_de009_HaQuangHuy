package com.ptit.devops.hotel.controller;

import com.ptit.devops.hotel.entity.Room;
import com.ptit.devops.hotel.repository.RoomRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoomController {

    private final RoomRepository repository;

    public RoomController(RoomRepository repository) {
        this.repository = repository;
    }

    /** GET /api/rooms - danh sách phòng khách sạn */
    @GetMapping("/rooms")
    public List<Room> findAll() {
        return repository.findAll(Sort.by("id"));
    }
}
