package co.com.bancolombia.usecase.user;

import co.com.bancolombia.model.usermodel.UserModel;
import co.com.bancolombia.model.usermodel.gateways.UserModelRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserUseCase {

    private final UserModelRepository userModelRepository;

    public void saveUser (UserModel userModel){
        userModelRepository.saveUser(userModel);
    }

    public List<UserModel> listAllUsers(){
        return userModelRepository.listAllUsers();
    }

    public UserModel findUser(Integer id){
        return userModelRepository.findUser(id);
    }

    public void delete(Integer id){
        userModelRepository.delete(id);
    }

    public UserModel update(UserModel userModel){
        return userModelRepository.update(userModel);
    }
}
