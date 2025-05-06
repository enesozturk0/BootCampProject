package com.BootCampProject.repository;


import com.BootCampProject.entity.Applicant;
import com.BootCampProject.entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application,Integer> {
    List<Application> findByApplicantId(int applicantId);


}
