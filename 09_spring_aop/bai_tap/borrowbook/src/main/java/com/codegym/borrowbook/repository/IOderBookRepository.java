package com.codegym.borrowbook.repository;

import com.codegym.borrowbook.model.Book;
import com.codegym.borrowbook.model.OderBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IOderBookRepository extends JpaRepository<OderBook, Integer> {
    @Query(value = "select * from oder_book ", nativeQuery = true)
    Page<Book> findAllOderBook(Pageable pageable);

    @Modifying
    @Query(value = "insert into oder_book values (:id,:idBook)", nativeQuery = true)
    void create(@Param("id") String id, @Param("idBook") String idBook);

    @Query(value = "select * from oder_book where id = :id", nativeQuery = true)
    OderBook findByIdOder(@Param("id") String id);

//    @Modifying
//    @Query(value = "insert into oder_book values (:id,:idBook)", nativeQuery = true)
//    void delete(@Param("id") String id,@Param("idBook") String idBook);

}
