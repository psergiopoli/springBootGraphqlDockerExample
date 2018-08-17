package br.com.psergiopoli.backend.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import br.com.psergiopoli.backend.model.Address;
import org.springframework.transaction.annotation.Transactional;

public interface AddressRepository extends CrudRepository<Address, Long> {

    @Transactional(timeout = 10)
    Page<Address> findAll(Pageable pageRequest);

}