package co.com.ludi.usecase.sportsCenter;

import co.com.ludi.model.sportscenter.SportsCenter;
import co.com.ludi.model.sportscenter.gateways.ISportsCenterRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class GetSportsCenterUseCase {
    private final ISportsCenterRepository sportsCenterRepository;

    public Mono<SportsCenter> findSportsCenterById(String id) {
        return this.sportsCenterRepository.findById(id);
    }
    public Flux<SportsCenter> findAllSportsCenters() {
        return this.sportsCenterRepository.findAll();
    }
}
