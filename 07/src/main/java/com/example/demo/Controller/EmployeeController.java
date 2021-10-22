package com.example.demo.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import java.util.Optional;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeDao;
import com.example.demo.request.SearchRequest;

@Controller
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping
    public String listAll(Model model) {
    model.addAttribute("employees", employeeDao.getAll());
    return "index";
    }
    @GetMapping(value = "/{id}")
  public String getByID(@PathVariable("id") int id, Model model) {
    Optional<Employee> employee = employeeDao.get(id);
    if (employee.isPresent()) {
      model.addAttribute("employee", employee.get());
    }    
    return "detail";
  }  
  @GetMapping("/add")
  public String add(Model model) {
    model.addAttribute("employee", new Employee()); 
    return "form";
  }


  @PostMapping("/save")
  public String save(Employee employee, BindingResult result) {
    if (result.hasErrors()) {
      return "form";
    }
    if (employee.getId() > 0) { 
      employeeDao.update(employee);
    } else { 
      employeeDao.add(employee);
    }

    return "redirect:/";
  }

  @GetMapping(value = "/edit/{id}")
  public String editBookId(@PathVariable("id") int id, Model model) {
    Optional<Employee> employee = employeeDao.get(id);
    if (employee.isPresent()) {
      model.addAttribute("employee", employee.get());
    }
    return "form";
  }

  @GetMapping(value = "/delete/{id}")
  public String deleteByID(@PathVariable("id") int id) {    
    employeeDao.deleteByID(id);        
    return "redirect:/";
  }

  @GetMapping("/search")
  public String searchForm(Model model) { 
    model.addAttribute("searchrequest", new SearchRequest());   
    return "search";
  }
  @PostMapping("/search")
  public String searchByKeyword(@ModelAttribute("request") SearchRequest request, BindingResult bindingResult, Model model) {
    if (!bindingResult.hasFieldErrors()) {
      model.addAttribute("employees", employeeDao.searchByKeyword(request.getKeyword()));
    }    
    return "index";
  }


}
