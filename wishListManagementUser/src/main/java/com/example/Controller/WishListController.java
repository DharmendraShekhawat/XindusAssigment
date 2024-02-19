package com.example.Controller;

import com.example.Model.WishListItem;
import com.example.Service.WishListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WishListController {

    @Autowired
    private WishListService wishListService;



    @PostMapping("/wishlistMyUser/item")
    public WishListItem addWishListItem(@RequestBody WishListItem wishListItem){
        return wishListService.addWishListItem(wishListItem);
    }


    @DeleteMapping("/wishlistMyUser/item")
    public String deleteWishlistItem(@RequestParam Integer id){
        return wishListService.deleteWishlistItem(id);
    }

    @GetMapping("/wishlistMyUser/myUser")
    public List<WishListItem> getWishListOfUser(@RequestParam Integer userId){
        return wishListService.getWishListOfUser(userId);
    }
}
