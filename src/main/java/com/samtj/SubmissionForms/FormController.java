package com.samtj.SubmissionForms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class FormController {
    @Autowired
    CustomersRepo repo;

    @RequestMapping("/")
    public String details() {
        return "form";
    }

    @RequestMapping("/details")
    public String details(Customers customers) {
        repo.save(customers);
        return "form";
    }

    @RequestMapping("/getdetails")
    public String getdetails() {
        return "view";
    }

    @PostMapping("/getdetails")
    public ModelAndView getdetails(@RequestParam int cid)
    {
       ModelAndView mv = new ModelAndView("retrieve");
       Customers customers = repo.findById(cid).orElse(null);
       mv.addObject(customers);
       return mv;
    }

    @RequestMapping("/customers")
    @ResponseBody
    public List<Customers> getCustomers() {
        return repo.findAll();
    }

    @RequestMapping("/customers/{cid}")
    @ResponseBody
    public Optional<Customers> getOneCustomer(@PathVariable("cid") int cid) {
        return repo.findById(cid);
    }

    @PostMapping("/customers")
    public Customers saveCustomer(@RequestBody Customers customers) {
        repo.save(customers);
        return customers;
    }

    @DeleteMapping("/customers/{cid}")
    public Customers deleteCustomer(@PathVariable("cid") int cid) {
        Customers cust = repo.getOne(cid);
        return cust;
    }

    @PutMapping(path = "/customers", consumes = {"application/json"})
    public Customers editCustomer(@RequestBody Customers customers) {
        repo.save(customers);
        return customers;
    }
}
