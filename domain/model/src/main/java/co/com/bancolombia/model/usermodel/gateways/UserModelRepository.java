package co.com.bancolombia.model.usermodel.gateways;

import co.com.bancolombia.model.usermodel.UserModel;
import java.util.List;


public interface UserModelRepository {

    void saveUser (UserModel userModel);

    List<UserModel> listAllUsers();

    UserModel findUser(Integer id);

    void delete(Integer id);

    UserModel update(UserModel userModel);

}
