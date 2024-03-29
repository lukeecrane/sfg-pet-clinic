package guru.springframework.services.map;

import guru.springframework.models.Pet;
import guru.springframework.services.CrudService;

import java.util.Set;

public class PetServiceMap  extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    Pet save(Long id, Pet object) {
        return super.save(id, object);
    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(),pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);

    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}
