package com.harsh.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService){
        this.notificationService = notificationService;
        this.userRepository =  userRepository;
    }
    public void registerUser(User user){
        userRepository.save(user);
        notificationService.send("You are successfully registered", user.getEmail());
    }
}
