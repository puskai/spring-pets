package hu.puskai.dog;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dogs", path = "dogs")
public interface DogRepository extends JpaRepository<Dog, Long> {

}
