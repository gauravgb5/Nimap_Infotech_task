package category.product.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import category.product.entityClasses.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer> {
}
