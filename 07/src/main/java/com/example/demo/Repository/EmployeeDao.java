package com.example.demo.Repository;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.example.demo.Model.Employee;

import org.springframework.util.ResourceUtils;

public class EmployeeDao extends Dao<Employee> {

    @Override
    public void readCSV(String csvFile) {
        try {
            File file = ResourceUtils.getFile("classpath:static/" + csvFile);
            CsvMapper mapper = new CsvMapper(); // Dùng để ánh xạ cột trong CSV với từng trường trong POJO
            CsvSchema schema = CsvSchema.emptySchema().withHeader().withColumnSeparator(','); // Dòng đầu tiên sử dụng
                                                                                              // làm Header
            ObjectReader oReader = mapper.readerFor(Employee.class).with(schema); // Cấu hình bộ đọc CSV phù hợp với
                                                                                  // kiểu
            Reader reader = new FileReader(file);
            MappingIterator<Employee> mi = oReader.readValues(reader); // Iterator đọc từng dòng trong file
            while (mi.hasNext()) {
                Employee employee = mi.next();
                this.add(employee);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }
    public EmployeeDao(String csvFile){
        this.readCSV(csvFile);
    }

    @Override
    public List<Employee> getAll() {

        return collections;
    }

    @Override
    public Optional<Employee> get(int id) {    
        return collections.stream().filter(u -> u.getId() == id).findFirst();
    }

    @Override
    public void add(Employee employee) {
        int id;
        if (collections.isEmpty()) {
            id = 1;
        } else {
            Employee lastemployee = collections.get(collections.size() - 1);
            id = lastemployee.getId() + 1;
        }
        employee.setId(id);
        collections.add(employee);
    }

    @Override
    public void update(Employee employee) {
    get(employee.getId()).ifPresent(existemployee -> {
            existemployee.setFirst_name(employee.getFirst_name());
            existemployee.setLast_name(employee.getLast_name());
            existemployee.setEmail(employee.getEmail());
            existemployee.setId_card(employee.getId_card());
          }); 

    }

    @Override
    public void deleteByID(int id) {
        get(id).ifPresent(existemployee -> collections.remove(existemployee));

    }

    @Override
    public void delete(Employee t) {
        deleteByID(t.getId());
    }

    @Override
  public List<Employee> searchByKeyword(String keyword) {
    //Tham khảo chi tiết ở đây nhé. Đây là Lambda Expression có từ Java 8.
    //https://www.baeldung.com/java-stream-filter-lambda  
    return collections
    .stream()
    .filter(employee -> employee.matchWithKeyword(keyword))
    .collect(Collectors.toList());
  }
}
