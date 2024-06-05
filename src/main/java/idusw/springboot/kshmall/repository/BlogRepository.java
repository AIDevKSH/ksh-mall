package idusw.springboot.kshmall.repository;

import idusw.springboot.kshmall.entity.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<BlogEntity, Long> {
    // extends : interface를 상속
}
