package com.marco.example.DIORoomAngular.repository;


import com.marco.example.DIORoomAngular.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoomRepository extends JpaRepository<Room,Long> {
}
