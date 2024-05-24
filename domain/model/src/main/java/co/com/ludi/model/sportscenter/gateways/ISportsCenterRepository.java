package co.com.ludi.model.sportscenter.gateways;

import co.com.ludi.model.sportscenter.SportsCenter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ISportsCenterRepository {
    Mono<SportsCenter> save (SportsCenter sportsCenter);
    Mono<SportsCenter> findById (String id);
    Flux<SportsCenter> findAll();
}
