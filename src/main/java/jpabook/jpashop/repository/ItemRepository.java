package jpabook.jpashop.repository;

import jpabook.jpashop.domain.item.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.stereotype.Repository;

/**
 * User: HolyEyE
 * Date: 2013. 12. 3. Time: 오후 9:48
 */

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {


}
