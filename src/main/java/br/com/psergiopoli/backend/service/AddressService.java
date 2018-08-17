package br.com.psergiopoli.backend.service;

import br.com.psergiopoli.backend.model.Address;
import br.com.psergiopoli.backend.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Page<Address> listAll(int page, int size) {
        PageRequest pr = PageRequest.of(page, size);
        return addressRepository.findAll(pr);
    }

    public Address getAddress(long id) {
        Optional<Address> address = addressRepository.findById(id);
        if (address.isPresent()) {
            return address.get();
        } else {
            return null;
        }
    }

    public Address createAddress(String zipCode) {
        Address address = new Address();
        address.setZipCode(zipCode);
        addressRepository.save(address);
        return address;
    }
}
