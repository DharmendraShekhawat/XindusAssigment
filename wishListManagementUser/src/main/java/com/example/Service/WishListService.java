package com.example.Service;

import com.example.CustomeExceptions.MyUserNotFoundException;
import com.example.Model.MyUser;
import com.example.Model.WishListItem;
import com.example.Repository.MyUserRepository;
import com.example.Repository.WishListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WishListService {

    @Autowired
    private WishListRepository wishListRepository;


    @Autowired
    private MyUserRepository myUserRepository;



    public WishListItem addWishListItem(WishListItem wishListItem){
        return wishListRepository.save(wishListItem);
    }

    public String deleteWishlistItem(Integer id){
        WishListItem wishListItem = wishListRepository.findById(id).orElse(null);


        if(wishListItem == null){
            return "Invalid item id..please provide valid item id..";
        }

        wishListRepository.delete(wishListItem);
        return "Item deleted successfully..";
    }

    public List<WishListItem> getWishListOfUser(Integer userId) {
        MyUser myUser = myUserRepository.findById(userId).orElseThrow( () -> new MyUserNotFoundException("User with id "+userId+" is not exists.."));
        List<WishListItem>  itemsOfUser = wishListRepository.findByMyUser(myUser);
        return itemsOfUser;
    }
}
