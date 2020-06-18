package com.swaroop.learningspring.data.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swaroop.learningspring.data.entity.Room;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
}
