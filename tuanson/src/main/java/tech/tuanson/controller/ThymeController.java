package tech.tuanson.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tech.tuanson.entity.Employee;
import tech.tuanson.repository.DAO;
import tech.tuanson.service.SearchRequest;

@Controller
@RequestMapping
public class ThymeController {
    @Autowired
    private DAO<Employee> employeeDAO;

    @GetMapping(value = { "/", "/home" })
    public String getHome(Model model) {
        model.addAttribute("title", "Homepage");
        return "index";
    }

    @GetMapping("/list")
    public String getEmpList(Model model) {
        model.addAttribute("title", "List of Employee");
        model.addAttribute("list", employeeDAO.getAll());
        return "list";
    }

    @GetMapping("/view/{id}")
    public String empView(@PathVariable(value = "id") int ID, Model model) {
        Optional<Employee> selectEmp = employeeDAO.getByID(ID);
        if (selectEmp.isPresent()) {
            String title = String.join(" ", "Employee ID:", String.valueOf(selectEmp.get().getId()));
            model.addAttribute("title", title);
            model.addAttribute("emp", selectEmp.get());
            return "view";
        } else {
            return "index";
        }
    }

    @GetMapping("/edit/{id}")
    public String empEditForm(@PathVariable(value = "id") int ID, Model model) {
        Optional<Employee> selectEmp = employeeDAO.getByID(ID);
        if (selectEmp.isPresent()) {
            String title = String.join(" ", "Edit employee ID:", String.valueOf(selectEmp.get().getId()));
            model.addAttribute("title", title);
            model.addAttribute("emp", selectEmp.get());
            return "edit";
        } else {
            return "index";
        }
    }

    @PostMapping("/edited")
    public String empEdit(@ModelAttribute(value = "emp") Employee editedEmployee, BindingResult result) {
        employeeDAO.update(editedEmployee);
        return "redirect:/list";
    }

    @GetMapping("/create")
    public String empCreateForm(Model model) {
        model.addAttribute("title", "Create new Employee");
        model.addAttribute("emp", new Employee());
        return "add";
    }

    @PostMapping("create")
    public String empCreate(@ModelAttribute(value = "emp") Employee newEmployee, BindingResult result) {
        if (result.hasErrors()) {
            return "add";
        }
        employeeDAO.add(newEmployee);
        return "redirect:/list";
    }

    @GetMapping("/delete/{id}")
    public String empDeleteForm(@PathVariable(value = "id") int ID, Model model) {
        Optional<Employee> selectEmp = employeeDAO.getByID(ID);
        if (selectEmp.isPresent()) {
            String title = String.join(" ", "Delete employee ID:", String.valueOf(selectEmp.get().getId()));
            model.addAttribute("title", title);
            model.addAttribute("emp", selectEmp.get());
        }
        return "delete";
    }

    @PostMapping("/delete")
    public String empDelete(@ModelAttribute(value = "emp") Employee deletedEmployee, BindingResult result) {
        employeeDAO.delete(deletedEmployee);
        return "redirect:/list";
    }

    @GetMapping("/search")
    public String empSearch(Model model) {
        model.addAttribute("title", "Searhcing");
        model.addAttribute("searchReq", new SearchRequest());
        return "search";
    }

    @PostMapping("/search")
    public String empSearchResult(@ModelAttribute(value = "searchReq") SearchRequest search, Model model) {
        model.addAttribute("title", "Searching");
        model.addAttribute("list", employeeDAO.sort(search));
        return "search";
    }
}
