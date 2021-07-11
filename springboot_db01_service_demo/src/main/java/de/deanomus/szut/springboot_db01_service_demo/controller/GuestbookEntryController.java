package de.deanomus.szut.springboot_db01_service_demo.controller;

import de.deanomus.szut.springboot_db01_service_demo.mapper.GuestbookEntryMapper;
import de.deanomus.szut.springboot_db01_service_demo.model.GuestbookEntry;
import de.deanomus.szut.springboot_db01_service_demo.request.GuestbookEntryRequest;
import de.deanomus.szut.springboot_db01_service_demo.service.GuestbookEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/guestbook")
public class GuestbookEntryController {

    @Autowired
    public GuestbookEntryService service;

    @Autowired
    private GuestbookEntryMapper mapper;

    public ResponseEntity<GuestbookEntryRequest> addGuestbookEntry(@RequestBody GuestbookEntryRequest request) {
        GuestbookEntry guestbookEntryRequest = mapper.mapRequestToModel(request);
        GuestbookEntry guestbookEntryResponse = service.create(guestbookEntryRequest);
        return new ResponseEntity<>(mapper.mapModelToResponse(guestbookEntryResponse), HttpStatus.CREATED);
    }

    // public ResponseEntity<GuestbookEntry> getGuestbookEntry() TODO: Finish this

}
