package guru.springframework.services;

import guru.springframework.models.Owner;


public interface OwnerService extends CrudService<Owner, Long>  {

    Owner findByLastName(String lastName);

}
