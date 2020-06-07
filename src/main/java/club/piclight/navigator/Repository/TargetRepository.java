package club.piclight.navigator.Repository;

import club.piclight.navigator.Model.Target;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TargetRepository extends JpaRepository<Target, Long> {
    List<Target> findAll();
    void deleteById(Long id);
}
