package com.example.Repository;

import com.example.Model.MyUser;
import com.example.Model.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishListRepository extends JpaRepository<WishListItem , Integer> {

    List<WishListItem> findByMyUser(MyUser myUser);
}
