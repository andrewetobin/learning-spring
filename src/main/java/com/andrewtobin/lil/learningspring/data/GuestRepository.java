package com.andrewtobin.lil.learningspring.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository  extends JpaRepository<Guest, Long> {

}
