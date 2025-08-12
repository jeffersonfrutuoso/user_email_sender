package dev.frutuoso.user.service;

import dev.frutuoso.user.domain.UserModel;
import dev.frutuoso.user.repositoy.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public UserModel create(UserModel userModel){
        return  userModel = userRepository.save(userModel);

    }

}
