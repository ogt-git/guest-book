package com.edu.guestbook.repository;

import com.edu.guestbook.domain.GuestBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<GuestBook, Integer> {
}
