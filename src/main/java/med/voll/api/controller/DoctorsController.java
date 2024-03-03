package med.voll.api.controller;

import med.voll.api.doctor.Doctor;
import med.voll.api.doctor.DoctorRepository;
import med.voll.api.doctor.Doctors;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorsController {

  @Autowired
  private DoctorRepository repository; // dependency injection

  @PostMapping()
  public void register(@RequestBody Doctors data) {
    repository.save(new Doctor(data));
  }

}