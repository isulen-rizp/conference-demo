package com.pluralsight.conferencedemo.repositories;

import com.pluralsight.conferencedemo.models.Speaker;
import com.sun.org.omg.CORBA.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker,Long> {
}
