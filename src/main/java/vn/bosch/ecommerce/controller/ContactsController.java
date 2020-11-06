package vn.bosch.ecommerce.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.bosch.ecommerce.dto.ContactDto;
import vn.bosch.ecommerce.model.response.ResponseModel;
import vn.bosch.ecommerce.model.request.RequestContactModel;
import vn.bosch.ecommerce.service.ContactsService;

@RestController
@RequestMapping("api/contacts")
public class ContactsController {
    @Autowired
    ContactsService service;

    @GetMapping
    public ResponseEntity<ResponseModel> getContact(@RequestParam("id") Long id, RequestContactModel request){
        if (request == null){
            ResponseModel response = new ResponseModel("success", service.getContact(request.getEmail()));
            return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
        } else {
            if (service.getContact(request.getEmail()) != null) {
                ResponseModel response = new ResponseModel("success", service.getContact(request.getEmail()));
                return new ResponseEntity<ResponseModel>(response, HttpStatus.OK);
            } else {
                ResponseModel response = new ResponseModel("fail", service.getContact(request.getEmail()));
                return new ResponseEntity<ResponseModel>(response, HttpStatus.NOT_FOUND);
            }
        }
    }
    @PostMapping
    public ResponseEntity<ResponseModel> createContact(@RequestBody RequestContactModel request){
        ContactDto contact = new ContactDto();
        BeanUtils.copyProperties(request,contact);
        ContactDto createdContact = service.createContact(contact);
        return new ResponseEntity<ResponseModel>(new ResponseModel("success",createdContact), HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<ResponseModel> updateContact(@RequestParam Long id, @RequestBody RequestContactModel contactData){
        ContactDto contact = new ContactDto();
        BeanUtils.copyProperties(contactData,contact);
        contact.setContactId(id);
        ContactDto updatedContact = service.updateContact(contact);
        return new ResponseEntity<ResponseModel>(new ResponseModel("success",updatedContact), HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<ResponseModel> deleteContact(@RequestParam Long id){
        service.deleteContact(id);
        String status = "Delete user with id: " + id.toString();
        return new ResponseEntity<ResponseModel>(new ResponseModel("success",status), HttpStatus.OK);
    }


}
