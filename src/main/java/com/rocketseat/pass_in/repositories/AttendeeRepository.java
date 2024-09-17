package com.rocketseat.pass_in.repositories;

import com.rocketseat.pass_in.domain.attendee.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendeeRepository extends JpaRepository<Attendee, String> {
}
