package com.rocketseat.pass_in.repositories;

import com.rocketseat.pass_in.domain.checkin.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckInRepository extends JpaRepository<CheckIn, Integer> {
}
