package co.com.bancolombia.crudcontroller;

import co.com.bancolombia.model.usermodel.UserModel;
import co.com.bancolombia.usecase.user.UserUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CrudController {

    private final UserUseCase userUseCase;

    @PostMapping("/save")
    public String save(@RequestBody UserModel userModel){
        userUseCase.saveUser(userModel);
        return "Registro guardado";
    }

    @GetMapping("/findallusers")
    public List<UserModel> findAll() {
        return userUseCase.listAllUsers();
    }

    @GetMapping("/finduser/{id}")
    public UserModel finduser(@PathVariable(value = "id") Integer id) {
        return userUseCase.findUser(id);
    }

    @PostMapping("/update")
    public String update(@RequestBody UserModel userModel){
        userUseCase.update(userModel);
        return "Registro actualizado";
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable(value = "id") Integer id){
        userUseCase.delete(id);
        return "Registro borrado";
    }
}
