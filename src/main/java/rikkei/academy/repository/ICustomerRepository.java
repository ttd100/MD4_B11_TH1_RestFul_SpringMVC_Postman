package rikkei.academy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import rikkei.academy.model.Customer;

public interface ICustomerRepository extends
        PagingAndSortingRepository<Customer,Long> {
}
