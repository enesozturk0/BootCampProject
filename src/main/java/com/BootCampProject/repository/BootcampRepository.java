package com.BootCampProject.repository;

import com.BootCampProject.entity.BootCamp;
import com.BootCampProject.entity.enums.BootcampState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BootcampRepository extends JpaRepository<BootCamp,Integer> {
    List<BootCamp> findByBootcampState(BootcampState bootcampState);
}
