package de.deanomus.szut.springboot_db01_service_demo.repository;

import de.deanomus.szut.springboot_db01_service_demo.model.GuestbookEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestbookEntryRepository extends JpaRepository<GuestbookEntry, Long> {





}
