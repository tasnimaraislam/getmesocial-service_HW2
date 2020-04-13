package com.example.getmesocialservice.repository;

import com.example.getmesocialservice.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getUser(){
        User user =new User("Tasnim", "usa", 26, "https://www.google.com/url?sa=i&url=https%3A%2F%2Fpixabay.com%2Fimages%2Fsearch%2Fnature%2F&psig=AOvVaw36twUa3LDSadPmg3_EMbWC&ust=1586901194907000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCJCOieyx5ugCFQAAAAAdAAAAABAD");
        return user;
    }
}
