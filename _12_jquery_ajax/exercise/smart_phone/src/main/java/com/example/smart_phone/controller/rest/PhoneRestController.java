package com.example.smart_phone.controller.rest;

import com.example.smart_phone.model.Phone;
import com.example.smart_phone.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("phone")
public class PhoneRestController {

    @Autowired
    private PhoneService phoneService;


    @PostMapping
    public ResponseEntity<Phone> createSmartphone(@RequestBody Phone phone) {
        if (phone.getId() != null) {
            update(phone);
        }
        return new ResponseEntity<>(phoneService.save(phone), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<Iterable<Phone>> allPhones() {
        return new ResponseEntity<>(phoneService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return new ResponseEntity<>(phoneService.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Phone> deleteSmartphone(@PathVariable Long id) {
        Optional<Phone> smartphoneOptional = phoneService.findById(id);
        if (!smartphoneOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        phoneService.remove(id);
        return new ResponseEntity<>(smartphoneOptional.get(), HttpStatus.NO_CONTENT);
    }

    @PutMapping("")
    public ResponseEntity<Phone> update(Phone phonee) {
        Optional<Phone> phone = phoneService.findById(phonee.getId());
        if (!phone.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(phoneService.save(phonee), HttpStatus.OK);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Phone> update(@PathVariable Long id, @RequestBody Phone phonee) {
//        Optional<Phone> phone = phoneService.findById(id);
//        if (!phone.isPresent()) {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//        phonee.setId(id);
//        return new ResponseEntity<>(phoneService.save(phonee), HttpStatus.OK);
//    }
}
