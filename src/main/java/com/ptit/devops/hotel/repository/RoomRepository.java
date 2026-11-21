package com.ptit.devops.hotel.repository;

import com.ptit.devops.hotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
