package co.com.bancolombia.jpa;

import co.com.bancolombia.jpa.helper.AdapterOperations;
import co.com.bancolombia.model.usermodel.UserModel;
import co.com.bancolombia.model.usermodel.gateways.UserModelRepository;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class JPARepositoryAdapter extends AdapterOperations<UserModel, User, Integer, JPARepository> implements UserModelRepository
// implements ModelRepository from domain
{

    public JPARepositoryAdapter(JPARepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.mapBuilder(d, UserModel.UserModelBuilder.class).build());
    }

    @Override
    public void saveUser(UserModel userModel) {
        this.save(userModel);
    }

    @Override
    public List<UserModel> listAllUsers() {
        return this.findAll();
    }

    @Override
    public UserModel findUser(Integer id) {
        return this.findById(id);
    }

    @Override
    public void delete(Integer id) {
        this.deleteById(id);
    }

    @Override
    public UserModel update(UserModel userModel) {
        return this.update(userModel);
    }


}
