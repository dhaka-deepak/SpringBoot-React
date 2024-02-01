package com.selflearning.Employee_System.controller;

import com.selflearning.Employee_System.model.Emp;
import com.selflearning.Employee_System.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@Controller
@RequestMapping("/api/v1")
public class EmpController {

    @Autowired
    private EmpService empService;

    @PostMapping("/save")
    public ResponseEntity<Emp> createEmp(@RequestBody @Valid Emp emp) {
        return new ResponseEntity<Emp>(empService.createEmp(emp), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public ResponseEntity<List<Emp>> getAllEmp() {
        return new ResponseEntity<List<Emp>>(empService.getAllEmp(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emp> getEmpById(@PathVariable int id) {
        return new ResponseEntity<Emp>(empService.getEmpById(id), HttpStatus.OK);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmp(@PathVariable int id) {

        empService.deleteEmp(id);
        return new ResponseEntity<String>("Delete Sucessfully", HttpStatus.OK);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Emp> updateEmp(@PathVariable int id, @RequestBody Emp emp) {
        return new ResponseEntity<Emp>(empService.updateEmp(id, emp), HttpStatus.OK);
    }

//    @PostMapping("/save")
//    public Emp createEmp(@RequestBody Emp emp) {
//        return empService.createEmp(emp);
//    }
//
//    @GetMapping("/")
//    public List<Emp> getAllEmp(){
//        return empService.getAllEmp();
//    }
//
//    @GetMapping("/{id}")
//    public Emp getEmpById(@PathVariable int id){
//        return empService.getEmpById(id);
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteEmp(@PathVariable int id){
//        empService.deleteEmp(id);
//        return "Deleted Successfully";
//    }
//
//    @PostMapping("/update/{id}")
//    public Emp updateEmp(@PathVariable int id, @RequestBody Emp emp){
//        return empService.updateEmp(id, emp);
//    }
}
