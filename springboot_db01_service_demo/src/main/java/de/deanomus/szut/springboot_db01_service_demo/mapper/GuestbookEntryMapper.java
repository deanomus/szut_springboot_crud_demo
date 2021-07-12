package de.deanomus.szut.springboot_db01_service_demo.mapper;

import de.deanomus.szut.springboot_db01_service_demo.model.GuestbookEntry;
import de.deanomus.szut.springboot_db01_service_demo.request.GuestbookEntryRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GuestbookEntryMapper {

    // TODO: Finish site 7

    // @Autowired
    public GuestbookEntry mapRequestToModel(GuestbookEntryRequest request) {
        return null;
    }

    // @Autowired
    public GuestbookEntryRequest mapRequestToModel(long id, GuestbookEntryRequest request) {
        return null;
    }

    // @Autowired
    public GuestbookEntryRequest mapModelToResponse(GuestbookEntry model) {
        return null;
    }

}
