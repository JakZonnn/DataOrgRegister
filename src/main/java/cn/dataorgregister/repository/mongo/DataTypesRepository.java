package cn.dataorgregister.repository.mongo;
import cn.dataorgregister.entity.mongo.DataTypes;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataTypesRepository extends MongoRepository<DataTypes,String> {
}
