package med.voll.api.controller;

import med.voll.api.doctor.Doctors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctors")
public class DoctorsController {

  @PostMapping()
  public void register(@RequestBody Doctors data) {
    System.out.println(data);
  }

}