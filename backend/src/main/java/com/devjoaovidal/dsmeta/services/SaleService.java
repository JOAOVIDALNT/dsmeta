package com.devjoaovidal.dsmeta.services;

import com.devjoaovidal.dsmeta.entities.Sale;
import com.devjoaovidal.dsmeta.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public Page<Sale> findSales(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
