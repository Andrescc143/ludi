package co.com.ludi.mongo.field;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;

public interface FieldRepository extends ReactiveMongoRepository<FieldData, String> {
}
