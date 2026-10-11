
package com.quickfix.backend.controller;

import com.quickfix.backend.entity.ServiceCategory;
import com.quickfix.backend.repository.ServiceCategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class ServiceCategoryController {

    private final ServiceCategoryRepository repository;

    public ServiceCategoryController(
            ServiceCategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<ServiceCategory> getAllCategories() {
        return repository.findAll();
    }
}
