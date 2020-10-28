package vn.bosch.ecommerce.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.bosch.ecommerce.dto.ContactDto;
import vn.bosch.ecommerce.model.request.UpdateContactRequetModel;
import vn.bosch.ecommerce.model.response.ResponseModel;
import vn.bosch.ecommerce.model.request.CreateContactRequestModel;
import vn.bosch.ecommerce.service.ContactsService;

@RestController
@RequestMapping("contacts")
public class ContactsController {
    @Autowired
    ContactsService service;

    @GetMapping
    public ResponseEntity<ResponseModel> getContact(@RequestHeader("email") String email){
        if(service.getContact(email) != null){
            ResponseModel response = new ResponseModel("success",service.getContact(email));
            return new ResponseEntity<ResponseModel>(response,HttpStatus.OK);
        }
        else{
            ResponseModel response = new ResponseModel("fail",service.getContact(email));
            return new ResponseEntity<ResponseModel>(response,HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping
    public ResponseEntity<ResponseModel> createContact(@RequestBody CreateContactRequestModel request){
        ContactDto contact = new ContactDto();
        BeanUtils.copyProperties(request,contact);
        ContactDto createdContact = service.createContact(contact);
        return new ResponseEntity<ResponseModel>(new ResponseModel("success",createdContact), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ResponseModel> updateContact(@RequestParam Long id, @RequestBody UpdateContactRequetModel contactData){
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
